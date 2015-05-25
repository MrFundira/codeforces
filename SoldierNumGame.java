import java.io.*;
import java.util.*;

public class SoldierNumGame {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(f.readLine());
    while (t-- > 0) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int sum = 0;
      for (int i = b + 1; i <= a; i++)
          sum += totalPrimeFacs(i);

      System.out.println(sum);
         
    }
  }
  public static int totalPrimeFacs(int n) {
     int count = 0;
     int k = 2;
     while (n > 1) {
       while (n % k == 0) {
         n /= k;
         count++;
       }
       k++;
     }
     return count;
  }
}
