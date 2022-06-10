//Estrutura de dados
// Alvaro Lima e Diogo Feld

public class Queue {

    Node base;
    Node top;
    int size;

    public Queue() {
        this.base = null;
        this.top = null;
        this.size = 0;
    }

    public int simplePop(){
        if(this.top != null){
            int value = this.top.getInformacao();

            if(this.top.anterior != null){
                this.top = this.top.anterior;
                this.top.proximo = null;
            }
            else{
                this.top = null;
            }
            this.size--;
            return value;
        }
        else{
            return 0;
        }

    }

    public void simplePush(int value){
        if(this.base == null){
            Node n = new Node(value);
            this.top = n;
            this.base = n;
        }
        else{
            Node n = new Node(value);
            n.anterior = this.top;
            this.top.proximo = n;
            this.top = n;
        }
        this.size++;
    }

    public void insertNode(int value, int position){
        int counter  = 1;
        if(this.base == null){
            Node n = new Node(value);
            System.out.println("Sem base para ser inserido");
            this.base = n;
            this.top = n;

            size++;
        }
        else{
            if(this.size >= position ){
                int metade = this.size/2;
                if(position <= metade){
                    Node newNode = new Node(value);
                    Node aux = this.base;

                    while(counter < position){
                        aux = aux.proximo;
                        counter++;
                    }

                    newNode.anterior = aux.anterior;
                    aux.anterior.proximo = newNode;
                    newNode.proximo = aux;
                    aux.anterior =  newNode;
                }
                else{
                    Node newNode = new Node(value);
                    Node aux = this.top;

                    int steps = this.size - position;
                    counter = 0;

                    while(counter < steps){
                        aux = aux.anterior;
                        counter++;
                    }
                    newNode.anterior = aux.anterior;
                    aux.anterior.proximo = newNode;
                    newNode.proximo = aux;
                    aux.anterior =  newNode;
                }
                size++;
            }
            else{
                System.out.println("posição fora da lista");
                simplePush(value);
            }
        }
    }



    public void removeNode(int position) {
        int counter = 1;
        if(this.base == null) {
            System.out.println("Lista esta vazia");
        }
        if(this.size >= position ){
            int metade = this.size/2;
            if(position <= metade){
                if(position <= 1){
                    this.top = null;
                    this.base = null;
                }
                else{
                    Node aux = this.base;

                    while(counter < position){
                        aux = aux.proximo;
                        counter++;
                    }
                    aux.proximo.anterior = aux.anterior;
                    aux.anterior.proximo = aux.proximo;
                }
            }
            else{
                Node aux = this.top;
                int steps = this.size - position;
                counter = 0;

                while(counter < steps){
                    aux = aux.anterior;
                    counter++;
                }
                aux.proximo.anterior = aux.anterior;
                aux.anterior.proximo = aux.proximo;
            }
            size--;
        }
        else{
            System.out.println("posição fora da lista, ultimo elemento sendo retirado");
            simplePop();
        }

    }

    public void printList(){
        if(this.base == null) {
            System.out.println("Sem elementos na lista");
        }
        else {
            Node n = this.base;
            System.out.println(n.getInformacao());
            while(n.getProximo() != null){
                n = n.getProximo();
                System.out.println(n.getInformacao());
            }
        }
    }

    public void printBarckwardsList(){
        if(this.top == null) {
            System.out.println("Sem elementos na lista");
        }
        else {
            Node n = this.top;
            System.out.println(n.getInformacao());
            while(n.getAnterior() != null){
                n = n.getAnterior();
                System.out.println(n.getInformacao());
            }
        }
    }


    public void removeNode(Node n){
        n.proximo.anterior = n.anterior;
        n.anterior.proximo = n.proximo;
    }

    public Node getNode(int position){
        int counter = 1;
        if(base != null){
            if(this.size >= position ){
                int metade = this.size/2;
                if(position <= metade){
                    Node aux = this.base;

                    while(counter < position){
                        aux = aux.proximo;
                        counter++;
                    }
                    return aux;
                }
                else{
                    Node aux = this.top;
                    int steps = this.size - position;
                    counter = 0;

                    while(counter < steps){
                        aux = aux.anterior;
                        counter++;
                    }
                    return aux;
                }
            }
            else{
                Node n = new Node(0);
                return n;
            }
        }
        else{
            System.out.println("lista vazia");
            Node n = new Node(0);
            return n;
        }
    }


    public int get(int position){
        int counter = 1;
        if(base != null){
            if(this.size >= position ){
                int metade = this.size/2;
                if(position <= metade){
                    Node aux = this.base;

                    while(counter < position){
                        aux = aux.proximo;
                        counter++;
                    }
                    return aux.getInformacao();
                }
                else{
                    Node aux = this.top;
                    int steps = this.size - position;
                    counter = 0;

                    while(counter < steps){
                        aux = aux.anterior;
                        counter++;
                    }
                    return aux.getInformacao();
                }
            }
            else{
                System.out.println("posição fora da lista");
                return 0;
            }
        }
        else{
            System.out.println("lista vazia");
            return 0;
        }
    }


    public int getSize(){
        return this.size;
    }

    public void clear(){
        this.top = null;
        this.base = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return (this.top == null && this.base == null);
    }

    public void set(int value, int position){
        int counter = 1;
        if(this.base == null) {
            System.out.println("Lista esta vazia");
        }
        if(this.size >= position ){
            int metade = this.size/2;
            if(position <= metade){
                if(position <= 1){
                    this.top = null;
                    this.base = null;
                }
                else{
                    Node aux = this.base;

                    while(counter < position){
                        aux = aux.proximo;
                        counter++;
                    }
                    aux.informacao = value;
                }
            }
            else{
                Node aux = this.top;
                int steps = this.size - position;
                counter = 0;

                while(counter < steps){
                    aux = aux.anterior;
                    counter++;
                }
                aux.informacao = value;
            }
        }
        else{
            System.out.println("posição fora da lista");
        }
    }


}