public class subarrayHw {
 
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


    public static void sumSubArray(int arr[]) {
        int res;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                res = 0;
                for (int k = i; k <= j; k++) {
                    res += arr[k];
                }
                if (res > max) {
                    max = res;
                }
                System.out.println(res);
            }

        }
        System.out.println("The maximum of the sum of sub arrays = " + max);
    }

    public static void sumSubArrayOptimized(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int cursum = 0;
        int max = Integer.MIN_VALUE;
        //calculating the prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        //array traversal and starting index
        for (int start = 0; start < prefix.length; start++) {
            //calculating sum till end from start
            for (int end = start; end < prefix.length; end++) {
                cursum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];// end stores the maximum value and minus the last sum 
                if (cursum > max) {
                    max = cursum;
                }
            }

        }
        System.out.println(max);
    }

    public static void kadane(int arr[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (cs < 0) {
                cs = 0;
            }
            cs += arr[i];
            ms = Math.max(ms, cs);
        }
        System.out.println(ms);
    }

    public static void main(String[] args) {
        int even[] = { 1, -2, 6, -1, 3 };
        // sumSubArray(even);
        // sumSubArrayOptimized(even);
        // kadane(even);
    }
}