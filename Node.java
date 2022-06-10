//Estrutura de dados
// Alvaro Lima e Diogo Feld

public class Node<E> {
    public Integer informacao;
    Node<E> proximo;
    Node<E> anterior;

    public Node(Integer info) {
        this.informacao = info;
        this.proximo = null;
        this.anterior = null;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
        proximo.setAnterior(this);
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Integer getInformacao() {
        return informacao;
    }

    public Node getProximo() {
        return this.proximo;
    }

    public Node getAnterior() {
        return this.anterior;
    }
}