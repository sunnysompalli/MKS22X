public class Sorts{
    
    public static void printArray(int[]data){
	String ans = "[ ";
	for (int i = 0; i < data.length - 1; i++){
	    ans += (data[i] + ", ");
	}
	ans += data[data.length - 1];
	ans += "]";
	System.out.println(ans);
    }
    
    public static void insertionSort(int[]data){
	for (int i = 1; i < data.length; i++){
	    int x = i - 1;
	    int holder;
	    while (x >= 0 && data[x + 1] < data[x]) {
	        holder = data[x];
	        data[x] = data[x + 1];
		data[x + 1] = holder;
		x -= 1;
	    }
	}
    }

    public static void selectionSort(int[]data){
	for (int i = 0; i < data.length; i++){
	    int holder;
	    int min = i;
	    for (int j = i + 1; j < data.length; j++){
		if (Math.min(data[min], data[j]) != data[min]){
		    min = j;
		}
	    }
	    holder = data[i];
	    data[i] = data[min];
	    data[min] = holder;
	}
    }

    public static void bubbleSort(int[]data){
	for (int i = (data.length - 1); i >= 0; i--){
	    int holder;
	    for (int j = 0; j < (data.length - 1); j++){
		int k = j + 1;
		if (data[j] > data[k]){
		    holder = data[k];
		    data[k] = data[j];
		    data[j] = holder;
		}
	    }
	}
    }

    public int[] mergesort(int[] ary){
	if (ary.length > 1){
	    int[] subary1 = new int[ary.length / 2];
	    int[] subary2 = new int[ary.length - subary1.length];
	    for (int i = 0; i < subary1.length; i++){
		subary1[i] = ary[i];
	    }
	    for (int j = 0; j < subary2.length; j++){
		subary[2] = ary[j + subary1.length];
	    }
	    mergesort(subary1);
	    mergesort(subary2);
	    
	} else {
	    return mergeH(subary1, subary2);
	}
    }

    private int[] mergeH(int[] ary1, int[] ary2){
	int[] combo = new int[ary1.length + ary2.length];
	int counter1 = 0;
	int counter2 = 0;
	for (int i = 0; i < combo.length; i++){
	    while (counter1 < art1.length && counter2 < ary2.length){
		if (ary1[counter1] <= ary2[counter2]){
		    
		}
	    }
	}
    }
}
