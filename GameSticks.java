import java.io.*;
import java.util.*;

public class GameSticks {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(f.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    System.out.println((Math.min(n, m) % 2 == 0 ? "Malvika" : "Akshat"));   
  }
}
