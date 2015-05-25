import java.io.*;
import java.util.*;

public class SoldierCards {
  public static void main(String[] args)  throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    ArrayList<Integer> p1 = new ArrayList<Integer>();
    ArrayList<Integer> p2 = new ArrayList<Integer>();
    StringTokenizer st = new StringTokenizer(f.readLine());
    int k1 = Integer.parseInt(st.nextToken()); 
    for (int i = 0; i < k1; i++)
      p1.add(Integer.parseInt(st.nextToken())); 
    st = new StringTokenizer(f.readLine());
    int k2 = Integer.parseInt(st.nextToken()); 
    for (int i = 0; i < k2; i++)
      p2.add(Integer.parseInt(st.nextToken())); 
    int count = 0;
    ArrayList<Integer> p1cl = (ArrayList<Integer>) p1.clone();
    ArrayList<Integer> p2cl = (ArrayList<Integer>) p2.clone();
    boolean fail = false;
    while (!p1.isEmpty() && !p2.isEmpty()) {
      if (count > 1000000){//(p1cl.equals(p1) || p2cl.equals(p2) && count > 0)) {
         fail = true;
         break;
      }
      if (p1.get(0) > p2.get(0)) {
        p1.add(p2.remove(0));
        p1.add(p1.remove(0)); 
      }
      else {
        p2.add(p1.remove(0));
        p2.add(p2.remove(0));
      }
      count++;
    }
    if (fail)
      System.out.println(-1);
    else
      System.out.println(count + " " + ((p1.isEmpty()) ? 2 : 1));
    f.close();
  }
}
