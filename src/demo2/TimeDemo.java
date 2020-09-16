package demo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeDemo {
    public static void main(String[] args) throws ParseException {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(4);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }

      /*  int[] i={3,5,7,32,98};
        String str = Arrays.toString(i);
        System.out.println(Arrays.toString(i));

        char[] chars = str.toCharArray();
        for (int j = 0; j <chars.length ; j++) {
            System.out.println(chars[j]);
        }*/
       /* String[] split = str.split(",");
        for (String s : split) {
            System.out.println(s);
        }*/



        /*Scanner sc = new Scanner(System.in);
        System.out.print("请输入出生日期：yyyy-mm-dd:");
        String birthday = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = dateFormat.parse(birthday);
        long time = date.getTime();
        long date1 = new Date().getTime();
        long l = date1 - time;
        System.out.println(l/24/60/60/1000);*/

       
    }
}
