/*
 * CodeForces - 160A
 * Twins
 */

import java.io.*;
import java.util.*;

public class Twins {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int[] coins = new int[n];
    StringTokenizer c = new StringTokenizer(f.readLine());
    for (int i = 0; i < n; i++) {
      coins[i] = Integer.parseInt(c.nextToken());
    }
    Arrays.sort(coins);
    int sum = sum(coins);
    int mycoins = 0;
    int num = 0;
    for (int i = n - 1; i >= 0; i--) {
      if (mycoins <= sum / 2) {
        mycoins += coins[i];
        num++; 
      }
      else {

        break;
      }
    }
    System.out.println(num);
    f.close();
    System.exit(0);
  }
  private static int sum(int[] a) {
    int sum = 0;
    for (int i = 0; i < a.length; i++)
      sum += a[i];
    return sum;
  }
}
