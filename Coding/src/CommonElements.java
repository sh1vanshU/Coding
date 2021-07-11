import java.util.ArrayList;

public class CommonElements {
    /*
     * https://practice.geeksforgeeks.org/problems/common-elements1132/1#
     */
    public static void main(String[] args) {
        int n1 = 6; int[] A = {1, 5, 10, 20, 40, 80};
        int n2 = 5; int[] B = {6, 7, 20, 80, 100};
        int n3 = 8; int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
        int i=0;
        int j=0;
        int k=0;
        ArrayList<Integer> list=new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            while(i>0 && i<n1 && A[i-1]==A[i])
            {
                i++;
            }
            while(j>0 && j<n2 && B[j-1]==B[j])
            {
                j++;
            }
            while(k>0 && k<n3 && C[k-1]==C[k])
            {
                k++;
            }
            if(i<n1 && j<n2 && k<n3)
            {
                if(A[i]==B[j] && B[j]==C[k])
                {
                    list.add(A[i]);
                    i++;
                    j++;
                    k++;
                }
                else if(A[i]<B[j])
                {
                    i++;
                }else if(B[j]<C[k])
                {
                    j++;
                }
                else
                {
                    k++;
                }
            }
            
        }
       
        
    }
}
