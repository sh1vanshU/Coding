import java.util.*;
class MergeWithoutExtraSpace{
    public static void main(String[] args) {
        int n = 4, m = 5;
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {0, 2, 6, 8, 9};
        // for(int i=m-1;i>=0;i--){
        //     int last=arr1[n-1];
        //     int j;
        //     for(j=n-2;j>=0 && arr1[j]>arr2[i];j--){
        //         arr1[j+1]=arr1[j];
                
        //     }
        //     if(j!=n-2 || last>arr2[i]){
        //      arr1[j+1]=arr2[i];
        //      arr2[i]=last;
        //     }
        // }
        int i=0,j=0,k=n-1;

        while(i<=k && j<m){
            if(arr1[i]<arr2[j])
            {
                i++;
            }
            else
            {
                int temp=arr2[j];
                arr2[j]=arr1[k];
                arr1[k]=temp;
                j++;
                k--;
            }
            
        }

        Arrays.stream(arr1).sorted().forEach(e->System.out.print(e+" "));
        System.out.println();
        Arrays.stream(arr2).sorted().forEach(e->System.out.print(e+" "));

    }
}