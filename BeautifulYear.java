import java.io.*;
import java.util.*;

public class BeautifulYear {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(solve(Integer.parseInt(f.readLine())));
  }
  public static int solve(int y) {
    for (int i = y + 1; ; i++) {
      char[] chars = String.valueOf(i).toCharArray();
      Arrays.sort(chars);
      if (distinct(chars))
        return i;
    }
  }
  public static boolean distinct(char[] a) {
    for (int i = 1; i < a.length; i++)
     if (a[i-1] == a[i])
       return false;
    return true;
  }
}
