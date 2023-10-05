import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] arrays = new int[10];
        Random random = new Random();

        for (int i=0; i<arrays.length; i++){
            arrays[i] = random.nextInt(100)+1;
        }

        print(arrays);
        System.out.println();
        mergeSort(arrays);
        print(arrays);
    }
    private static void mergeSort(int[] arrays){
        int arrayLength = arrays.length;

        if (arrayLength<2) return;

        int middle = arrayLength/2;
        int[] leftSide =new  int[middle];
        int[] rightSide = new int[arrayLength - middle];

        for (int i=0; i<middle; i++){
            leftSide[i] = arrays[i];
        }
        for (int i=middle; i<arrayLength; i++){
            rightSide[i - middle] = arrays[i];
        }
        mergeSort(leftSide);
        mergeSort(rightSide);

        merge(arrays, leftSide, rightSide);
    }
    private static void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i=0, j=0, k=0;

        while (i<leftSize && j<rightSize){

            if (leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }else{
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while (i<leftSize){
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j<rightSize){
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    private static void print(int[] arrays){
        System.out.println(Arrays.toString(arrays));
    }
}