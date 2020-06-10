package com.test;

public class MyTask implements Runnable {

    private int taskId;
    private String taskName;

    public MyTask(int taskId, String taskName){
        this.taskId = taskId;
        this.taskName = taskName;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
//        try {
//
//
//            System.out.println("线程执行中==========run taskId =" + this.taskId+"   Thread"+Thread.currentThread().getId());
//            Thread.sleep(1000);
//            System.out.println("线程休眠结束==============");
//            //System.out.println("end taskId =" + this.taskId);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        while (true){
//            System.out.println("thread run=============");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        System.out.println("thread run=============");
    }

    public String toString(){
        return Integer.toString(this.taskId);
    }

}
