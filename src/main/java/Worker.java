public class Worker {
  String name;
  int age;
  double salary;
  public Worker(String name,int age,double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return  true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Worker worker = (Worker) obj;
    return age == worker.age && Double.compare(worker.salary,salary) == 0 && name.equals(worker.name);
  }

  public void  work() {
    System.out.println(name + "正在工作!!");
  }
  @Override
  public String toString() {
    return "姓名: " + name + " 年龄: " + age + " 工资: " +salary;
  }
}
