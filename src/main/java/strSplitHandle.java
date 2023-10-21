import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class strSplitHandle {
  public static List<String> h(String targetStr,String splitRule) {
    List<String> handleStrList = new ArrayList<>();
    if (targetStr !=null && targetStr != "" && splitRule !=null && splitRule != "") {
      String all[] = targetStr.toString().split(splitRule);
      if (all.length > 0) {
        handleStrList = Stream.of(all).collect(Collectors.toList());
      }
    }
    return handleStrList;
  }
}
