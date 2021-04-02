package abdulghani.tariq;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] ints = {10, 1, 4, 8, 90, 15, 35, 7, -7, 20, -8, 18, 9};
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
        for(int i = gap; i< ints.length; i ++){
            int temp = ints[i];
            int j;
            // rearrange sorted partition
            // by looking for insertion point of temp

            for (j = i; j>= gap && ints[j-gap] > temp; j = j-gap) {
                ints[j] = ints[j - gap];
            }
            ints[j] = temp;
        }
        for(int i: ints){
            System.out.println(i);
        }
    }
}
