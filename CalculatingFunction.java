import java.io.*;
import java.util.*;

public class CalculatingFunction {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(f.readLine());
    long result = (n % 2 == 0) ? n / 2 : -(n+1)/2;
    System.out.println(result);
  }
}
