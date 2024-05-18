import java.util.*;
public class Main {
    public static int N,M,cnt = 0;
    public static int[][] graph;
    public static boolean[] visited;

    public static void dfs(int vertex)
    {
        for (int i = 1; i <= N; i++)
        {
            if (graph[vertex][i] == 1 && !visited[i])
            {
                cnt++;
                visited[i] = true;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 정점, vertex
        M = sc.nextInt(); // 간선, edge

        graph = new int [N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph[start][end] = 1;
            graph[end][start] = 1;
        }

        int root = 1;
        visited[root] = true;
        dfs(root);
        System.out.println(cnt);
    }
}