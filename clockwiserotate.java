import java.util.Scanner;

public class clockwiserotate {
    static void rightrotate(int a[][], int n) {
        int i, j;

        // Transpose matrix
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) { // Only upper triangle
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reverse each row
        for (i = 0; i < n; i++) {
            int low = 0, high = n - 1;
            while (low < high) {
                int temp = a[i][low];
                a[i][low] = a[i][high];
                a[i][high] = temp;
                low++;
                high--;
            }
        }

        System.out.println("The right rotated matrix:");
        // Print matrix
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t"); // Use print instead of println
            }
            System.out.println(); // New line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[][] a = new int[n][n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("The original matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t"); // Fixed print statement
            }
            System.out.println();
        }

        rightrotate(a, n);
        //sc.close();
    }
}
