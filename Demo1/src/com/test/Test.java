package com.test;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    //java测试方法，基于junit4
    public static void main(String[] args) {
        ExecutorService exec= Executors.newCachedThreadPool();
        //Future接口后面有源码
        ArrayList<Future<String>> results=new ArrayList<Future<String>>();
        long start=System.currentTimeMillis();
        for(int i=0;i<10;i++){
            results.add(exec.submit(new TaskWithResult(i)));
        }
        //System.out.println("====================cost:"+(System.currentTimeMillis()-start));
        int count=0;
        //遍历数据
        for(Future<String> fs:results){
            //System.out.println("========cost:"+(System.currentTimeMillis()-start));
            long start2=System.currentTimeMillis();
            try{
                //取数据
                System.out.println(fs.get());

            }catch (InterruptedException e){
                System.out.print(e);

            }catch (ExecutionException e){
                System.out.print(e);
            }finally {
                exec.shutdown();

            }
            //System.out.println((count++)+"====================cost:"+(System.currentTimeMillis()-start2));

        }

    }
}
