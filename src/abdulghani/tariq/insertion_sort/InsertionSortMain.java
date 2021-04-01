package abdulghani.tariq.insertion_sort;

import abdulghani.tariq.bubble_sort.BubbleSort;
import abdulghani.tariq.models.Order;

public class InsertionSortMain {
    public static void main(String[] args) {

        int[] intArray = {9, 1,4,50, 2, 45, -9, -100};
        intArray = new InsertionSort().sort(intArray, Order.DESC);

        for (int i: intArray
        ) {
            System.out.println(i);
        }

    }
}
