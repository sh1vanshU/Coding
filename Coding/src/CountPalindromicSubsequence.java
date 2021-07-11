class CountPalindromicSubsequence{
    public static void main(String[] args) {
        String str="aaaaaaaaackanscknskcsjc jsncsncksnlckmsmxkzmkcnjd hjv djncksncksnjcbsjcbsjbcjsbcjbsjcbsjbcjsbcjbsjcbjsbcjsbcjskcjoodjofjjfodjofjdojfodjfojdvnd vdnvjndjvnjbvjsnckmscsojosjfojsofjkcnjdjdbvhfbvhbfnkdcmdcndkvndjvndjaaaavdknsndcmskdvksvisdlvnsidnvksdnvnknvksdkvnsdknvkdnvndvkjsdnvosdkvnsdjvksdnvknsdvnskdvsdmc;l,px,psmncndknksnvknsdjvcmodmcsnjvnjsnvsvnksdnvkdkvmsd,codnsmovdspmvksdvjdnvkdvkdnvjkdmvodmlmdknvdkpmskdnvksdnvksmdkvskdnvksdvksdvknsdvndlsnvkdnvjndkvndkvnjdkksmkcmsdlmcpsnovnsjndx.zzspsnvkds vkndvndnvldmodmvodnvknaaaaaaaaaaaaaa";
        int n=str.length();
    //     // Your code here
    //     return countPS(str,0,n-1);
        
    // }
    // long countPS(String str,int i, int j){
    //     if(i>j)
    //         return 0;
    //     if(i==j)
    //         return 1;
    //     else if(str.charAt(i)==str.charAt(j))
    //         return countPS(str,i+1,j)+countPS(str,i,j-1)+1;
    //     else
    //         return countPS(str,i+1,j)+countPS(str,i,j-1)-countPS(str,i+1,j-1);
    // }
        long mod=1000000007;
        long[][] cps=new long[n][n];
        for(int i=0;i<n;i++)
        {
            cps[i][i]=1;
        }
        for(int l=2;l<=n;l++){
            for(int i=0;i<=n-l;i++)
            {
                int k=l+i-1;
                if(str.charAt(i)==str.charAt(k))
                {
                    cps[i][k]=((cps[i][k-1]%mod+cps[i+1][k]%mod)%mod+1)%mod;
                }
                else
                {
                    cps[i][k]=(cps[i][k-1]+cps[i+1][k]-cps[i+1][k-1])%mod;
                }
            }
        }
        long ans= cps[0][n-1];
        System.out.println(ans);
    }
}//191551497