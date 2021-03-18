package abdulghani.tariq.bubble_sort;

public class BubbleSortMain {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello bubble sort");
        int[] intArray = {9, 1,4,50, 2, 45, -9};
        BubbleSort bubbleSort = new BubbleSort();
        intArray = bubbleSort.sort(intArray);

        for (int i: intArray
             ) {
            System.out.println(i);
        }
    }
}
