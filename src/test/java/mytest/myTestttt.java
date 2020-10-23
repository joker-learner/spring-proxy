package mytest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class myTestttt {
    public static void main(String[] args) {
        int[] a = {1, 34, 56, 432, 311, 2, 344, 678, 87};
        int[] ints = sortDown(a);
        System.out.println(Arrays.toString(a));
        double sum = 100;
        double fstheu = 100;
        double height = 0;
        double lastHeight;

        for (int i = 0; i < 8; i++) {  //第2 到 8 次
            height = fstheu / 2;
            sum = sum + height * 2;
            fstheu = fstheu / 2;
        }

        lastHeight = height / 2;
        System.out.println("总路程" + sum);
        System.out.println("最后一次路程" + lastHeight);
    }

    public static int[] sortDown(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] > a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }


        return a;
    }

    @Test
    public void print(){
        double h=100;
        double s=100;
        for(int i=1;i<=10;i++) {
            h=h/2;
            s=s+2*h;
        }

        System.out.println("经过10次一一共经过"+s+"米");
        System.out.println("第10次弹起"+h+"高");
    }



}
