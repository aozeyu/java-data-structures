package com.amigoscode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
  public static void main(String[] args) {
    List<String> colors = new ArrayList<>();
    colors.add("blue");
    colors.add("purple");
    System.out.println(colors.size());
    System.out.println(colors.contains("blue"));
    System.out.println(colors);
    colors.forEach(System.out::println);
  }
}
