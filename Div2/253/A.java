import java.io.*;
import java.util.*;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader f =new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine(), "{} ,");
    HashSet<String> set = new HashSet<String>();
    while (st.hasMoreTokens())
      set.add(st.nextToken());
    System.out.println(set.size());
  }
}
