import java.util.Arrays;
public class StackArray <T> {
    private T[] array;   //object array
    private int objetos = 0;

    //Constructor
    public StackArray() {
        array = (T[]) new Object[10];
    }

    public boolean isEmpty() {
        return objetos == 0;
    }

    public <T> void removeFirst() {
        for (int i = array.length-1; i < 0; i++) {
            array[i] = array[i + 1];
            objetos--;
        }
    }
    public <T> void getFirst() {
        System.out.println(array[0]);
    }

    public T add(T item) {

        if (objetos == array.length) {
            T[] newArray = (T[]) new Object[array.length + 10];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        } else {
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];

            }
        }
        objetos++;
        array[0] = item;
        return item;
    }

    @Override
    public String toString() {
        System.out.println(Arrays.toString(array));
        return null;
    }
}

