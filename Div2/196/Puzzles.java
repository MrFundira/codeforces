import java.io.*;
import java.util.*;

public class Puzzles {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] puzzles = new int[m];
    st = new StringTokenizer(f.readLine());
    for (int i = 0; i < m; i++)
      puzzles[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(puzzles);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i + n - 1 < m; i++) {
      min = Math.min(min, puzzles[i + n - 1] - puzzles[i]);
    }
    System.out.println(min);
  }
}
