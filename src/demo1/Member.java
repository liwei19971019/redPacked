package demo1;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        int money=super.getMoney();
        int index=new Random().nextInt(list.size());
        Integer remove = list.remove(index);

        super.setMoney(money+remove);

    }
}
