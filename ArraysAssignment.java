public class ArraysAssignment {

    public static boolean check(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 1 };
        System.out.println(check(arr));
    }
}