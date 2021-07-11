import java.util.Arrays;

class LongestIncreasingSubsequence{
    public static void main(String[] args) {
        int size = 6;
        int arr[] = {5,8,3,7,9,1};
        int[] dp=new int[size+1];
        Arrays.fill(dp,1);
        dp[0]=1;
        int max=1;
        for(int i=1;i<size;i++)
        {
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && dp[i]<dp[j]+1)
                {
                    dp[i]=dp[j]+1;
                    if(max<dp[i])
                        max=dp[i];

                }
            }
        }
        System.out.println(max);
    }
}