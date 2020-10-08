package com;

import java.util.ArrayList;

/**
 * @author shkstart
 * @date 2020/10/7 - 18:32
 * <p>
 * IDEA中代码模板所处的位置：setting - Editor - Live Templates / Postfix Completion
 */
public class TemplatesTest {

    //模板六：prsf:可生成 private static final
    private static final Customer cust = new Customer();

    public static final int NUM = 1;

    public static final String S = "";

    //模板一：psvm
    public static void main(String[] args) {
        //模板二:sout
        System.out.println("hello!");
        //变形： soutp / soutm /soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num = 10;
        System.out.println("num = " + num);
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println(num2);

        //模板三：fori
        String[] arr = new String[]{"Tom", "Jerry", "HanMeimei", "Lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        //变形： iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形： itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }


        //模板四： list.for
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(5677);

        for (Object o : list) {

        }

        //变形:list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void method() {
        System.out.println("TemplatesTest.method");


        //模板5：ifn
        ArrayList<Object> list = new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(5677);

        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

        //变形：xxx.nn / xxx.null
        if (list == null) {

        }
        if (list != null) {

        }


    }


}
