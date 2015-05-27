import java.io.*;
import java.util.*;

public class C {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(f.readLine());
    StringTokenizer st = new StringTokenizer(f.readLine());
    int h1 = Integer.parseInt(st.nextToken());
    int a1 = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    int x1 = Integer.parseInt(st.nextToken());
    int y1 = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    int h2 = Integer.parseInt(st.nextToken());
    int a2 = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(f.readLine());
    int x2 = Integer.parseInt(st.nextToken());
    int y2 = Integer.parseInt(st.nextToken());
    HashSet<Integer> seen1 = new HashSet<Integer>();
    HashSet<Integer> seen2 = new HashSet<Integer>();
    int count = 0;
    boolean flag = false;
    while ((h2 != a2 ||  h1 != a1) && count < 10e6) {
      h1 = ((x1 % 7) * (h1%7) + (y1%7))%7;
      h2 = ((x2 % 7) * (h2%7) + (y2%7))%7;
      count++;
    }
    if (count < 10e6)
      System.out.println(count);
    else
      System.out.println(-1);
  }

}
