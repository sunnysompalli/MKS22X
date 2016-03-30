import java.util.*;
public class MyStack<T>{
    private MyLinkedList<T> L;

    public MyStack(){
	L = new MyLinkedList<T>();
    }
    public void push(T item){
	L.add(0, item);
    }

    public T pop(){
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
