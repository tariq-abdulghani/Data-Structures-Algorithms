package abdulghani.tariq.selection_sort;

import abdulghani.tariq.arrays.IntArrayUtils;
import abdulghani.tariq.models.Order;
import abdulghani.tariq.models.SortingAlgorithm;

public class SelectionSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] unsorted, Order order) {
        System.out.println("sorting .......");
        // last unsorted index
        // find max in unsorted partition
            // compare elements in unsorted part get max of them
        // set max at last unsorted index
        // decrement unsorted partition
        // do it again until last unsorted index == 0

        for (int lasUnsortedIndex = unsorted.length -1; lasUnsortedIndex > 0; lasUnsortedIndex --) {
            int minMaxIndex = 0;
            switch (order){
                case ASC:
                    minMaxIndex = IntArrayUtils.getMaxIndex(unsorted, lasUnsortedIndex);
                    break;
                case DESC:
                    minMaxIndex = IntArrayUtils.getMinIndex(unsorted, lasUnsortedIndex);
                    break;
                default:
                    minMaxIndex=0;
            }
            IntArrayUtils.swap(unsorted, minMaxIndex, lasUnsortedIndex);
        }

        return unsorted;
    }
}
