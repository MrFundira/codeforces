import java.io.*;
import java.util.*;

public class EpicGame {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int count = 0;
    do {
      n -= gcd(n, count % 2 == 0 ? a: b);
      count++;
    } while (n >= 0);
    System.out.println(count % 2);
  }
  public static int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }
}
