import java.util.LinkedList;
public class Stack<T> {
    LinkedList<T> lista = new LinkedList<T>();

    //Constructor
    public Stack() {
        super();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public T removeFirst() {
        return lista.removeFirst();
    }
    public T getFirst() {
        return lista.getFirst();
    }
    public void add(T item){
        lista.add((T) "Perros");
        lista.add((T) "Gatos");
        System.out.println(lista);
    }
    public T aniadir(T item) {
        lista.addFirst(item);
        return item;
    }

    public String toString() {

        return lista.toString();
    }


}

