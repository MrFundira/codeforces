import java.io.*;
import java.util.*;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader f =new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(f.readLine());
    int b = Integer.parseInt(f.readLine());
    int c = Integer.parseInt(f.readLine());
    int max = 0;
    max = Math.max(max, a + b * c);
    max = Math.max(max, a * b + c);
    max = Math.max(max, a * (b + c));
    max = Math.max(max, a + (b + c));
    max = Math.max(max, a * b * c);
    max = Math.max(max, (a + b) * c);
    System.out.println(max);
  }
}
