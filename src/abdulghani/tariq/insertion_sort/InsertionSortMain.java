package abdulghani.tariq.insertion_sort;

import abdulghani.tariq.bubble_sort.BubbleSort;
import abdulghani.tariq.models.Order;

public class InsertionSortMain {
    public static void main(String[] args) {

        int[] intArray = {9, 1,4,-100,50, 20, 1000, 45, -9, -8, -7};
        intArray = new InsertionSort().sort(intArray, Order.ASC);

        for (int i: intArray
        ) {
            System.out.println(i);
        }

    }
}
