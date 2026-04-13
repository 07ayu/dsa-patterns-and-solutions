public class RecursionPractice {
    public static void printIndices(int arr[], int key, int index) {
        if (index == arr.length) {
            return;
        }

        if (arr[index] == key) {
            System.out.print(index + " ");
        }

        printIndices(arr, key, index + 1);
    }

    static String word[] = { "zero", "one", "two", "three", "four", "five", "six", "seven ", "eight", "nine" };

    public static void numberToWord(int number) {
        if (number == 0) {
            return;
        }
        numberToWord(number / 10);
        System.out.print(word[number % 10] + " ");
    }
     
    public static int strlen(String str) {

        if (str.length() == 0)
            return 0;

        return strlen(str.substring(1)) + 1;
    }
    
    public static int contigiuosString(String str, int i, int j , int n) {
        if (n == 1) 
            return 1;
        if (n <=0) 
            return 0;
        
        int res = contigiuosString(str, i + 1, j, n - 1) +
                contigiuosString(str, i, j - 1, n - 1)-
                contigiuosString(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }

        return res; 
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 5, 6, 2, 7, 2, 2 };
        String str = "abcab";
        // printIndices(arr, 2, 0);
        // numberToWord(1947);
        // System.out.println(strlen("abcde"));
        System.out.println(contigiuosString("abcab", 0, str.length()-1, str.length() ));
    }
}
