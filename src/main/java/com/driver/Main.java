package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj =new RWOnly();

//        obj.name="Charan";
//        java: name has private access in com.driver.RWOnly

        obj.setName("Charan");

        System.out.println("Name: "+obj.getName());
    }
  
}