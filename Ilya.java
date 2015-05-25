import java.io.*;
import java.util.*;

public class Ilya {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int in = Integer.parseInt(f.readLine());

    int result;
    if (in > 0)
     result = in;
    else {
      result = Math.max(in / 10, (in / 100) * 10 + (in % 10));
    } 
    System.out.println(result);
  }
}
