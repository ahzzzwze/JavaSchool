package chapter2;

public class ImplicitConversion2 {
    public static void main(String[] args) {
        //자동형변환과 강제 형변환을 알수있다
        byte bNum = 10 ;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fnum = iNum2;

        System.out.println(iNum2);
        System.out.println(fnum);

        System.out.println(fnum+iNum2); //iNum2랑 더하면 실수형으로 형 변환

        double dNum;
        dNum = fnum + iNum;
        System.out.println(dNum);
    }
}
