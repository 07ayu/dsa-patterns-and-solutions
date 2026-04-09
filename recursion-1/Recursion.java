public class Recursion {
 
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printDec(n - 1);
    }
    
    public static void printInc(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printInc(n - 1);
        System.out.println(n);
    }
    
    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);

    }

    public static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
    
    public static int fibonacci(int n) {
        if (n == 1 || n == 2)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    public static boolean arraySorted(int[] arr, int i) {

        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1])
            return false;

        return arraySorted(arr, i + 1);
    }
    
    public static int firstOccur(int arr [], int i , int n) {
        if (i == arr.length-1)
            return -1;
        if (arr[i] == n) {
            return i;
        }
        return firstOccur(arr, i+1, n);
    }

    public static int lastOccur(int arr [], int i , int n) {

        if (i == arr.length)
            return -1;
        
        int isFound = lastOccur(arr, i + 1, n);
        
        if (isFound == -1 && arr[i] == n) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0)
            return 1;

        int halfPower = power(x, n / 2);

        if (n % 2 != 0) {
            return x * halfPower;
        }

        return halfPower * halfPower;
    }

    public static void main(String[] args) {
        int n = 8;
        int arr []= {1,5,3,4,5,3};
        // printDec(n);
        // printInc(n);
        // System.out.println(fact(n));
        // System.out.println(sum(n));
        // System.out.println(fibonacci(n));
        // System.out.println(arraySorted(arr, 0));
        // System.out.println(lastOccur(arr, 0 ,5));
        System.out.println(power(5, 4));
    }
}
