package patternBased.twoPointer;

public class TwoPointerBasic {
    
    public static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1, temp = 0;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    
    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {

            if (!Character.isLetterOrDigit(str.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(j))) {
                j--;
                continue;
            }

            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }
        return true;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        
        return false;
    }

    public static String reverseVowel(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        char temp = ' ';

        while (i < j) {

            if (!isVowel(arr[i])) {
                i++;
                continue;
            }
            if (!isVowel(arr[j])) {
                j--;
                continue;
            }

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;

            i++;
            j--;

        }

        return new String(arr);
    }
    

    public static void MergeSortTwoPointer(int arr1[], int m, int arr2[], int n) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

    }

    // public static void mergeAdv(int arr1[], int arr2) {
    //     int i = arr1.length - 1; // lst index of arr1
    //     int j = 0; // 1st index of arr2

    //     //both arrays are already sorted before swaping elements 
        
    //     //compare the 
    // }
    
    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 0, 0, 0};
        // int arr2[] = { 2, 5, 6 };
        int arr[] = { 4, 5, 6, 0, 0, 0 };
        int arr2[] = { 1, 2, 3 };
        

        MergeSortTwoPointer(arr, 3, arr2, 3);
        printArr(arr);
    }
}
