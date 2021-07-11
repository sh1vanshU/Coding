
public class RowWithMax1s {
    public static void main(String[] args) {
        
    // int N = 10 , M = 8;
    int N = 4 , M = 4;
    int arr[][] = {{0, 1, 1, 1},
               {0, 0, 1, 1},
               {1, 1, 1, 1},
               {0, 0, 0, 0}};


    // int  arr[][] =     {{0 ,0, 1, 1, 1, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 1, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 0, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 1, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 1, 1, 1, 1}, 
    //                     {0 ,0, 1, 1, 1, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 0, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 1, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 0, 1, 1, 1}, 
    //                     {0 ,0, 0, 0, 0, 1, 1, 1}};
        System.out.println(new RowWithMax1s().rowWithMax1s(arr,N,M));
    }
    int first(int arr[], int low, int high) {
        if (high >= low) {
            // Get the middle index
            int mid = low + (high - low) / 2;

            // Check if the element at middle index is first 1
            if ((mid == 0 || (arr[mid - 1] == 0)) && arr[mid] == 1)
                return mid;

            // If the element is 0, recur for right side
            else if (arr[mid] == 0)
                return first(arr, (mid + 1), high);

            // If element is not first 1, recur for left side
            else
                return first(arr, low, (mid - 1));
        }
        return -1;
    }
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int index = 0;
        int maxIndex = first(arr[0], 0, m - 1);
        if (maxIndex == -1){
            maxIndex = m - 1;
            index=-1;
        }
        else
            maxIndex--;
        for (int j = 1; j < n; j++) {
            while (maxIndex >= 0 && arr[j][maxIndex] == 1) {
                maxIndex = maxIndex - 1;
                index = j;
            }
        }
        return index;
    }
}
