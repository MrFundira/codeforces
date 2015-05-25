import java.io.*;
import java.util.*;

public class Design {
  public static void main(String[] args) {
   try {
     BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
     int n = Integer.parseInt(f.readLine());
     boolean found = false;
     for (int i = 4; i <= n / 2 && !found; i++) {
       if (!isPrime(i) && !(isPrime(n - i))) {
         System.out.println(i + " " + (n - i));
         found = true;
       }
     }
     f.close();
     System.exit(0);
   }
   catch (IOException e) {
     e.printStackTrace();
   }
  }
  public static boolean isPrime(long n) { 
    if (n <= 3)
      return n > 1;
    if (n % 2 == 0 || n % 3 == 0)
      return false;
    for (int i = 5; i*i <=n; i+=6) {
      if (n % i == 0 || n % (i+2) == 0)
      return false; 
    }
    return true;
  }
}
