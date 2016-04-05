import java.util.*;
public class MyLinkedList<T> implements Iterable<T>{

    private class LNode<T>{
	//instance variables
	T value;
	LNode<T> next;
	LNode<T> previous;
	
	public LNode(T v){
	    value = v;
	}

	public LNode<T> getPrevious(){
	    return previous;
	}
	public void setPrevious(LNode<T> n){
	    previous = n;
	}
	public T getValue(){
	    return value;
	}
	public LNode<T> getNext(){
	    return next;
	}
	public void setValue(T v){
	    value = v;
	}
	public void setNext(LNode<T> n){
	    next = n;
	}
	public String toString(){
	    return "" + value;
	}
    }

    private class MyIteratorThingy implements Iterator<T>{
	LNode<T> next;
	public MyIteratorThingy(){
	    next=head;
	}
	public boolean hasNext(){
	    return next!=null;
	}
	public T next(){
	    if(hasNext()){
		T n = next.getValue();
		next = next.getNext();
		return n;
	    }else{
		throw new NoSuchElementException();
	    }
	}
	public void remove(){
	    throw new UnsupportedOperationException();
	}
    }

    public Iterator<T> iterator(){
	return new MyIteratorThingy();
    }


    //instance Variables
    LNode<T> head;
    LNode<T> end;
    int size;
    //methods
    
    public boolean add(T value){
	if(head == null){
	    head = new LNode<T>(value);
	    end = head;
	}else{
	    LNode n = new LNode<T>(value);
	    n.setPrevious(end);
	    end.setNext(n);
	    end = n;
	}
	size+=1;
	return true;
    }
 
    public String toString(){
	String ans = "[";
	LNode<T> p = head;
	while(p != null){
	    ans += p.getValue();
	    if(p.getNext()!= null){
		ans+=", ";
	    }
	    p = p.getNext();
	}
	return ans+"]";
    }

    public int size(){
	return size;
    }

    public T get(int index){
	if (index > size || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	LNode<T> p = head;
	for (int i = 0; i < index; i++){
	    p = p.getNext();
	}
	return p.getValue();
    }

    public T set(int index, T newValue){
	if (index > size || index < 0){
	    throw new IndexOutOfBoundsException();
	}

	LNode<T> p = head;
	for (int i = 0; i < index; i++){
	    p = p.getNext();
	}
	T ans = p.getValue();
	p.setValue(newValue);
	return ans;
    }

    public T remove(int index){
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	if (head == null){
	    end = null;
	}
	LNode<T> p = head;
	if (index == 0){
	    head = head.getNext();
	} else {
	    LNode<T> q = head;
	    for (int i = 0; i < index - 1; i++){
		q = q.getNext();
	    }
	    p = q.getNext();
	    if(end == p){
		end = q;
	    }
	    q.setNext(q.getNext().getNext());
	    if (q.getNext() != null){
		q.getNext().setPrevious(q);
	    }
	}
	size--;
	return p.getValue();
    }

    public boolean add(int index, T value){
	if (index > size || index < 0){
	    throw new IndexOutOfBoundsException();
	}
	if (index == size){
	    add(value);
	} else if (index == 0){
	    LNode n = new LNode<T>(value);
	    n.setNext(head);
	    head.setPrevious(n);
	    head = n;
	    size++;
	} else {
	    LNode<T> p = head;			
	    for (int i = 0; i < index - 1; i++){
		p = p.getNext();
	    }
	    LNode<T> q = new LNode<T>(value);
	    q.setNext(p.getNext());
	    p.getNext().setPrevious(q);
	    p.setNext(q);
	    q.setPrevious(p);
	    size++;
	}
	return true;	
    }

    public int indexOf(T value){
	LNode<T> p = head;
	int i = 0;
	while (p.getValue() != value && p.getNext() != null){
	    p = p.getNext();
	    i++;
	}
	if (p.getNext() == null){
	    return -1;
	} else {
	    return i;
	}
    }

    /*
    public static void main(String[]args){
	MyLinkedList<Integer> m = new MyLinkedList<Integer>();
	int i = 0;
	while(i < 100){
	    m.add(i);
	    i++;
	}
	System.out.println(m.add(24, 54));
	m.add(-10);
	m.add(47);
	System.out.println(m);
	System.out.println(m.get(24));
	System.out.println(m.set(24, 1000));
	System.out.println(m);
	System.out.println(m.remove(24));
	System.out.println(m);
	System.out.println(m.indexOf(-10));
    }
    */
    
}
