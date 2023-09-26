import java.util.ArrayList;
import java.util.Random;
import java.util.RandomAccess;

public class NumberTest {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 20; i++) {
      int number = random.nextInt(101);
      numbers.add(number);
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int number :
        numbers) {
      if (number > max) {

        max = number;
      }
      if (number < min) {
        min = number;
      }
    }
    System.out.println("随机数列表: " + numbers);
    System.out.println("最大值: "+ max);
    System.out.println("最小值: " + min);

  }
}
