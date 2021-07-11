public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String str="GEEKSFORGEEKS";
        int n=str.length();
        // int len=LPS(str,0,str.length()-1);
        int[][] L=new int[n][n];
        for(int i=0;i<n;i++)
        {
            L[i][i]=1;
        }
        for(int cl=2;cl<=n;cl++)
        {
            for(int i=0;i<n-cl+1;i++)
            {
                int j=i+cl-1;
                if(str.charAt(i)==str.charAt(j) && cl==2)
                {
                    L[i][j]=2;
                }
                else if(str.charAt(i)==str.charAt(j))
                {
                    L[i][j]=L[i+1][j-1]+2;
                }
                else{
                    L[i][j]=Math.max(L[i][j-1],L[i+1][j]);
                }
            }
        }
        System.out.println(L[0][n-1]);
    }

    // private static int LPS(String str, int i, int j) {
    //     if(i>j)
    //         return 0;
    //     if(i==j)
    //         return 1;
    //     if(i+1==j && str.charAt(i)==str.charAt(j))
    //         return 2;
    //     if(str.charAt(i)==str.charAt(j))
    //         return LPS(str,i+1,j-1)+2;
    //     else   
    //         return Math.max(LPS(str,i,j-1),LPS(str,i+1,j));
    // }
    
}
        
