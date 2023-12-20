package Kontr;

import ru.itis.inf304.lab22.IntNode;
import ru.itis.inf304.lab22.MyList;

public class IntLinkedList {

    private IntNode current; //текущий
    private IntNode first; //первый
    private IntNode last; //последний
    private int size; // размер


    public void add(int value) {
        IntNode oldLast = this.last;                                //исходный теперь не последний, он старый последний
        IntNode newLast = new ru.itis.inf304.lab22.IntNode(oldLast, null, value);   // прибывший, который мы создали
        this.last = newLast;                                        //перезаписываем в последний прибывшего
        if (oldLast == null)                                        //если старого не было, то ставим прибывшего на первую позицию
            this.first = newLast;
        else
            oldLast.setNext(newLast);                               // иначе ссылка у исходного меняется на прибывшего
        size++;                                                     //размер списка увеличивается
    }


    public int size() {
        return size;
    }


    public boolean hasNext() {
        return (current.getNext() )!= null;
    }




    public int next() {
        if (current == null) {
            current = first;
            return current.getValue();
        }
        current = current.getNext();
        return current.getValue();
    }


    public int max() {
        int max = -1000;
        do {
            int next = next();
            if (compare(max, next) < 0) {
                max = next;
            }
        } while (hasNext());
        return max;
    }


    public int min() {
        int min = 1000;
        do {
            int next = next();
            if (compare(min, next) > 0) {
                min = next;
            }
        } while (hasNext());
        return min;
    }


    public int compare(int a, int b) {
        return a - b;
    }

    public void print() {
        IntNode current = this.first;
        System.out.print(current.getValue());
        while ((current = current.getNext()) != null) {
            System.out.print(" ");
            System.out.print(current.getValue());
        }
        System.out.print("\n");
    }

    public int get(int i) {
        IntNode current = this.first;
        for (int j = 0; j < i; j++) {
            current = current.getNext();
        }
        return current.getValue();
    }
}



