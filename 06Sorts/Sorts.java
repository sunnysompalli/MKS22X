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

    public static void mergesort(int[] data){
	if (data.length != 1){
            int[] ary1 = new int[data.length / 2];
            int[] ary2 = new int[data.length - data.length / 2];
            for (int i = 0; i < data.length / 2; i++){
                ary1[i] = data[i];
            }
            
            for (int i = data.length / 2; i < data.length; i++){
                ary2[i - data.length / 2] = data[i];
            }
	    mergesort(ary1);
	    mergesort(ary2);
	    mergeH(data, ary1, ary2);
        }
    }


    private static void mergeH(int[] data, int[] ary1, int[] ary2){
        int[] combo = new int[ary1.length + ary2.length];
        int counter1 = 0;
        int counter2 = 0;
        int i = 0;
        while (counter1 < ary1.length && counter2 < ary2.length){
            if (ary1[counter1] < ary2[counter2]){
                combo[i] = ary1[counter1];
                counter1++;
                i++;
            } else {
                combo[i] = ary2[counter2];
                counter2++;
                i++;
            }
        }
        if (counter2 >= ary2.length){
            for (int j = counter1; j < ary1.length; j++){
                combo[i]= ary1[j];
                i++;
            }
        }
	if (counter1 >= ary1.length){
	    for (int j = counter2; j < ary2.length; j++){
                combo[i]= ary2[j];
                i++;
            }
        }

        for (int j = 0; j < combo.length; j++){
	    data[j] = combo[j];
	}
    }
}
