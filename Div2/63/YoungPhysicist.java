import java.io.*;
import java.util.*;

public class YoungPhysicist {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int x = 0, y = 0, z = 0;
    while (n-- > 0) {
       StringTokenizer st = new StringTokenizer(f.readLine());
       x += Integer.parseInt(st.nextToken());
       y += Integer.parseInt(st.nextToken());
       z += Integer.parseInt(st.nextToken());
    }
    System.out.println((x == 0 && y == 0 && z == 0) ? "YES" : "NO");
    
  }
}
