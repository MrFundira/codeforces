import java.io.*;
import java.util.*;

public class Dubstep {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    String[] s = f.readLine().split("WUB");
    for (int i = 0; i < s.length; i++) {
      if (!s.equals(""))
        System.out.print(s[i] + " ");
    }
  }
}
