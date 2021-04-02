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
            for (int i = gap; i < unsorted.length; i++) {
                int temp = unsorted[i];
                int j = i;
                while (j >= gap && unsorted[j - gap] > temp) {
                    unsorted[j] = unsorted[j - gap];
                    j -= gap;
                }
                unsorted[j] = temp;
            }
        });
        return unsorted;
    }
}
