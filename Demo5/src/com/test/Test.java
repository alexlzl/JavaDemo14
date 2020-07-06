package com.test;

public class Test {
    public static void main(String[] args){
        new TestRun().run();
        new  Thread(new TestRun(),"test").start();
        new TestThread(new TestRun(),"test1").start();
        new TestThreadOne().run();
        new TestThreadOne().start();
    }
}

 class TestThread extends Thread{
    public TestThread(Runnable runnable,String name){
        super(runnable,name);
    }
     @Override
     public void run() {
         super.run();
         System.out.println("test2");
     }
 }


 class TestThreadOne extends Thread{
     @Override
     public void run() {
         super.run();
         System.out.println(Thread.currentThread().getName());
     }
 }


