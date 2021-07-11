package DesginPatterns;

class Singleton{
    // private Singleton obj;
    // public Singleton(){

    // }
    // //lazy instantiation.// this approach is not thread safe and need to implement synchronized.
    // // using synchonised . performance will decrease and cost will be expensive.
    // public synchronized Singleton getInstance(){
    //     if(obj==null){
    //         obj=new Singleton();
    //     }
    //     return obj;
    // }
    /*
    Implement thread safe and eager instantiation.

    this time when jvm loads and execute obj created and loaded .
    */
    private static Singleton obj=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstanceSingleton(){
        return obj;
    }
}