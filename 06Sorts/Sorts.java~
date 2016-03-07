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
}
