package abdulghani.tariq.merge_sort;

public class MergeSortMain {
    static int  recursionTreeLeve = 0;

    public static void main(String[] args) {
        int[] ints = {10,27, -9, 47, 0,7,3,8,30,500, -50};
        split(ints, 0, ints.length-1);
    }

    public static void split(int[] intArray, int startIndex, int endIndex) {
        System.out.println("recursion level: " + recursionTreeLeve ++ );

        if(endIndex - startIndex < 2){
            return;
        }

        int mid = (startIndex + endIndex) / 2;
        System.out.println(String.format("left array: { %d, %d }, right array: { %d, %d}",startIndex, mid, mid+1, endIndex));
        split(intArray, startIndex, mid);
        split(intArray, mid+1, endIndex);

    }

    public static void merge(int[] intArray, int startIndex, int endIndex){

    }

}
