package abdulghani.tariq;

import java.util.Random;

public class ArrayRandomInitializer {

    private static Random random = new Random();

    public static int[] intInitializer(int size){
        int[] initialized = new int[size];
        for (int i = 0; i < initialized.length; i++) {
            initialized[i] = random.nextInt(1000);
        }
        return initialized;
    }
}
