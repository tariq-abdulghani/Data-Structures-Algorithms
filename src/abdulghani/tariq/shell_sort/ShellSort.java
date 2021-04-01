package abdulghani.tariq.shell_sort;


import abdulghani.tariq.arrays.IntArrayUtils;
import abdulghani.tariq.models.GapGenerator;
import abdulghani.tariq.models.Order;
import abdulghani.tariq.models.SortingAlgorithm;

public class ShellSort implements SortingAlgorithm {
    @Override
    public int[] sort(int[] unsorted, Order order) {
        GapGenerator gaps = new GapGenerator(unsorted.length);
        gaps.forEach(gap -> {
            // traverse for each gap value loop
            for (int i = gap; i < unsorted.length; i++) {
                // compare and shift loop
                for (; ; ) {break; }
            }
        });
        return unsorted;
    }
}
