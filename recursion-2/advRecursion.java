public class advRecursion {

    public static int tillingProblem(int n) {
        int tCount = 0;
        if (n == 1 || n == 0)
            return 1;

        return tillingProblem(n - 1) + tillingProblem(n - 2);
    }
    
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendPair(int n) {

        if (n == 1 || n == 2)
            return n;

        return friendPair(n - 1) + (n - 1) * friendPair(n - 2);
    }

    public static void printBinary(int n , int LastState, String str)
    {
        // System.out.println();
        if (n == 0 || LastState > 1 && LastState < 0) {
            System.out.println(str);
            return;
        }

        printBinary(n - 1, 0, str + "0");
        if (LastState == 0) {
            printBinary(n - 1, 1, str + "1");
        }

    }

    public static void main(String[] args) {

        String str = "appnacollege";

        // System.out.println(tillingProblem(4));
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendPair(4));
        printBinary(3, 0, "");
    }
}