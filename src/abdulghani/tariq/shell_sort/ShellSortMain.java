package abdulghani.tariq.shell_sort;

import abdulghani.tariq.models.GapGenerator;
import abdulghani.tariq.models.Order;

public class ShellSortMain {
    public static void main(String[] args) {

        int[] intArray = {9, 1,4,-100,50, 20, 1000, 45, -90, -8, -7, 200, 900, 8, -70, 99, -40, -300};
        intArray = new ShellSort().sort(intArray, Order.ASC);

//        for (int i: intArray
//        ) {
//            System.out.println(i);
//        }


    }
}
