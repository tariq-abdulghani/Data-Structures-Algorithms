package abdulghani.tariq.selection_sort;

import abdulghani.tariq.models.Order;

public class SelectionSortMain {
    public static void main(String[] args) {
        int[] intArray = {9, 1,4,50, 2, 45, -9};
        intArray = new SelectionSort().sort(intArray, Order.DESC);

        for (int i: intArray
        ) {
            System.out.println(i);
        }

    }
}
