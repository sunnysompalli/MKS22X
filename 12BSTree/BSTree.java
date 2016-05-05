public class BSTree<T extends Comparable<T>>{
    
    private class Node{
	Node left,right;
	T data;

	public Node(T d){
	    data = d;
	}

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

	public void nodeAdd(T val){
	    if (val.compareTo(data) == 0){
		throw new IllegalArgumentException();
	    }
	    else if (val.compareTo(data) < 0){
		if (left == null){
		    left = new Node(val);
		} else {
		    left.nodeAdd(val);
		}
	    } else {
		if (right == null){
		    right = new Node(val);
		} else {
		    right.nodeAdd(val);
		}
	    }
	}

	public boolean nodeContains(T val){
	    if (this == null){
		return false;
	    }
	    else if (data.compareTo(val) == 0){
		return true;
	    }
	    else if (data.compareTo(val) < 0){
		return left.nodeContains(val);
	    } else {
		return right.nodeContains(val);
	    }
	}

	public int getNodeHeight(){
	    if (this == null){
		return 0;
	    } else {
		int ans = 1;
		ans += Math.max(left.getNodeHeight(), right.getNodeHeight());
		return ans;
	    }
	}
    }

    private Node root;

    public String toString(){
	return root.toString();
    }

    public void add(T val){
	if (root == null){
	    root = new Node(val);
	}
	root.nodeAdd(val);
    }

    public boolean contains(T val){
	return root.nodeContains(val);
    }

    public int getHeight(){
	return root.getNodeHeight();
    }


}
