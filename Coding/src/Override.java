public class Override {
    public static void main(String[] args) {
        A ab=new B();
        ab.x();
        // ab.y();
        A aa=new A();
        aa.x();
        B bb=new B();
        bb.x();
        // B ba=new A(); // compilation error.
        // ba.x();
        

    }
}
