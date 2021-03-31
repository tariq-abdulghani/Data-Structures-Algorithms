package abdulghani.tariq.insertion_sort;

import abdulghani.tariq.models.Order;
import abdulghani.tariq.models.SortingAlgorithm;

public class InsertionSort implements SortingAlgorithm {

    @Override
    public int[] sort(int[] unsorted, Order order) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < unsorted.length - 1; firstUnsortedIndex++) {
            int element = unsorted[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && unsorted[i - 1] > element; i--) {
                unsorted[i] = unsorted[i - 1];
            }
            unsorted[i] = element;
        }
        return unsorted;
    }
}
