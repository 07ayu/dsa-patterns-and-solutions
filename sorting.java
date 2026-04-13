import java.lang.reflect.Array;
import java.util.*;;

public class sorting {

    public static void bubblesort(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    display(arr);
                }
                System.out.println();
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }

            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionSort(int arr[]) {
        //
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding out the correct pos to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion    
            arr[prev + 1] = curr;
        }
    }
    
    public static void countSort(int arr[]) {
        // finding max range
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];
        // int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting 
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        Integer arr2[] = { 5, 4, 1, 3, 2 };
        int count[] = { 1, 4, 1, 3, 2, 4, 3, 7 };
        // bubblesort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // Arrays.sort(arr2, Collections.reverseOrder() );
        countSort(count);
        display(count);
    }
}