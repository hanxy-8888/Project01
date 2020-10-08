package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//这是单行注释
public class HellowWorld {

    public HellowWorld() {
    }

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        //region Description
        System.out.println("helloworld!!");
        System.out.println("helloworld!!");
        //endregion

        ArrayList list1 = getList();

        list1.add("");

        method1();

        System.out.println(list1);

    }

    public static ArrayList getList() {
        ArrayList list1 = new ArrayList();

/*        ArrayList list1 = null;

        synchronized ()*/


        Date date = new Date();
        return list1;
    }

    public static void method1() {

        Customer c = new Customer();
        c.eat();

        int num = 10;

        try {
            FileInputStream fis = new FileInputStream(("hello.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
