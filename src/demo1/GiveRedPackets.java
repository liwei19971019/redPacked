package demo1;

import java.util.ArrayList;

public class GiveRedPackets {
    public static void main(String[] args) {
        GroupLeader leader= new GroupLeader("群主",100);

        Member member1= new Member("A",2);
        Member member2= new Member("B",8);
        Member member3= new Member("C",5);
        ArrayList<Integer> list=leader.send(80,4);
        member1.receive(list);
        member2.receive(list);
        member3.receive(list);
        member1.out();
        member2.out();
        member3.out();


    }





}
