import java.io.*;
import java.util.*;

public class WoodCutter {
  public static void main(String[] args) throws IOException {
    BufferedReader f =new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int[] trees = new int[n];
    int[] height = new int[n];
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      trees[i] = Integer.parseInt(st.nextToken()); 
      height[i] = Integer.parseInt(st.nextToken()); 
    }
    int count = Math.min(n, 2);
    boolean fellRight = false;
    for (int i = 1; i + 1 < n; i++) {
      if (trees[i] - height[i] > trees[i - 1] && 
         (!fellRight || trees[i -1] + height[i-1] < trees[i] - height[i])) {
         count++;
         fellRight = false;
      }
      else if (trees[i] + height[i] < trees[i + 1]) {
         count++;
         fellRight = true;
      }
    }
    System.out.println(count);
  }
}
