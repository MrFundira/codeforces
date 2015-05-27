import java.io.*;
import java.util.*;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] nums = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i < n; i++)
      nums[i] = Integer.parseInt(st.nextToken());
    int max = nums[0];
    int min = max;
    int count = 0;
    for (int i = 1; i < n; i++) {
      if (nums[i] > max) {
        count++;
        max = nums[i];
      }
      else if (nums[i] < min) {
        count++;
        min = nums[i];
      }
    }
    System.out.println(count);
  }
}
