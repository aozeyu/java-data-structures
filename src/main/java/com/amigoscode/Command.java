//package com.amigoscode;
//
//
///**
// * 命令模式（Command）
// * <p></p>
// * 意图：
// * 将一个请求封装为一个对象，从而使得可以用不同的请求对客户进行参数化。对请求排队或记录请求日志，以及支持可撤销的操作
// * <p></p>
// * 适用性：
// * 1.抽象出待执行的动作以参数化某对象
// * 2.在不同的时刻指定、排列和执行请求
// * 3.支持撤销操作
// * 4.支持修改日志
// * 5.用构建在原语操作上的高层操作构建一个系统
// * <p></p>
// * 关键字：参数化
// */
//public class Command {
//  public static void main(String[] args) {
//
//  }
//}
//
//
//class Invoker {
//  private Command command;
//  public void setCommand(Command command) {
//    this.command = command;
//  }
//  public void execute() {
//    command.Execute();
//  }
//}
//
//
//interface Command{
//  void  Execute();
//}
//
//
//
//class OnCommand implements Command{
//  private Tv tv;
//  public OnCommand(Tv tv) {
//     this.tv = tv;
//  }
//
//  @Override
//  public void Execute() {
//    tv.On();
//  }
//}
//
//
//class OffCommand implements Command {
//  private final Tv tv;
//  public OffCommand(Tv tv) {
//    this.tv = tv;
//  }
//
//  @Override
//  public void Execute() {
//    tv.Off();
//  }
//}
//
//
//class Tv {
//  public void On() {
//    System.out.println("打开电视");
//  }
//
//  public void Off(){
//    System.out.println("关闭电视");
//  }
//}