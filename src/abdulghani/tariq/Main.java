package abdulghani.tariq;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] ints = {10, 1, 4, 8, 90, 15, 35, 7, -7, 20, -8, 18, 9, 0};
        int gap = 3;
//        for (int i = gap; i < ints.length; i++) {
//            int temp = ints[i];
//            int j=i;
//            while (j>= gap && ints[j-gap] > temp){
//                ints[j] = ints[j - gap];
//                j -= gap;
//            }
//            ints[j]=temp;
//    }

        // increase sorted partition by one
//        for(int i = gap; i< ints.length; i ++){
//            int temp = ints[i];
//            int j;
//            // rearrange sorted partition
//            // by looking for insertion point of temp
//
//            for (j = i; j>= gap && ints[j-gap] > temp; j = j-gap) {
//                ints[j] = ints[j - gap];
//            }
//            ints[j] = temp;
//        }


        // sell sort

        // traversing unsorted part
        for(int unsortedIndex=1; unsortedIndex < ints.length; unsortedIndex++){
            int temp = ints[unsortedIndex];
            int j;
            // finding insertion point loop
            for(j = unsortedIndex; j> 0 && ints[j-1] /*shift only if j-1 element is less*/> temp; j --){
                ints[j] = ints[j - 1]; // shift by one to the right to make space for the inserted element.
            }
            // out side the loop we found insertion point?
            ints[j] = temp;
        }

        for(int i: ints){
            System.out.println(i);
        }
    }
}
