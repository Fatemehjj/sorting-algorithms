import java.util.Arrays;
import java.util.Random;

public class SelectionSortTest {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random random = new Random();

        for (int i=0; i<numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        printArrays(numbers);
        selectionSort(numbers);
        printArrays(numbers);
    }
    private static void selectionSort(int[] numbers) {

        for (int i=0; i<numbers.length-1;i++){

            int min = i;
            for (int j=i+1; j<numbers.length; j++){

                if (numbers[j]<numbers[min])
                    min = j;
            }
            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
    }
    private static void printArrays(int[] numbers) {
        System.out.println(Arrays.toString(numbers));}
}