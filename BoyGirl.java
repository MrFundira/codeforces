import java.io.*;
import java.util.*;

public class BoyGirl {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    String s = f.readLine();
    int[] alpha = new int[26];
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (alpha[s.charAt(i) -97] == 0)
        count++; 
      alpha[s.charAt(i) - 97]++;
    }
    System.out.println(count % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    f.close();
  }
}
