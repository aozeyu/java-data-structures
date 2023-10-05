package com.amigoscode;

public class MethodTest4 {
  public static void main(String[] args) {
    int[] arr = {1,3,4,5};
      int index = searchIndex(arr,5);
    System.out.println(index);
  }

  public static int searchIndex(int[] arr, int data) {
    //开始找
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == data) {
        return i;
      }
    }

    return -1;

  }
}
