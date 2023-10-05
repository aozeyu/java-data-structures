package com.amigoscode;

public class Test3 {
  public static void main(String[] args) {
    int[] ages = {10,20,30,40};
    // 打印任意整型
      printArray(ages);
    System.out.println("---------");
    int[] numbers = {1,2,3,4,5,6};
    printArray(numbers);
  }

  public static  void printArray(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i == arr.length - 1){
        //最后一个元素
        System.out.print(arr[i]);
      }else {
        System.out.print(arr[i]+ ",");
      }

    }
    System.out.println("]");
  }
}
