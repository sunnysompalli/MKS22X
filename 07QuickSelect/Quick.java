import java.util.*;

public class Quick{

    private static int partition(int[]data, int left, int right){
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

    public static int quickselect(int[]data, int k){
	if (k < 0 || k >= data.length){
	    throw new IllegalArgumentException();
	}
	return quickselect(data, k, 0, data.length - 1);
    }

    private static int quickselect(int[]data, int k, int left, int right){
	int i = partition(data, left, right);
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
	int index = partition(data, 0, data.length - 1);
	quickSort(data, 0, index);
	if (index <= data.length - 2){
	    quickSort(data, index + 1, data.length - 1);
	}
    }

    public static void quickSort(int[]data, int left, int right){
	if (left != right){
	    int index = partition(data, left, right);
	    quickSort(data, left, index);
	    if (index <= right - 1){
		quickSort(data, index + 1, right);
	    }
	}
    }

    public static String name(){
	return "6,Sompalli,Sunny";
    }

    /*
    public static void main(String[]args){
	int[]data = {2, 0, 3, 8, 5, 7, 1, 9, 4, 6};
	System.out.println(quickselect(data, 6));
	System.out.println(Arrays.toString(data));	

	int[]data2 = {2, 0, 3, 8, 5, 7, 1, 9, 4, 6};
	System.out.println(Arrays.toString(data2));
	quickSort(data2);
	System.out.println(Arrays.toString(data2));
    }
    */
}
