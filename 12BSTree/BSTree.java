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
	    return toStringH("", this);
	}
	public String toStringH(String ans, Node n){
	    ans += n.data + " ";
	    if (left != null){
		n.toStringH(ans, left);
	    } else {
		ans += " _ ";
	    }
	    if (right != null){
		n.toStringH(ans, right);
	    } else {
		ans += " _ ";
	    }	    
	    return ans;
	}

	private Node root;
    }

}
