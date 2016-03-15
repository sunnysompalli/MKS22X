public class MyLinkedList{
    private LNode start;
    private int size;
    
    private class LNode{
	private int data;
	private LNode next;

	private LNode(){
	   
	}
	private LNode(int d){
	    data = d;
	    next = null;
	}
	private LNode(int d; LNode n){
	    data = d;
	    next = n;
	}

	private int get(){
	    return data;
	}

    }

    public int size(){
	return size;
    }

    

}
