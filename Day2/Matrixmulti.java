import java.util.*;

public class Matrixmulti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        int[][] A = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
        
        int n2 = sc.nextInt(), p = sc.nextInt();

        if (n != n2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] B = new int[n2][p];
        for (int i = 0; i < n2; i++)
            for (int j = 0; j < p; j++)
                B[i][j] = sc.nextInt();

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < n; k++)
                    C[i][j] += A[i][k] * B[k][j];

        for (int[] row : C)
            System.out.println(Arrays.toString(row));
       
    }
}
