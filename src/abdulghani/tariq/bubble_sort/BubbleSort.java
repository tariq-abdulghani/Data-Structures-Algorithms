package abdulghani.tariq.bubble_sort;

import abdulghani.tariq.models.Order;

public class BubbleSort {

    public static int[] sort(int[] unsorted, Order order) {
        int unsortedIndex = unsorted.length -1;
        for (int i = 0; i < unsortedIndex; i--) {
            for (int j = 0;  j < unsortedIndex ; j++) {
                if(unsorted[j] > unsorted[j+1] && order.getValue() == Order.ASC.getValue())
                swap(unsorted, j, j+1);

                if(unsorted[j] < unsorted[j+1] && order.getValue() == Order.DESC.getValue())
                    swap(unsorted, j, j+1);
            }
        }
        return unsorted;
    }

    public static void swap(int[] intArray, int i, int j) {
        if(i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
