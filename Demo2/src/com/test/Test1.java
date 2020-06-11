package com.test;

import java.lang.annotation.Repeatable;

public class Test1 {





    @Person(role="artist")
    @Person(role="coder")
    @Person(role="PM")
    public class SuperMan{

    }


}
@interface Persons {
    Person[]  value();
}


@Repeatable(Persons.class)
@interface Person{
    String role() default "abc";
}
