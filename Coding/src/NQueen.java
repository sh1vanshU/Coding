import java.util.*;
public class NQueen {
    static List<List<Integer>> result=new ArrayList<>();
    public static void main(String[] args) {
        int n=4;
        int[][] board=new int[n][n];
        Solve(board,n,0);
        System.out.println(result);
    }
    private static boolean Solve(int[][] board, int n, int col) {
        if(col==n){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(board[i][j]==1)
                        list.add(j+1);
                }
            }
            result.add(list);
            return true;
        }
        boolean res=false;
        for(int i=0;i<n;i++)
        {
            if(isSafe(board, i, col))
            {
                board[i][col]=1;

                res=Solve(board, n , col+1) || res;

                board[i][col]=0;
            }
        }
        return res;
            
    }
    private static boolean isSafe(int[][] board,int row,int col)
    {
        int n=board.length;
        int i,j;
        for(i=0;i<col;i++)
        {
            // before visited rows.
            if(board[row][i]==1)
                return false;
        }
         // before visited upper diagonal
         for(i=row,j=col;i>=0 && j>=0 ;i--,j--)
         {
             if(board[i][j]==1)
                return false;
         }
         // before visited lower diagonal
         for(i=row,j=col;i<n && j>=0 ; i++,j--)
         {
             if(board[i][j]==1)
                return false;
         }
        return true;
    }
}
