package com.amigoscode;

public class MethodDemo1 {
  public static void main(String[] args) {
      //java基本类型传递
    int a = 10;
    //只是在方法内部改变值
    change(a);
    //出来方法后 a还是10
    System.out.println(a);
  }

  public static void change(int a) {
    System.out.println(a); // 10
    a = 20;
    System.out.println(a); //20
  }

}
