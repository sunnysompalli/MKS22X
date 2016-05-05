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

	public String toString(){
	    return toStringH("");
	}
	public String toStringH(String ans){
	    ans += data + " ";
	    if (left != null){
		ans += left.toString();
	    } else {
		ans += "_ ";
	    }
	    if (right != null){
		ans += right.toString();
	    } else {
		ans += "_ ";
	    }	    
	    return ans;
	}

	public void nodeAdd(T val){
	    if (val.compareTo(data) < 0){
		if (left == null){
		    left = new Node(val);
		} else {
		    left.nodeAdd(val);
		}
	    } 
	    if (val.compareTo(data) > 0){
		if (right == null){
		    right = new Node(val);
		} else {
		    right.nodeAdd(val);
		}
	    }
	}

	public boolean nodeContains(T val){
	    if (data == null){
		return false;
	    }
	    if (data.compareTo(val) == 0){
		return true;
	    }
	    if (left == null && right == null){
		return false;
	    }
	    else if (left == null){
		return right.nodeContains(val);
	    }
	    else if (right == null){
		return left.nodeContains(val);
	    } else {
		return left.nodeContains(val) || right.nodeContains(val);
	    }
	}

	public int getNodeHeight(){
	    if (this == null){
		return 0;
	    } else {
		int ans = 1;
		if (left == null && right == null){
		    return ans;
		}
		else if(left == null){
		    return ans + right.getNodeHeight();
		}
		else if (right == null){
		    return ans + left.getNodeHeight();
		} else {
		    ans += Math.max(left.getNodeHeight(), right.getNodeHeight());
		    return ans;
		}
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
	} else {
	    root.nodeAdd(val);
	}
    }

    public boolean contains(T val){
	return root.nodeContains(val);
    }

    public int getHeight(){
	return root.getNodeHeight();
    }
}
