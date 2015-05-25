import java.io.*;
import java.util.*;

public class SoldierTraveling {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(f.readLine());
    int m = Integer.parseInt(f.readLine());
    st = new StringTokenizer(f.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    int[] b = new int[n];
    for (int i = 0; i < n; i++)
      b[i] = Integer.parseInt(st.nextToken());
    boolean[][] connected = new boolean[n][n];
    while (m-- > 0) {
      st = new StringTokenizer(f.readLine());
      int p = Integer.parseInt(st.nextToken());
      int q = Integer.parseInt(st.nextToken());
      connected[p-1][q-1] = true;
      connected[q-1][p-1] = true;
    }
   int[][] movement = new int[n][n];
   for (int i = 0; i < n; i++)
      movement[i][i] = a[i];
   
   
  }
}
