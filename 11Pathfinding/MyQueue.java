import java.util.*;
public class MyQueue<T>{
    private MyLinkedList<T> L;

    public MyQueue(){
	L = new MyLinkedList<T>();
    }
    public void enqueue(T item){
	L.add(item);
    }

    public T dequeue(){
	if (L.size() == 0) throw new NoSuchElementException();
        return L.remove(0);
    }

    public T peek(){
        if (L.size() == 0) throw new NoSuchElementException();
	return L.get(0);
    }

    public int size(){
	return L.size();
    }

    public boolean isEmpty(){
	return size() == 0;
    }
}
