import java.util.*;
class TestClass {
    /* 
        https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/kth-smallest-number-again-2/
    */
    public static void main(String args[] ) throws Exception {
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       while(t-->0){
        //    int N=sc.nextInt();
           int Q=sc.nextInt();
           long A=sc.nextLong();
           long B=sc.nextLong();
           for(int i=0;i<Q;i++){
               long Qi=sc.nextLong();
                if(Qi==1){
                    System.out.println(A);
                    
                }
                else if(B-A+1<Qi)
                {
                    System.out.println("-1");
                }
                else 
                {
                    System.out.println(A+(Qi-1)*1);
                }
                
           }
       }
       sc.close();
    }
}
