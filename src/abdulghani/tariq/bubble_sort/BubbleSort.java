package abdulghani.tariq.bubble_sort;

public class BubbleSort {

    public int[] sort(int[] unsorted) {
        int unsortedIndex = unsorted.length -1;
        for (int i = 0; i < unsortedIndex; i--) {
            for (int j = 0;  j < unsortedIndex ; j++) {
                if(j > j+1)
                swap(unsorted, j, j+1);
            }
        }
        return unsorted;
    }

    public void swap(int[] intArray, int i, int j) {
        if(i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
