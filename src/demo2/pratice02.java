package demo2;

import java.util.ArrayList;
import java.util.Random;

public class pratice02 {
    public static void main(String[] args) {
        //创建一个大集合用来装产生的20个随机数
        ArrayList<Integer> bigList=new ArrayList<>();
        //创建随机类对象
        Random r = new Random();
        for (int i = 0; i <20 ; i++) {
            int j=r.nextInt(100)+1;
            bigList.add(j);
        }
        //调用下面的方法
        ArrayList<Integer>  list = select(bigList);
        System.out.println(list);


    }
    //用来对大集合的数据进行偶数的筛选
    public static ArrayList<Integer>  select(ArrayList<Integer> bigList){
        //创建一个用来装筛选出来的偶数的集合
        ArrayList<Integer> smallList = new ArrayList<>();
        for (Integer  figure : bigList) {
            if (figure%2==0){
                smallList.add(figure);
            }
        }
        return smallList;
    }
}
