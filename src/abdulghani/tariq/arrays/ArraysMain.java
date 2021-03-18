package abdulghani.tariq;

public class ArraysMain {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = ArrayRandomInitializer.intInitializer(10);
        for (int num: numbers) {
            System.out.println(num);
        }
    }
}
