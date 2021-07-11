import java.util.Arrays;

class MedianInARowSortedMatrix{
    public static void main(String[] args) {
        int r = 3, c = 3;
        int matrix[][]= { {1,3,5}, {2,6,9}, {3,6,9} };
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            if(min>matrix[i][0])
                min=matrix[i][0];
            
            if(max<matrix[i][c-1])
                max=matrix[i][c-1];
        }
        
        while(min<max){
            int mid=(min+max)/2;
            int get=0;
            int count=0;
            for(int i=0;i<r;i++){
                get=Arrays.binarySearch(matrix[i],mid);
                
                if(get<0)
                {
                    get=Math.abs(get)-1;
                }
                else
                {
                    while(get<matrix[i].length && matrix[i][get]==mid)
                        get+=1;
                }
                count+=get;
            }
            if(count<(r*c+1)/2)
            {
                min=mid+1;
            }else
            {
                max=mid;
            }
            
            
        }
        System.out.println(min);
    }
}    