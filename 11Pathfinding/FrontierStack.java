import java.util.*;
public class FrontierStack<T> implements Frontier<T>{
    MyStack<T> s;

    public FrontierStack(){
	s = new MyStack<T>();
    }

    public void add(T value){
	s.push(value);
    }

    public T next(){
	return s.pop();
    }

    public boolean hasNext(){
	return !s.isEmpty();
    }


}
