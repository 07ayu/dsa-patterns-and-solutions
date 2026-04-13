import java.util.*;

public class ArrayCC {

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binnarysearch(int arr[], int key) {

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            else if (mid > key) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = 12;
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int index =0;
        //index = linearSearch(arr, key);
        index = binnarysearch(arr, key);
        if (index == -1) {
            System.out.println("key not pressent ");
        }
        else {
            System.out.println("key present at index " + index);
        }
    }
}