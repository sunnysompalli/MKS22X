import java.util.*;
public class Driver{

    public static void main(String[]args){
 	MyDeque<Integer> mdq = new MyDeque<Integer>();
	ArrayDeque<Integer> dq = new ArrayDeque<Integer>();

	for (int i = 0; i < 100; i++){
	    int n1 = (int)(Math.random() * 1000);
	    mdq.addFirst(n1);
	    dq.addFirst(n1);

	    int n2 = (int)(Math.random() * 1000);
	    mdq.addLast(n2);
	    dq.addLast(n2);
	}

	for (int i = 0; i < (int)(Math.random() * 5); i++){
	    System.out.println(mdq.removeFirst());
	    System.out.println(dq.removeFirst());	    
	}
	for (int i = 0; i < (int)(Math.random() * 5); i++){
	    System.out.println(mdq.removeLast());
	    System.out.println(dq.removeLast());	    
	}

	System.out.println(mdq.getFirst());
	System.out.println(dq.getFirst());
	System.out.println(mdq.getLast());
	System.out.println(dq.getLast());
    }
 
}
