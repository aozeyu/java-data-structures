package com.amigoscode;

/**
 * 责任链模式（Chain of responsibility）了解即可
 * <p></p>
 * 意图：
 * 多个对象都有机会处理请求，避免发送者和接收者的耦合关系，将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理为止
 * <p></p>
 * 适用性：
 * 1.有多个对象处理一个请求，哪个对象处理请求运行时刻自动确定
 * 2.想在不明确指定接收者的情况下，向多个对象依次提交请求
 * 3.可处理一个请求对象集合应被动态指定
 */

public class ChainOfResponsibility {
  public static void main(String[] args) {
    BanzhuRen banzhuRen = new BanzhuRen();
    zhuRen zhuRen = new zhuRen();
    xiaoZhang xiaoZhang = new xiaoZhang();
    banzhuRen.setHandle(zhuRen);
    zhuRen.setHandle(xiaoZhang);
    banzhuRen.HandleRequest(22);

  }

}

abstract class Handle{
  protected Handle next;
  public void setHandle(Handle handle) {
    this.next = handle;
  }
  public abstract void HandleRequest(int day);
}

class BanzhuRen extends Handle {
  @Override
  public void HandleRequest(int day) {
    if (day <= 7){
      System.out.println("班主任审批通过");
    }else {
      System.out.println("班主任无法审批,转接下一级");
      next.HandleRequest(day);
    }
  }
}

class zhuRen extends Handle {
  @Override
  public void HandleRequest(int day) {
    if (day <= 15) {
      System.out.println("年级主任审批通过");
    }else {
      System.out.println("年级主任无法审批,转接下一级");
      next.HandleRequest(day);
    }
  }
}

class xiaoZhang extends Handle{
  @Override
  public void HandleRequest(int day) {
    if (day<=30) {
      System.out.println("校长审批通过");
    }else {
      System.out.println("无法处理审批");
    }
  }
}
