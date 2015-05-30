import java.math.*;
import java.io.*;
import java.util.*;

public class B {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    BigInteger p = new BigInteger(f.readLine());
    BigInteger five = new BigInteger("5");
    BigInteger res = (new BigInteger("1")
                     .add(new BigInteger("2").modPow(p, five))
                     .add(new BigInteger("3").modPow(p, five))
                     .add(new BigInteger("4").modPow(p, five)))
                     .mod(five);
    System.out.println(res);
  }
}
