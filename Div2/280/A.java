import java.io.*;
import java.util.*;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int i = 1;
    int total = 0;
    int count = 0;
    int add = 1;
    while (total+add <= n) {
      add = (i +1)*i/2;
      total += add;
      i++;
      count++;
    }
    System.out.println(count);
  }
}
