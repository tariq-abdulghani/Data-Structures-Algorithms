package abdulghani.tariq.arrays;

public class IntArrayUtils {

    public static void swap(int[] intArray, int i, int j) {
        if(i == j){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

    public static int getMaxIndex(int[] ints, int lastIndex){
        int tempIndex = 0;
        for(int i=0; i<=lastIndex; i ++){
            if (ints[i]  > ints[tempIndex]) {
                tempIndex = i;
            }
        }
        return tempIndex;
    }

    public static int getMinIndex(int[] ints, int lastIndex){
        int tempIndex = 0;
        for(int i=0; i<=lastIndex; i ++){
            if (ints[i] < ints[tempIndex]) {
                tempIndex = i;
            }
        }
        return tempIndex;
    }
}
