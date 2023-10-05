import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {

        Random random = new Random();
        int[] array = new int[10];

        for (int i=0; i<array.length;i++){
            array[i] = random.nextInt(100);
        }
        printArray(array);
        insertionSort(array);
        printArray(array);
    }
    private static void insertionSort(int[] array) {

        for (int i=1; i<array.length; i++){
            int currentNumber = array[i];

            int j = i-1;
            while (j>=0 && array[j] > currentNumber){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = currentNumber;
        }
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

}