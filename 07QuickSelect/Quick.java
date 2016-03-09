public class Quick{

    private static int partition(int[]data, int left, int right){
	int initial = ((int)(Math.random() * (right - left))) + left;
	int holder;
	int rightend = right;
	data[initial] = num;
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
	int right = data.length - 1;
	int left = 0;
	int i = partition(data, left, right);
	while (i != k){
	    if (i < k){
		left = i + 1;
	    } else if (i > k){
		right = i - 1;
	    }
	    i = partition(data, left, right);
	}
	return data[i];
    }
    
}
