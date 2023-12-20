package Kontr;

public class IntNode {
    private Stage prev; //предыдущий
    private Stage next; //следующий
    private Stage value; //значение

    public IntNode(Stage value) {
        this.value = value;
    }


    public void setPrev(Stage prev) {
        this.prev = prev;
    }

    public void setNext(Stage next) {
        this.next = next;
    }

    public Stage getPrev() {
        return prev;
    }

    public Stage getNext() {
        return next;
    }

    public Stage getValue() {
        return value;
    }
}

