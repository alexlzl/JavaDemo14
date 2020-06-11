package com.test;

import javax.lang.model.SourceVersion;

public class Test2 {

    public static void main(String[] args){
     SourceVersion sv=   SourceVersion.latestSupported();
        System.out.println(sv.toString());
     System.out.println(SourceVersion.RELEASE_8);
    }
}
