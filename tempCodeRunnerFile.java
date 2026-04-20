public class tempCodeRunnerFile {

    public static int removeDuplicates(int[] nums) {
        int sp = 0;
        int fp = 1;

        while (fp < nums.length) {

            if (nums[sp] != nums[fp]) {
                System.out.println(sp);
                nums[sp + 1] = nums[fp];
                sp++;
            }
            

            fp++;
        }
        // System.out.println(cp);
        return sp+1;
    }

    
    
    public static void main(String[] args) {
        
        int[] arr = { 0, 0, 1, 1, 1, 1, 2, 3, };

        int k = removeDuplicates(arr);

        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
