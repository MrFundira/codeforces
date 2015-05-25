import java.io.*;
import java.util.*;

public class SoString {
  public static void main(String[] args) {
   try {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(f.readLine());
    String q = f.readLine();
    boolean found;
    if (k > q.length())
      System.out.println("NO");
    else if (k == 1) {
      System.out.println("YES");
      System.out.println(q);
    }
    else {      
      found = k <= charCount(q);
      if (found) {
        System.out.println("YES");
        printStrings(q, k);
      }
      else {
        System.out.println("NO");
      }
    }
    f.close();
    System.exit(0);
   }
   catch (IOException e) {
    e.printStackTrace();
   }
  }
  private static void printStrings(String s, int k) {
    int[] indices = new int[k];
    int i = 1;
    for (int j = 1; j < s.length(); j++) {
      if (s.charAt(j) != s.charAt(indices[i - 1]) && i < k) {
        indices[i] = j;
        i++;
      }
    }
    for (int j = 1; j < indices.length; j++) {
      System.out.println(s.substring(indices[j-1], indices[j]));
    }
   System.out.println(s.substring(indices[k-1]));
  }
  private static int charCount(String q) {
    HashSet<Character> hash = new HashSet<Character>();
    for (int i = 0; i < q.length(); i++) {
        hash.add(q.charAt(i));
      }
    return hash.size();
  }
}
