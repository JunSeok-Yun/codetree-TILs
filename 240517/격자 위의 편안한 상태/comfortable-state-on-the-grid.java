import java.util.*;
public class Main {
    public static int N, M, cnt, ans = 0;
    public static int[][] arr;
    public static int r, c, nx, ny;
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};

    public static boolean inrange(int x, int y)
    {
        return (x >= 0 && y >= 0 && x < N && y < N);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[N][N];

        for (int i = 0; i < M; i++)
        {
            r = sc.nextInt();
            c = sc.nextInt();
            arr[r - 1][c - 1] = 1;
            cnt = 0;
            for (int j = 0; j < 4; j++)
            {
                nx = r - 1;
                ny = c - 1;
                nx += dx[j];
                ny += dy[j];
                if (inrange(nx, ny) && arr[nx][ny] == 1)
                    cnt++;
                else
                    continue;
            }
            if (cnt == 3)
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}