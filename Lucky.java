/*
 * CodeForces - 110A
 * Nearly Lucky Number
 */
import java.io.*;
import java.util.*;

public class Lucky {
  public static void main(String[] args) throws IOException{
   BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
   String n = f.readLine();
   boolean valid = isLucky(digitCount(n, '4') + digitCount(n, '7'));
   System.out.println(valid ? "YES" : "NO");
   f.close();
   System.exit(0);
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
  private static int digitCount(String s, char c) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == c)
        count++;
    }
    return count;
  }
}
