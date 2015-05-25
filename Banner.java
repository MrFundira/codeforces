import java.util.*;
import java.io.*;

public class Banner {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    String code = "CODEFORCES";
    int j = 0;    // index through code
    boolean[] flags = {false, false, false};
    String s = f.readLine();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == code.charAt(j) && j < code.length()) {
        j++;
        flags[0] = true;
        if (flags[1]) {
          flags[2] = true;
        }
      }
      else {
       if (flags[0])
         flags[1] = true;
      }
    }
    if (j != code.length( ) || flags[2] )
      System.out.println("NO");
    else
      System.out.println("YES");
  }
}
