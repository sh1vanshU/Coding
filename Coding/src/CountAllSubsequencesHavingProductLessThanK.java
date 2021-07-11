
public class CountAllSubsequencesHavingProductLessThanK {
    public static void main(String[] args) {
        int[] Input = {1, 2, 3, 4} ;
        int k = 10;
        int n=Input.length;
        int[][] dp=new int[k+1][n+1];
        for(int i=1;i<=k;i++)
        {
            for(int j=1;j<=n;j++)
            {
                dp[i][j]=dp[i][j-1];
                if(Input[j-1]<=i && Input[j-1]>0){
                    dp[i][j]+=dp[i/Input[j-1]][j-1]+1;
                }
            }
        }
        System.out.println(dp[k][n]);
    }
}
