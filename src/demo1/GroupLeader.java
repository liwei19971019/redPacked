package demo1;

import java.util.ArrayList;

public class GroupLeader extends User{

    public GroupLeader() {
    }

    public GroupLeader(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int sendMoney, int count){
        //GroupLeader leader = new GroupLeader();
        ArrayList<Integer>  redList = new ArrayList<>();
        //查看群主余额
        int sumMoney=super.getMoney();
        if (sumMoney<sendMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣除余额
        super.setMoney(sumMoney-sendMoney);
        //把红包分成count份
        int avg=sendMoney/count;
        int num=sendMoney%count;
        for (int i = 1; i < count-1; i++) {
            redList.add(avg);
        }
        int last=(avg+num);
        redList.add(last);
       return redList;

    }
}
