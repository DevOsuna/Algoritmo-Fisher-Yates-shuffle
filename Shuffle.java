import java.util.Random;

public class Shuffle {

    public static void shuffle(String[] array) {

        int n = array.length;
        Random random = new Random();
        
        for (int i = 0; i < array.length; i++) {
           
            int randomValue = i + random.nextInt(n - i);

            String randomElement = array[randomValue];
            array[randomValue] = array[i];
            array[i] = randomElement;
        }
    }
}