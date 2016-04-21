public class BSTree<T extends Comparable<T>>{
    
    private class Node{
	Node left,right;
	T data;

	public T getData(){
	    return data;
	}
	public void setData(T d){
	    data = d;
	}
	public Node getLeft(){
	    return left;
	}
	public void setLeft(Node l){
	    left = l;
	}
	public Node getRight(){
	    return right;
	}
	public void setRight(Node r){
	    right = r;
	}
	public String toString(){
	    return toStringH("");
	}
	public String toStringH(String ans){
	    ans += getData + " ";
	    if (left != null){
		toStringH(ans, left);
	    } else {
		ans += " _ ";
	    }
	    if (right != null){
		toStringH(ans, right);
	    } else {
		ans += " _ ";
	    }	    
	    return ans;
	}
    }

}
