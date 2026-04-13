package divideNconquer;

public class mergeSort {


    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSortFunc(int arr[], int si, int ei) {

        if (si >= ei ) {
            return;
        }

        int mid = si + (ei - si) / 2;
        mergeSortFunc(arr, si, mid);
        mergeSortFunc(arr, mid + 1, ei);
        merge(arr, si, mid, ei);

    }
    
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];

        int i = si;//iterator for left
        int j = mid + 1;//iterator for right
        int k = 0;//iterator for temp array

        while (i <= mid && j <= ei) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;

            }
            k++;
        }
        //left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (int k2 = 0, i2 = si; k2 < temp.length; k2++, i2++) {
            arr[i2] = temp[k2];
        }

    }
    
    public static void quickSort(int arr[], int si, int ei) {

        if (si >= ei)
            return;

        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1);//left
        quickSort(arr, pIdx + 1, ei);//right

    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make space for smaller element
        for (int j = si; j < ei; j++) {
           if (arr[j] < pivot) {
               i++;
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
           }

        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
            
        
        return i;
    }

    public static int searchRotated(int arr[], int si, int ei, int tar) {
        if (si > ei)
            return -1;

        int mid = si + (ei - si) / 2;// calculate mid
        
        if (arr[mid] == tar) {
            return mid;
        }

        if (arr[si] <= arr[mid]) {
            if(arr[si] <= tar && tar <=arr[mid] ){ //1st line
               return searchRotated(arr, si, mid - 1, tar);
            } else {
                return searchRotated(arr, mid + 1, ei, tar);
            }
        } else {
            if(arr[mid] <= tar && tar <= arr[ei]){//2nd line
                return searchRotated(arr, mid + 1, ei, tar);
        }   else {
                return searchRotated(arr, si, mid - 1, tar);
            }
        }

    }   

    public static void main(String[] args) {
        // int arr[] = { 6, 3, 9, 8, 2, 5 };
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };

        // mergeSortFunc(arr, 0, arr.length-1);
        // quickSort(arr, 0, arr.length-1);
        System.out.println(searchRotated(arr, 0, arr.length - 1, 1));
        // printArray(arr);
    }
}