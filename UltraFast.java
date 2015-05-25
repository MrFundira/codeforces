import java.io.*;
import java.util.*;

public class UltraFast {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    String s = f.readLine();
    String t = f.readLine();
    for (int i = 0; i < s.length(); i++) {
      System.out.print(s.charAt(i) == t.charAt(i) ? 0 : 1);
    }
  }
}
