import java.io.*;
import java.util.*;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    boolean flag = true;
    String s = br.readLine();
    int k = Integer.parseInt(br.readLine());
    if (s.length() % k != 0)
      flag = false;
    else {
      int i = 0;
      while (i + s.length() / k <= s.length()) {
        if (!palindromic(s.substring(i, i + s.length() / k))) {
          flag = false;
          break;
        }
        i += s.length() / k;
      }
    }
    System.out.println(flag ? "YES" :"NO");
  }
  public static boolean palindromic(String s) {
    return (new StringBuffer(s)).reverse().toString().equals(s);
  }
}
