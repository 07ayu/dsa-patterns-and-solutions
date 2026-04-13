// import java.util.*;

public class code {
 
    public static void hollowRectangle(int n, int l) {

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < l; col++) {
                if (row == 0 || row == n - 1 || col == 0 || col == l - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    
    public static void invertedHalfPyramin(int n) {
        for (int i = 1; i <= n; i++) {
            //space 
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void invertedHalfPyramin_number(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void triange01(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    
    public static void butterfly(int n) {
        //line
        for (int i = 1; i <= n; i++) {
            //normal star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            //space
            for (int k = 1; k <= (n - i) * 2; k++) {
                System.out.print("  ");
            }
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            //normal star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");

            }
            //space
            for (int k = 1; k <= i * 2 - 2; k++) {
                System.out.print("  ");
            }
            //star
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //star
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //space 
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            //star
            for (int k = 1; k <= n; k++) {
                if (k == 1 || k == n || i == 1 || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n - 1; i++) {
            // space 
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            //stars
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 0; i--) {
            // space 
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            //stars
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     public static void main(String[] args) {
         // hollowRectangle(5, 4);
        // invertedHalfPyramin(4);
        // invertedHalfPyramin_number(5);
        // floyds_triangle(5);
        // triange01(5);
        // butterfly(4);
        // rhombus(5);
        // hollow_rhombus(5);
        diamond(5);
    }
 }