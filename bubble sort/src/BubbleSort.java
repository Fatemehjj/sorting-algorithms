import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[10];

        for (int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(1000);
        }
        print(numbers);
        System.out.println();

        boolean swap= true;

        while (swap) {

            swap = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }

        }

        print(numbers);
    }
    private static void print(int[] numbers){
        System.out.println(Arrays.toString(numbers));
    }
}