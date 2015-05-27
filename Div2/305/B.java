import java.io.*;
import java.util.*;

public class B {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int q = Integer.parseInt(st.nextToken());
    int[][] grid = new int[n][m];
    int[] rowcount = new int[n];
    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      int count = 0;
      for (int j = 0; j < m; j++) {
        grid[i][j] = Integer.parseInt(st.nextToken());
        if (grid[i][j] == 1)
          count++;
        else
          count = 0;
        rowcount[i] = Math.max(rowcount[i], count);
      }
    }
    while (q-- > 0) {
      st = new StringTokenizer(br.readLine());
      int x = Integer.parseInt(st.nextToken())-1;
      int y = Integer.parseInt(st.nextToken())-1;
      if (grid[x][y] == 0) {
        grid[x][y] = 1;
        rowcount[x]++;
      }
      else {
        grid[x][y] = 0;
        rowcount[x]--;
      }
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < n; i++)
        max = Math.max(max, rowcount[i]);
      System.out.println(max);
    }
        
  }    
}
