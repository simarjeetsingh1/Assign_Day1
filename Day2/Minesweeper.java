import java.util.*;

public class Minesweeper {

    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        char[][] board = new char[m][n];

        for (int i = 0; i < m; i++)
            board[i] = sc.next().toCharArray();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'E') {
                    int count = 0;
                    for (int d = 0; d < 8; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (ni >= 0 && nj >= 0 && ni < m && nj < n && board[ni][nj] == 'M')
                            count++;
                    }
                    board[i][j] = (char)(count + '0');
                }
            }
        }
        sc.close();
        for (char[] row : board)
            System.out.println(Arrays.toString(row));
    }
}
