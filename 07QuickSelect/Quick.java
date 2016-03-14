import java.util.*;

public class Quick{


    private static int[] partition(int[] data, int left, int right){
	int pivot = (int) (Math.random() * (right - left + 1)) + left;
	int[] tmp = new int[right - left + 1];
	int[] ans = new int[2];
	int num = data[pivot];
	int l = 0;
	int r = right - left;
	for (int i = left; i <= right; i++){
	    if (data[i] < num) {
	        tmp[l] = data[i];
		l++;
	    }
	    if (data[i] > num){
		tmp[r] = data[i];
		r--;
	    }
	}
	ans[0] = l + left;
        ans[1] = r + left;
	for (int i = l; i <= r; i++){
	    tmp[i] = num;
	}
	
	for (int i = 0; i < tmp.length; i++){
	    data[left] = tmp[i];
	    left++;
	}
	return ans;
    }

    
    public static int quickselect(int[]data, int k){
	if (k < 0 || k >= data.length){
	    throw new IllegalArgumentException();
	}
	return quickselect(data, k, 0, data.length - 1);
    }

    private static int quickselect(int[]data, int k, int left, int right){
	int i = partitionOld(data, left, right);
	if (i == k){
	    return data[i];
	} else {
	    if (i < k){
		if (i + 1 == right){
		    return data[right];
		} else {
		    return quickselect(data, k, i + 1, right);
		}
	    } else {
		if (i - 1 == left){
		    return data[left];
		} else {
		    return quickselect(data, k, left, i - 1);
		}
	    }
	}
    }

    public static void quickSort(int[]data){
	int[] index = partition(data, 0, data.length - 1);
	//System.out.println(Arrays.toString(index));
	quickSort(data, 0, index[0]);
	if (index[1] <= data.length - 2){
	    quickSort(data, index[1] + 1, data.length - 1);
	}
    }

    public static void quickSort(int[]data, int left, int right){
	if (left != right){
	    int[] index = partition(data, left, right);
	    //System.out.println(Arrays.toString(index));
	    quickSort(data, left, index[0]);
	    if (index[1] <= right - 1){
		quickSort(data, index[1] + 1, right);
	    }
	}
    }

    private static int partitionOld(int[]data, int left, int right){
	int initial = ((int)(Math.random() * (right - left + 1))) + left;
	int holder;
	int rightend = right;
	int num = data[initial];
	data[initial] = data[right];
	data[right] = num;
	right--;
	while (left < right){
	    if (data[left] > num){
		holder = data[right];
		data[right] = data[left];
		data[left] = holder;
		right--;
	    } else {
		left++;
	    }
	}
	if (num < data[left]){
	    holder = data[left];
	    data[left] = num;
	    data[rightend] = holder;
	    return left;
	} else {
	    holder = data[left + 1];
	    data[left + 1] = num;
	    data[rightend] = holder;
	    return left + 1;
	}
    }

    public static int quickselectOld(int[]data, int k){
	if (k < 0 || k >= data.length){
	    throw new IllegalArgumentException();
	}
	return quickselectOld(data, k, 0, data.length - 1);
    }

    private static int quickselectOld(int[]data, int k, int left, int right){
	int i = partitionOld(data, left, right);
	if (i == k){
	    return data[i];
	} else {
	    if (i < k){
		if (i + 1 == right){
		    return data[right];
		} else {
		    return quickselectOld(data, k, i + 1, right);
		}
	    } else {
		if (i - 1 == left){
		    return data[left];
		} else {
		    return quickselectOld(data, k, left, i - 1);
		}
	    }
	}
    }

    public static void quickSortOld(int[]data){
	    quickSortOld(data, 0, data.length - 1);
    }

    public static void quickSortOld(int[]data, int left, int right){
	if (left != right){
	    int index = partitionOld(data, left, right);
	    if (index > 0){
		quickSortOld(data, left, index - 1);
	    }
	    if (index < right){
		quickSortOld(data, index + 1, right);
	    }
	}
    }

    public static String name(){
	return "6,Sompalli,Sunny";
    }

    public static void main(String[]args){
	/*
	  int[]data = {2, 0, 3, 8, 5, 7, 1, 9, 4, 6};
	  System.out.println(quickselect(data, 6));
	  System.out.println(Arrays.toString(data));	
	  int[]data2 = {2, 0, 3, 8, 5, 7, 1, 9, 4, 6};
	  System.out.println(Arrays.toString(data2));
	  quickSort(data2);
	  System.out.println(Arrays.toString(data2));
	*/

	int[] d = new int [4000000];
	int[] c = new int [d.length];

	for(int i = 0; i < d.length; i++){
	    d[i]= (int)(Math.random()*Integer.MAX_VALUE);
	    c[i]= d[i];
	}
	quickSort(d); //or even your old quicksort!!!
	Arrays.sort(c);
	
	System.out.println("Done: Sorted="+Arrays.equals(d,c));
    }
   
}
