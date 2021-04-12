package abdulghani.tariq.merge_sort;

import abdulghani.tariq.models.Order;
import abdulghani.tariq.models.SortingAlgorithm;

public class MergeSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] unsorted, Order order) {
        split(unsorted, 0, unsorted.length -1);
        return unsorted;
    }

    public static void split(int[] intArray, int startIndex, int endIndex) {
        if(endIndex - startIndex < 2){
            return;
        }
        int mid = (startIndex + endIndex) / 2;
        System.out.println(String.format("left array: { %d, %d }, right array: { %d, %d}",startIndex, mid, mid+1, endIndex));
        split(intArray, startIndex, mid);
        split(intArray, mid+1, endIndex);

    }

    public static void merge(int[] intArray, int startIndex, int endIndex){

    }
}
