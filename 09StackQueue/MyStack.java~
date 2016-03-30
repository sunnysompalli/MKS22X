import java.util.*;
public class MyStack<T>{
    private MyLinkedList<T> L;

    public MyStack<T>(){
	L = new MyLinkedList<T>();
    }
    public void push(T item){
	L.add(0, item);
    }

    /**
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T pop(){
	if(L.size() == 0)
	return L.remove(0);
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    T peek();

    /**
     * Returns the number of items currently in the stack.
     */
    int size();

    /**
     * Returns whether the stack is empty or not.
     */
    boolean isEmpty();
}
