import java.io.*;
import java.util.*;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(f.readLine()) * 2;
    while (--t % 3 != 0) {
    }

    System.out.println(t);
  }
}
