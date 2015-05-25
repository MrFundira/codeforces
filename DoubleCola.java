/* 
 * Codeforces
 * Double cola
 */
import java.io.*;
import java.util.*;

public class DoubleCola {
  public static void main(String[] args) throws IOException {
   BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
   int n = Integer.parseInt(f.readLine());
   ArrayList<String> peeps = new ArrayList<String>(Arrays.asList(
       "Sheldon", "Leonard", "Penny", "Rajesh", "Howard"));
   String current;
   do {
     String front = peeps.remove(0);
     peeps.add(front);
     peeps.add(front);
     current = front;
   }
   while (--n > 0);
  
   System.out.println(current);
  }
}
