import java.io.*;
import java.util.*;

public class Horseshoe {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int[] nums = new int[4];
    StringTokenizer st = new StringTokenizer(f.readLine());
    for (int i = 0; i < 4; i++)
      nums[i] = Integer.parseInt(st.nextToken());
    Arrays.sort(nums);
    int count = 0;
    for (int i = 1; i < 4; i++) {
      if (nums[i-1] == nums[i])
        count++;
    }
    System.out.println(count);
  }
}
