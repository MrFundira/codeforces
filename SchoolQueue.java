import java.io.*;
import java.util.*;

public class SchoolQueue {
  public static void main(String[] args) throws IOException {
    BufferedReader f =new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(st.nextToken());
    char[] children = f.readLine().toCharArray();
    while (t-- > 0) {
      for (int i = 1; i < n; i++) {
        if (children[i - 1] == 'B' && children[i] == 'G') {
          children[i - 1] = 'G';
          children[i] = 'B';
          i++;
        }
      }
    }
    System.out.println(new String(children));
  }
}
