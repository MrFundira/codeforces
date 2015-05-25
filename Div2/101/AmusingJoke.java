import java.io.*;
import java.util.*;

public class AmusingJoke {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    char[] a = f.readLine().toCharArray();
    char[] b = f.readLine().toCharArray();
    char[] c = f.readLine().toCharArray();
    boolean good = true;
    if (a.length + b.length != c.length) {
      good = false;
    }
    else {
      Arrays.sort(a);
      Arrays.sort(b);
      Arrays.sort(c);
      int j = 0, k = 0;
      for (int i = 0; i < c.length; i++) {
        if (j < a.length && c[i] == a[j])
          j++;
        else if (k < b.length && c[i] == b[k])
          k++;
        else {
          good = false;
          break;
        }
      }
    }
    System.out.println(good ? "YES" : "NO");
  }
}
