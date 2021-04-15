package queue;

public class MyQueue<T> {
    private MyNodes<T> lastElement;
    private long size;


    public void add(T object) {
        lastElement = new MyNodes<>(object, lastElement);
        size++;
    }

    public T pop() {
        if (size == 0) {
            throw new UnsupportedOperationException();
        }
        T object = lastElement.getObject();
        lastElement = lastElement.getPreviousNode();
        size--;
        return object;
    }

    public long size() {
        return size;
    }
}

class MyNodes<T> {
    private final MyNodes<T> previousNode;
    private final T object;

    MyNodes(T object, MyNodes<T> previousNode) {
        this.object = object;
        this.previousNode = previousNode;
    }

    MyNodes<T> getPreviousNode() {
        return previousNode;
    }

    T getObject() {
        return object;
    }
}
