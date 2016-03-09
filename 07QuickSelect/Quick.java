public class Quick{

    private static int partition(int[]data, int left, int right){
	int initial = ((int)(Math.random() * (right - left))) + left;
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

    public static String name(){
	return "6,Sompalli,Sunny";
    }

    /*
    public static void main(String[]args){
	int[]data = {2, 12, 13, 1, -5, 3, 2, 18, 6, 21, 84, -16, 0, 21};
	System.out.println(quickselect(data, 0));
	System.out.println(quickselect(data, 6));
	System.out.println(quickselect(data, 7));
	System.out.println(quickselect(data, 8));
	System.out.println(quickselect(data, 9));
	System.out.println(quickselect(data, 13));
	
	int[]ary = {4, 7, 1, 5, 12, 91, 43, 26, 10, -100, -10, -5, 61};
	System.out.println(quickselect(ary, 0));
	System.out.println(quickselect(ary, 5));
	System.out.println(quickselect(ary, 6));
	System.out.println(quickselect(ary, 7));
	System.out.println(quickselect(ary, 11));
	System.out.println(quickselect(ary, 12));
    }
    */
}
