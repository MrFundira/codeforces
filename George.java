import java.util.*;
import java.io.*;

public class George {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int count = 0;
    while (n-- > 0) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      int p = Integer.parseInt(st.nextToken());
      int q = Integer.parseInt(st.nextToken());
      if (q - p >= 2) {
         count++;
      }
    }
    System.out.println(count);
  }
}
