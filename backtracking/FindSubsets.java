public class FindSubsets {

    public static void subsetsFind(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // yes
        subsetsFind(str, ans + str.charAt(i), i + 1);

        // no
        subsetsFind(str, ans, i + 1);
    }
    
    public static void findPermutations(String str, String ans) {
        //baseCase
        if (str.length() == 0) {
            System.out.println(ans);
        }
    
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans+curr);
        }

    }


    public static void main(String args[]) {
        


        // subsetsFind("abc", "", 0);
        findPermutations("abc", "");

    }
}