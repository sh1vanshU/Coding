class MiddleOfThree{
    public static void main(String[] args) {
        int a=978;
        int b=518;
        int c=300;
        int ans=0;
        int avg=(a+b+c)/3;
        
        int aa=Math.abs(a-avg);
        int bb=Math.abs(b-avg);
        int cc=Math.abs(c-avg);
        if(aa<bb)
        {
            if(aa<cc)
            {
                ans=a;
            }else{
                ans=c;
            }   
        }else{
            if(bb<cc)
            {
                ans=b;
            }else{
                ans=c;
            }   
        }
        System.out.println(ans);
    }
}
