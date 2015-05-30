import java.io.*;
import java.util.*;

public class C {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int ans = 0;
    System.out.println(Math.min(m, Math.min(n, (m + n) / 3)));
  }
}
