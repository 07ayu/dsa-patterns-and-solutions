public class ArrayCC2 {
    public static void reverse_array(int arr[])
    {
        int f = 0;
        int l = arr.length - 1;
        int temp = 0;
        while (f < l) {
            temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
            f++;
            l--;
        }
    }

    public static void pritnpairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + " , " + arr[j] + ")");
            }
            System.out.println();
        }
    }
    
    public static void subArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("||");
            }
            System.out.println();
        }
    }
    
    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even[] = { 2, 4, 6, 8, 10 };
        // display(arr);
        // System.out.println();
        // reverse_array(arr);
        // display(arr);
        // pritnpairs(even);
        subArrays(even);
    }
}
