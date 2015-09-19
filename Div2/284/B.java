import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashMap;

public class B {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(in.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    HashMap<String, String> map = new HashMap<String, String>();
    for (int i = 0; i < m; i++) {
      st = new StringTokenizer(in.readLine());
      map.put(st.nextToken(), st.nextToken());
    }
    st = new StringTokenizer(in.readLine());
    while (st.hasMoreTokens()) {
      String s = st.nextToken();
      String lang2 = map.get(s);
      if (s.length() > lang2.length()) {
        System.out.print(lang2 + " ");
      }
      else {
        System.out.print(s + " ");
      }
    }
  }
} 
