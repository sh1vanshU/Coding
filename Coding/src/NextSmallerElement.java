import java.util.*;

class NextSmallerElement{
    public static void main(String[] args) {
        int[] arr={ 13, 7, 6, 12};
        
        int n=arr.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        // Stack<Integer> stack=new Stack<Integer>();
        int i=0;
        while(i<n){
            // while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
            //     ans[stack.peek()]=arr[i];
            //     stack.pop();
            // }
            // stack.push(i++);
        }
        for(int k=0;k<n;k++)
            System.out.println(ans[k]);
    }
}