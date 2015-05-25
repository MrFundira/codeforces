import java.io.*;
import java.util.*;

public class Insomnia {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(f.readLine());
    int l = Integer.parseInt(f.readLine());
    int m = Integer.parseInt(f.readLine());
    int n = Integer.parseInt(f.readLine());
    int d = Integer.parseInt(f.readLine());
    int count = 0;
    for (int i = 0 ; i < d; i++) {
      if ((i + 1) % k == 0 || (i + 1) % l == 0 ||
          (i + 1) % m == 0 || ((i + 1) % n == 0))
          count++;
    }
   System.out.println(count);
   f.close();
  }
}
