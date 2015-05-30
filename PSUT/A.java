import java.io.*;
import java.util.*;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    String s = f.readLine();
    boolean yes = true;
    for (int i = 0; i < s.length(); i++)
      if (s.charAt(i) == '?')
        yes = false;
    System.out.println(yes ? "Yes" : "No");
  }
}
