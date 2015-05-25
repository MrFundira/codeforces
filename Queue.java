import java.io.*;
import java.util.*;

public class Queue {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int[] nums = new int[n];
    StringTokenizer st = new StringTokenizer(f.readLine());
    for (int i = 0; i < n; i++)
      nums[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(nums);
    int count = n;
    int total = 0;
    for (int i = 0; i < n; i++) {
      if (nums[i] < total)
        count--;
      total += nums[i];
    }
    System.out.println(count);
  }
}
