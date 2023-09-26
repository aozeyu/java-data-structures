import java.util.ArrayList;

public class RemoveAStrings {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>();
    strings.add("apple");
    strings.add("banana");
    strings.add("avocado");
    strings.add("cherry");
    strings.add("apricot");
    for (int i = 0; i< strings.size(); i++) {
      String str = strings.get(i);
      if (str.startsWith("a")) {
        //删除以a开头的
        strings.remove(i);
        i--;
      }
    }
    System.out.println(strings  );
  }
}
