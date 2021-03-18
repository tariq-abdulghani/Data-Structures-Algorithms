package abdulghani.tariq.bubble_sort;

import abdulghani.tariq.models.Order;

public class BubbleSortMain {

    public static void main(String[] args) {
        int[] intArray = {9, 1,4,50, 2, 45, -9};
        intArray = BubbleSort.sort(intArray, Order.ASC);

        for (int i: intArray
             ) {
            System.out.println(i);
        }
    }
}
