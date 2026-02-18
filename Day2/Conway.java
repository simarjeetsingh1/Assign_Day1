import java.util.*;

public class Conway {

    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] board = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = sc.nextInt();

        int[][] next = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int live = 0;

                for (int d = 0; d < 8; d++) {
                    int ni = i + dx[d];
                    int nj = j + dy[d];
                    if (ni >= 0 && nj >= 0 && ni < m && nj < n && board[ni][nj] == 1)
                        live++;
                }

                if (board[i][j] == 1) {
                    if (live == 2 || live == 3)
                        next[i][j] = 1;
                } else {
                    if (live == 3)
                        next[i][j] = 1;
                }
            }
        }
        sc.close();
        for (int[] row : next)
            System.out.println(Arrays.toString(row));
    }
}
