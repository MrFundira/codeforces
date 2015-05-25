import java.io.*;
import java.util.*;

public class SoldierBadges {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    StringTokenizer st = new StringTokenizer(f.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = Integer.parseInt(st.nextToken());
    boolean increased;
    int count = 0;
    do {
      Arrays.sort(a);
      increased = false;
      for (int i = 1; i < n; i++) {
        if (a[i - 1] == a[i]) {
           count++;
           increased = true;
           a[i]++;
        }
      }
    } while (increased);
    System.out.println(count);
  }
}
