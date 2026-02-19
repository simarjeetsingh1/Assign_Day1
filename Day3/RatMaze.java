class RatMaze {

    static int N = 4;

    static boolean solveMaze(int[][] maze, int x, int y, int[][] sol) {

        if (x == N - 1 && y == N - 1 && maze[x][y] == 0) {
            sol[x][y] = 1;
            return true;
        }

        if (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 0) {

            sol[x][y] = 1;

            if (solveMaze(maze, x + 1, y, sol)) return true;
            if (solveMaze(maze, x, y + 1, sol)) return true;
            if (solveMaze(maze, x - 1, y, sol)) return true;
            if (solveMaze(maze, x, y - 1, sol)) return true;

            sol[x][y] = 0;
            return false;
        }

        return false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {0, 1, 0, 0},
                {0, 0, 0, 1},
                {1, 0, 0, 0},
                {1, 1, 0, 0}
        };

        int[][] sol = new int[N][N];

        if (solveMaze(maze, 0, 0, sol)) {
            for (int[] row : sol) {
                for (int cell : row)
                    System.out.print(cell + " ");
                System.out.println();
            }
        } else {
            System.out.println("No Solution");
        }
    }
}
