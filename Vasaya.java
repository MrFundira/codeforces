import java.io.*;
import java.util.*;

public class Vasaya {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int total = n / m + n;
    total += (total - n) / m;
    System.out.println(total);
  }
}
