import java.io.*;
import java.util.*;

public class InitialBet {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    double total = 0;
    int count = 0;
    while (st.hasMoreTokens()) {
      total += Integer.parseInt(st.nextToken());
      count++;
    }
    if (total != 0 && Math.abs(total / count - Math.round(total / count)) < 10e-3) {
       System.out.println(Math.round(total / count));
    }
    else
      System.out.println(-1);
  }
}
