package com.atguigu.java;

import com.atguigu.bean.Customer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author shkstart
 * @date 2021/5/8 - 17:26
 *
 * 1.IDEA中代码模板设置所在的位置：settings - Editor - Live Templates / Postfix Completions
 *
 * 2.常用的模板
 *
 */
public class TemplatesTest {

    //模板六：prsf：可生成 private static final
    private static final Customer CUST = new Customer();

    //变形：psf
    public static final int NUM = 1;
    //变形：psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";


    //模板一：psvm
    public static void main(String[] args) {


        //模板二：sout
        System.out.println("hello!");
        //变形：soutp / soutm / soutv / xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));//输出形参
        System.out.println("TemplatesTest.main");//输出方法名

        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);//就近参数
        System.out.println(num1);//num1.sout

        //模板三：fori
        String[] arr = new String[]{"Tom","Jerry","LinQingxia","LiMing"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter 增强for循环
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar 普通for循环
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(356);
        list.add(546);

        for (Object o : list) {
            System.out.println(o);
        }

        //变形：list.fori 普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //变形：list.forr 逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

    }
    public void method(){
        System.out.println("TemplatesTest.method");

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(356);
        list.add(546);

        //模板五：ifn
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
