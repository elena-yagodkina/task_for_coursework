import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    String[] names = {"Anna", "Oleg", "Sergei", "Anna", "Igor", "Alexandra", "Anna"};
    String uniqueNames = Arrays.stream(names).distinct().collect(Collectors.toList()).toString();
    System.out.println(uniqueNames);
  }
}
