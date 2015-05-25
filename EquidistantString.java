import java.io.*;
import java.util.*;

public class EquidistantString {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    String s = f.readLine();
    String t = f.readLine();
    int xCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != t.charAt(i))
        xCount++;
    }
    if (xCount % 2 == 1)
      System.out.println("impossible");
    else {
      boolean tookS = false;
      boolean changed = false;
      StringBuilder result = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == t.charAt(i))
          result.append("0");
        else {
         if (tookS)
           result.append(t.charAt(i));
         else
           result.append(s.charAt(i));
         tookS = !tookS;
        }
      }
      System.out.println(result);
    }
  }
}
