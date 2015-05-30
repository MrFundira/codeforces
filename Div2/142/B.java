import java.io.*;
import java.util.*;

public class B {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    StringTokenizer st = new StringTokenizer(f.readLine());
    HashSet<Long> set = primeSquares();
    while (n-- > 0)
      System.out.println(set.contains(Long.parseLong(st.nextToken()))
          ? "YES" : "NO");
  }

  public static HashSet<Long> primeSquares() {
    int sqrtLim = 1000001;
    boolean[] arr = new boolean [sqrtLim];
    for (int i = 2; i*i < sqrtLim; i++)
      if (!arr[i])
        for (int j = i * i; j < sqrtLim; j+=i)
          arr[j] = true;
    HashSet<Long> res = new HashSet<Long>();
    for (int i = 2; i < sqrtLim; i++)
      if (!arr[i]) {
        res.add((long) i * i);
      }
    return res;
  }
}
