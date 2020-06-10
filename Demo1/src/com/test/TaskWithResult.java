package com.test;

import java.util.concurrent.Callable;

//实现接口Callable 参数类型是String
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id){
        this.id=id;
    }
    @Override
    public String call() throws Exception {
        return "result of TaskWithResult "+id;
    }
}
