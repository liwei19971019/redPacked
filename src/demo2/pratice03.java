package demo2;

public class pratice03 {

    public static void main(String[] args) {
        String str = "hoahao,学习";
        String str1 = str.substring(3);
        System.out.println(str1);

        String[] split = str.split(",");
        System.out.println(split[0]);

      /*  char[] chars = str1.toCharArray();
        for (char ch : chars) {
            System.out.print(ch);
        }*/

        byte[] bytes = str.getBytes();
        for (byte by : bytes) {
            System.out.print(by);
        }
    }
}
