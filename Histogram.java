package histogram;
import java.util.Random;
/**
 *
 * @author Dima
 */
public class Histogram {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int tries = 1000000;
        for(int i = 0; i < tries; i++) {
            int num = new Random().nextInt(10);
            numbers[num]++;
        }
        System.out.println("Total tries:" + tries);
        System.out.println("Original Array:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max)
                max = numbers[i];
        }
        System.out.println("Max number is: " + max);
        int scale = 50;
        for(int i = 0; i < numbers.length; i++) {
            int stars = numbers[i] * scale / max;
            System.out.print(i + ": ");
            for(int j = 0; j < stars; j++) {
               System.out.print("*");
            }
            System.out.print(" " + numbers[i] + " times.");
            System.out.println();
        }
    }   
}