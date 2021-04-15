package queue;

public class MyQueue<T> {
    private MyNodes<T> lastElement;
    private long size;


    public void add(T object) {
        lastElement = new MyNodes<>(object, lastElement);
        size++;
    }

    public T getFirst() {
        if (size == 0) {
            throw new UnsupportedOperationException();
        }
        T object = lastElement.getObject();
        lastElement = lastElement.getNextNode();
        size--;
        return object;
    }

    public long size() {
        return size;
    }
}

class MyNodes<T> {
    private final MyNodes<T> nextNode;
    private final T object;

    MyNodes(T object, MyNodes<T> nextNode) {
        this.object = object;
        this.nextNode = nextNode;
    }

    MyNodes<T> getNextNode() {
        return nextNode;
    }

    T getObject() {
        return object;
    }
}
