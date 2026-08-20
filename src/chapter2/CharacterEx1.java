package chapter2;

public class CharacterEx1 {
    public static void main(String[] args) {
        // 아스키코드
        char ch1 = 'A'; //자바도 char 를 쓴다
        System.out.println(ch1);
        System.out.println((int)ch1);

        char ch2 = 66;
        System.out.println(ch2);

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3); // (char)하고 변수

        char ch4 = '한';
        char ch5 = '\uD55C';
        System.out.println(ch4);
        System.out.println(ch5);
    }
}
