import java.io.*;
import java.util.*;

public class Translation {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    String s = f.readLine();
    String t = f.readLine();
    System.out.println(t.equals(reverse(s)) ? "YES" : "NO");
  }
  public static String reverse(String s) {
     return new StringBuffer(s).reverse().toString();
  }
}
