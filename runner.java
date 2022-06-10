//Estrutura de dados
// Alvaro Lima e Diogo Feld

public class runner {


    public static void main(String[] args) {
        Queue q = new Queue();
        q.insertNode(1,5);
        q.simplePush(2);
        q.simplePush(3);
        q.simplePush(4);
        q.simplePush(5);
        q.simplePush(6);
        q.simplePush(7);
        q.simplePush(8);
        q.printList();
        System.out.println("backwards");
        q.printBarckwardsList();

        q.insertNode(9,4);
        System.out.println("-------");
        q.printList();
        System.out.println("backwards");
        q.printBarckwardsList();
        System.out.println("size is: " +  q.getSize());


        // System.out.println("node value is :" + q.getNode( 6));
        // System.out.println("node value is :" + q.getNode( 2));


        // System.out.println("-------");
        // q.insertNode(10,6);
        // q.printList();
        // System.out.println("backwards");
        // q.printBarckwardsList();
        // System.out.println("size is: " +  q.getSize());
        // q.printList();

        // System.out.println("REMOVE");
        // System.out.println("node value is :" + q.getNode( 3));
        // q.removeNode(3);
        // q.printList();
        // System.out.println("backwards");
        // q.printBarckwardsList();
        // System.out.println("size is: " +  q.getSize());

        // System.out.println("REMOVE");
        // System.out.println("node value is :" + q.getNode( 6));
        // q.removeNode(6);
        // q.printList();
        // System.out.println("backwards");
        // q.printBarckwardsList();
        // System.out.println("size is: " +  q.getSize());

        // System.out.println("Clearing");
        // q.clear();
        // q.printList();
        // System.out.println("backwards");
        // q.printBarckwardsList();
        // System.out.println("size is: " +  q.getSize());

        //System.out.println(q.isEmpty());

        // System.out.println("node igual ha: " +q.get( 2));
        // System.out.println("O NODE é igual ha: " +q.getNode( 2).informacao);
        // System.out.println("Setter");
        // q.set(12,2);
        // System.out.println("node igual ha: " +q.get( 2));
        // System.out.println("O NODE é ha: " +q.getNode( 2).informacao);
        // System.out.println("lista é");
        // q.printList();
        // System.out.println("backwards");
        // q.printBarckwardsList();


        System.out.println("REMOVE");
        System.out.println("node value is :" + q.getNode( 6).informacao);
        Node aux =  q.getNode( 6);
        q.removeNode(aux);
        q.printList();
        System.out.println("backwards");
        q.printBarckwardsList();
        System.out.println("size is: " +  q.getSize());

    }
}