package com.divyansh;

public class typecasting {
    public static void main(String[] args) {



        System.out.println("tycasting");
        
        int num = 25;
        System.out.println((float)(num));

        float fl = 34.45f;
        int num1 = (int)(fl);
        System.out.println(num1);

        System.out.println("automatic type promotion in expression");

        byte b = 23;
        int  a = 21;
        float c = 76.89f;
        short d = 5373;
        double e = 65.37838938;
        double  result = (b+a) + (a/c) - (d*e) ;
        System.out.println(result);


    }
}
