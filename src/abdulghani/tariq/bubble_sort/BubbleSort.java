package abdulghani.tariq.bubble_sort;

import abdulghani.tariq.models.Order;
import abdulghani.tariq.models.SortingAlgorithm;

import static abdulghani.tariq.arrays.IntArrayUtils.swap;

public class BubbleSort implements SortingAlgorithm {

    public int[] sort(int[] unsorted, Order order) {
        int unsortedIndex = unsorted.length - 1;
        for (int i = 0; i < unsortedIndex; i--) {
            for (int j = 0; j < unsortedIndex; j++) {
                switch (order) {
                    case ASC:
                        if (unsorted[j] > unsorted[j + 1]) {
                            swap(unsorted, j, j + 1);
                        }
                        break;
                    case DESC:
                        if (unsorted[j] < unsorted[j + 1])
                            swap(unsorted, j, j + 1);
                        break;
                }
            }
        }
        return unsorted;
    }


}
