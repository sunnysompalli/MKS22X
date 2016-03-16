public class MyLinkedList{

    private class LNode{
	//instance variables
	int value;
	LNode next;
	
	public LNode(int v){
	    value = v;
	}

	public int getValue(){
	    return value;
	}
	public LNode getNext(){
	    return next;
	}
	public void setValue(int v){
	    value = v;
	}
	public void setNext(LNode n){
	    next = n;
	}
    }

    //instance Variables
    LNode head;
    int size;
    //methods
    
    public boolean add(int value){
	if(head == null){
	    head = new LNode(value);
	}else{
	    LNode p = head;			
	    while(p.getNext()!=null){
		p = p.getNext();
	    }
	    p.setNext(new LNode(value));
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
   
    public static void main(String[]args){
	MyLinkedList m = new MyLinkedList();
	int i = 0;
	while(i < 100){
	    m.add(i);
	    i++;
	}
	m.add(54);
	m.add(-10);
	m.add(47);
	System.out.println(m);
    }
}
