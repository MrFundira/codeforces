/*
 * CodeForces - 122A
 * LuckyDivision
 */

import java.io.*;
import java.util.*;

public class LuckyDivision {
  public static void main(String[] args) {
   try {
     BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(f.readLine());
     boolean found = isLucky(n);
     for (int i  = 1; i <= n / 2 && !found; i++) {
       if (n % i == 0 && isLucky(i))
         found = true;
     }
     System.out.println(found ? "YES" : "NO");
     f.close();
     System.exit(0);
    }
    catch (IOException e) {
      e.printStackTrace();
    }
  }
  private static boolean isLucky(int n) {
    if (n == 0)
      return false;
    while (n > 0) {
      if (n % 10 != 7 && n % 10 != 4)
        return false;
      n /= 10;
    }
    return true;
  }
}
