## Ejercicios Genéricos

1. Crea una clase genérica Stack que contenga los siguientes métodos:

    “Constructor”

        Creo una LinkedList
        LinkedList<T> lista = new LinkedList<T>();

       //Constructor 
       public Stack() {
       super();
       }
    isEmpty();
   Comprueba si la lista está vacía.
       
       Creo un método boolean para comprobar que la lista está vacía.    
       public boolean isEmpty() {
       return lista.isEmpty();
       }

    removeFirst();  Extrae el primer elemento eliminándolo de la lista.
   
       public T removeFirst() {
       return lista.removeFirst();
       }
  
   getFirst(); 
   Extrae el primer elemento.
      
       public T getFirst() {
       return lista.getFirst();
       }
   add();
   Añade un elemento al inicio de la lista

       public T aniadir(T item) {
       lista.addFirst(item);
       return item;
       }

   toString();
   Devuelve un String que visualiza los datos de la lista.
         
       Convierto los datos de la lista en un String.  
       public String toString() {
        return lista.toString();
       }
 

2. Crea una clase genérica StackArray que utilice un array genérico y un entero que cuente el número de objetos insertados.
   Tiene que contener los siguientes métodos:

       Creo un array genérico T y un entero que inicializao a 0.  
       private T[] array;   //object array 
       private int objetos = 0;

   “Constructor”
   
       Añado 10 posiciones al array
       public StackArray() {
       array = (T[]) new Object[10];
       }

   isEmpty();
   Comprueba si la lista está vacía.

        
        public boolean isEmpty() {
        return objetos == 0;
        }

   removeFirst();
   Extrae el primer elemento eliminándolo de la lista.

        public <T> void removeFirst() {
        for (int i = array.length-1; i < 0; i++) {
        array[i] = array[i + 1];
        objetos--;
         }
        }

   getFirst();
   Extrae el primer elemento.

       public <T> void getFirst() {
        System.out.println(array[0]);
        }

   add();
   Añade un elemento al inicio de la lista

      public T add(T item) {
         // Compruebo que los objetos sean igual que el tamaño del array. En ese caso creo un objeto y le sumo 10 pisciciones al array.
         // recorro el array y compruebo que el índece del nuevo array sea igual que el del nuevo.
        if (objetos == array.length) {
            T[] newArray = (T[]) new Object[array.length + 10];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        //Sino resto una posición al tamaño del array i decremento en lugar de incrementar
        } else {
            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
        }
        objetos++;
        array[0] = item; //la primera posición del array 
        return item;
      }

   toString();
   Devuelve un String que visualiza los datos de la lista.
         
         Importo la classe Arrays para poder utilizar la clase Arrays y poder convertir el array en una cadena String.
         import java.util.Arrays;
         public String toString() {
         System.out.println(Arrays.toString(array));
         return null;
          }

   