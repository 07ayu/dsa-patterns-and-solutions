

package patternBased.twoPointer.squareSorted;

// import java.util.*;

class SquareSorted {
 
    public static int[] sortedSquare(int[] nums) {
        int[] res = new int[nums.length];

        int lp = 0, rp = nums.length - 1, idx = nums.length - 1;

        while (lp <= rp) {
            int l = nums[lp] * nums[lp];
            int r = nums[rp] * nums[rp];

            if (l > r) {
                res[idx--] = l;
                lp++;
            } else {
                res[idx--] = r;
                rp--;
            }
        }
        return res;
    }

    public static void printArr(int[] arr) {
        int[] res = sortedSquare(arr);

        for (int i = 0; i<  res.length; i++ ) {
            System.err.print(res[i]+ " ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = { -4, -1, 0, 3, 10 };
        int arr[] = { -7, -3, 2, 3, 11 };

        printArr(arr);
    }
    
}