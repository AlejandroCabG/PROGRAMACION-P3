public class App {
    public static void main(String[] args) {
        StackArray <Integer> stack = new StackArray<>();

        stack.isEmpty();
        stack.add(4);
        stack.removeFirst();
        stack.getFirst();
        stack.add(2);
        stack.toString();
    }
}
