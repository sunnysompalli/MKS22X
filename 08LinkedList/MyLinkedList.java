public class MyLinkedList<T>{

    private class LNode<T>{
	//instance variables
	T value;
	LNode<T> next;
	
	public LNode(T v){
	    value = v;
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
	public void setNext(LNode n){
	    next = n;
	}
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
	    end.setNext(new LNode<T>(value));
	    end = end.getNext();
	}
	size+=1;
	return true;
    }
 
    public String toString(){
	String ans = "[";
	LNode p = head;
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
	LNode<T> p = head;
	for (int i = 0; i < index; i++){
	    p = p.getNext();
	}
	return p.getValue();
    }

    public T set(int index, T newValue){
	LNode<T> p = head;
	for (int i = 0; i < index; i++){
	    p = p.getNext();
	}
	T ans = p.getValue();
	p.setValue(newValue);
	return ans;
    }

    public T remove(int index){
	LNode<T> p = head;
	for (int i = 0; i < index - 1; i++){
	    p = p.getNext();
	}
	LNode<T> q = p.getNext();
	T ans = q.getValue();
	q = q.getNext(); 
	p.setNext(q);
	size --;
	return ans;
    }

    public boolean add(int index, T value){
	if(head == null){
	    head = new LNode(value);
	}else{
	    LNode<T> p = head;			
	    for (int i = 0; i < index - 1; i++){
		p = p.getNext();
	    }
	    LNode<T> q = new LNode(value);
	    q.setNext(p.getNext());
	    p.setNext(q);
	}
	size+=1;
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
   
    public static void main(String[]args){
	MyLinkedList<Integer> m = new MyLinkedList();
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
}
