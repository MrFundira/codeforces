import java.io.*;
import java.util.*;

public class GeneralArrival {
  public static void main(String[] args) throws IOException {
    BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(f.readLine());
    int count = 0;
    int[] soldiers = new int[n];
    StringTokenizer st = new StringTokenizer(f.readLine());
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int maxIndex = -1;
    int minIndex = -1;
    for (int i = 0; i < n; i++) {
      soldiers[i] = Integer.parseInt(st.nextToken());
      if (soldiers[i] > max) {
        max = soldiers[i];
        maxIndex = i;
      }
      if (soldiers[i] <= min) {
        min = soldiers[i];
        minIndex = i;
      }
    }
    while (minIndex != n - 1) {
      int temp = soldiers[minIndex];
      soldiers[minIndex] = soldiers[minIndex + 1];
      soldiers[minIndex + 1] = temp;
      if (minIndex + 1 == maxIndex)
        maxIndex--;
      minIndex++;
      count++;
    }
    while (maxIndex != 0) {
      int temp = soldiers[maxIndex];
      soldiers[maxIndex] = soldiers[maxIndex - 1];
      soldiers[maxIndex - 1] = temp;
      maxIndex--;
      count++;
    }
    System.out.println(count);
  }
}
