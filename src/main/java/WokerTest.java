import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class WokerTest {
  public static void main(String[] args) {
    List<Worker> workers = new ArrayList<>();
    workers.add(new Worker("zhang3",18,3000));
    workers.add(new Worker("li4",25,3500));
    workers.add(new Worker("wang5",22,3200));
    //在李四前面插入
    workers.add(1,new Worker("zhao6",24,3300));
    workers.remove(new Worker("wang5",22,3200));
    for (Worker worker:workers
         ) {
      System.out.println(worker);
    }

    ListIterator<Worker> iterator = workers.listIterator();
    while (iterator.hasNext()) {
      Worker worker = iterator.next();
      worker.work();
      System.out.println("213213");
    }
  }
}
