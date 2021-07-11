package Oops.Overriding;

public class MainClass {
    public static void main(String[] args) {
        A aa=new A();
        aa.m1();
        System.out.println(aa.anInt);

        A ab=new B();
        ab.m1();
        System.out.println(ab.anInt);

        B bb=new B();
        bb.m1();
        System.out.println(bb.anInt);

    }
}
