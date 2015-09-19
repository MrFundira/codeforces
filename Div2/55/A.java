import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class A {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int upperCount = 0, lowerCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i)))
        upperCount++;
      else
        lowerCount++;
    }
    System.out.println((upperCount > lowerCount) ? s.toUpperCase() :
        s.toLowerCase());
  }
}
