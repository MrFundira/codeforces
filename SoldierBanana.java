import java.io.*;
import java.util.*;

public class SoldierBanana {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int k = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    int result = Math.max(0, (w * k * (w + 1) / 2) - n);
    System.out.println(result);

    f.close();
  }
}
