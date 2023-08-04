import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random random = new Random();

        for (int i=0; i<numbers.length; i++){
          numbers[i]=random.nextInt(100);
        }
        printArray(numbers);
        quickSort(numbers, 0, numbers.length-1);
        System.out.println();
        printArray(numbers);
    }

    private static void quickSort(int[] numbers, int low, int high) {
        if (high<=low) return;

       // int pivotRandom = new Random().nextInt(high-low)+low;
        int pivot=numbers[high];
        //swap(numbers, high, high);

        int partition= partition(numbers, low, high, pivot);

        quickSort(numbers, low,partition-1);
        quickSort(numbers, partition+1, high);
    }
    private static int partition(int[] numbers, int low, int high, int pivot){
        int i = low;
        int j= high-1;

        while (i<j){
            while (numbers[i]<=pivot && i<j){
                i++;
            }
            while (numbers[j]>=pivot && i<j){
                j--;
            }
            swap(numbers,i, j);
        }
        if (numbers[i]>numbers[high]){
            swap(numbers, i, high);
        }
       else {
            i = high;
        }
        return i;
    }
    private static void swap(int[] index, int index1, int index2){

        int temp = index[index1];
        index[index1] = index[index2];
        index[index2] = temp;
    }

    private static void printArray(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}