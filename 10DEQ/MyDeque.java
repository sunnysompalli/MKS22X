import java.util.*;
public class MyDeque<T>{
    private T[] ary;
    private int size;
    private int start;
    private int end;
    
    @SuppressWarnings("unchecked")	    
    public MyDeque(){
	ary = (T[]) new Object[10];
    }

    @SuppressWarnings("unchecked")	    
    private void grow(){
	T[] newary = (T[]) new Object[ary.length * 2];
	for(int i = 0; i < ary.length; i++){
	    newary[i] = ary[start];
	    start++;
	    if(start == ary.length){
		start = 0;
	    }
	}
	ary = newary;
	start = 0;
	end = ary.length - 1;
    }

    public void addFirst(T value){
	if (size == ary.length){
	    grow();
	}
	if (size == 0){
	    ary[0] = value;
	    start = 0;
	    end = 0;
	}
	else if (start == 0){
	    ary[ary.length - 1] = value;
	    start = ary.length - 1;
	} else {
	    ary[start - 1] = value;
	    start--;
	}
	size++;
    }

    public void addLast(T value){
	if (size == ary.length){
	    grow();
	}
	if (size == 0){
	    ary[0] = value;
	    start = 0;
	    end = 0;
	}
	else if (end == ary.length - 1){
	    ary[0] = value;
	    end = 0;
	} else {
	    ary[end + 1] = value;
	    end ++;
	}
	size++;
    }

    public T removeFirst(){
	if (size == 0){
	    throw new NoSuchElementException();
	}
	T holder = ary[start];
	if (start == ary.length - 1){
	    start = 0;
	} else {
	    start++;
	}
	size--;
        return holder;
    }

    public T removeLast(){
	if (size == 0){
	    throw new NoSuchElementException();
	}
	T holder = ary[end];
	if (end == 0){
	    end = ary.length - 1;
	} else {
	    end--;
	}
	size--;
	return holder;
    }

    public T getFirst(){
       	if (size == 0){
	    throw new NoSuchElementException();
	}
	return ary[start];
    }

    public T getLast(){
	if (size == 0){
	    throw new NoSuchElementException();
	}
	return ary[end];
    }


    /*
    public String toString(){
	String ans = "";
	ans += "[";
	if (start > end){
	    int n = size - start;
	}
	return ans;
    }
    */
    
    
}
