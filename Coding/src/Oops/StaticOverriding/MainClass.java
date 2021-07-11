package Oops.StaticOverriding;

public class MainClass {
    public static void main(String[] args) {

        A aa=new A();
        System.out.println("Object data "+ aa);
        aa.m1();


        A ab=new B();
        System.out.println("Object a data "+ab);
        ab.m1();

        B bb=new B();
        System.out.println("Object a data "+bb);
        bb.m1();
    }
}

