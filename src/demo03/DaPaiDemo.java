package demo03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Collections;

public class DaPaiDemo {
    public static void main(String[] args) {
        //1.准备牌
        //1.1创建一个装组装好的牌的HaspMap集合
        HashMap<Integer, String> map = new HashMap<>();
        //1.2创建一个用来装索引的集合
        ArrayList<Integer> list =new ArrayList<>();
        //1.3创建两个数组，定义花色和牌的序号
        String[] color={"♦","♥","♣","♠"};
        String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","k"};
        //1.4装大王和小王
        int index=0;
        map.put(index,"大王");
        list.add(index);
        index++;
        map.put(index,"小王");
        list.add(index);
        index++;
        //1.5遍历两个数组，将组装好的52张牌放到HashMap集合中
        for (String s1 : number) {
            for (String s2 : color) {
                map.put(index,s1+s2);
                list.add(index);
                index++;
            }
        }
       /* //查看组装的牌
        for (Integer key : list) {
            String value = map.get(key);
            System.out.print(value);
        }*/

        //2.洗牌：利用集合工具类Collections中的方法shuffle对集合的索引进行打乱
        Collections.shuffle(list);

        //3.发牌
        //3.1创建玩家和底牌装牌的集合
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //3.2遍历装索引的list集合，给玩家发牌的索引
        for (int i = 0; i <list.size() ; i++) {
            Integer in = list.get(i);
            if (in>=51){
                diPai.add(in);
            }else if (in%3==0){
               player01.add(in);
            }else if (in%3==1){
                player02.add(in);
            }else if (in%3==2){
                player03.add(in);
            }
        }

        //4.对牌进行排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

       //调用看牌方法
       kanPai("张一",player01,map);
       kanPai("张二",player02,map);
       kanPai("张三",player03,map);
       kanPai("底牌",diPai,map);


    }

    //看牌的方法
    public static  void kanPai(String name, ArrayList <Integer> list , HashMap<Integer,String> map ){
        System.out.print(name+":");
        for (Integer list1 : list) {
            String pai=map.get(list1);
            System.out.print(pai+"");
        }
        System.out.println();
    }
}
