package com.driver;


public class Main {
     RWOnly obj = new RWOnly();

     int val = obj.setVariable(10);

     //obj.variable = 10;
     //'variable' has private access in 'com.driver.RWOnly'

    int res = obj.getVariable();

    //System.out.println(obj.getVariable());

    //System.out.println(obj.variable);
    //'variable' has private access in 'com.driver.RWOnly'
}