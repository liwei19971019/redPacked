package demo2;

import org.junit.Test;

import java.util.Scanner;

public class pratice01 {


    public static void main(String[] args) {
        System.out.print("请输入季节：");
            Scanner sc = new Scanner(System.in);
            String str=sc.next();
            switch(str){
                case "summer":
                    System.out.println("这是夏天");;
                    break;
                case "spring":
                    System.out.println("春天到了，秋天还会远吗");
                    break;
                default:
                    System.out.println("不知道是啥季节");
                    break;

            }
    show("张1","张二","张三","张4","张5","张6","张7");
    sum(2.34,4.56,5.67,2.22,9.45);
    }

    public static void show(String...str){
        for (int i = 0; i < str.length; i++) {
            System.out.println(str);

          }
        }

        public static void sum(double...i){
           double sum=0.00;
             for (double d:i){
              sum+=d;
             }
            System.out.println(sum);
        }


        }




