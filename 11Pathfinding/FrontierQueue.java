import java.util.*;
public class FrontierQueue<T> implements Frontier<T>{

    MyQueue<T> q;

    public FrontierQueue(){
	q = new MyQueue<T>();
    }

    public void add(T value){
	q.enqueue(value);
    }

    public T next(){
	return q.dequeue();
    }

    public boolean hasNext(){
	return q.peek() != null;
    }


    
}
