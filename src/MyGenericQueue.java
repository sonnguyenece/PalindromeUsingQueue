
import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericQueue<T> {
    private LinkedList<T> queue;

    public MyGenericQueue() {
        queue = new LinkedList();
    }

    public void push(T element) {
        queue.addFirst(element);
    }

    public T get(int index) {
        return queue.get(index);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue.removeLast();
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public void display() {

    }
}