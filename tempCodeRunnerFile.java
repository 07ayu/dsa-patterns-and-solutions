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

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                
                if(i == 0 ){
                    res.set(arr[i][j]);
                } 
                if(i == row -1){

                }

            }
        }
    }
}

    
    
    public static void main(String[] args) {
        
        int[] arr = { 0, 0, 1, 1, 1, 1, 2, 3, };

        int k = removeDuplicates(arr);

        for (int i : arr) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
