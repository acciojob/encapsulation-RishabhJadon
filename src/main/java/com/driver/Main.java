package com.driver;


public class Main {
     RWOnly obj = new RWOnly();

     String myname = obj.setName("Rishabh");

     //obj.variable = 10;
     //'variable' has private access in 'com.driver.RWOnly'

    String name = obj.getName();

    //System.out.println(obj.getVariable());

    //System.out.println(obj.variable);
    //'variable' has private access in 'com.driver.RWOnly'
}