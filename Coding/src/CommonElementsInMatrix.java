
public class CommonElementsInMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 1, 4, 8 }, { 3, 7, 8, 5, 1 }, { 8, 7, 7, 3, 1 }, { 8, 1, 2, 7, 9 } };
        int m = 4;
        int n = 5;
        int[] map = new int[10 ^ 5];
        for (int j = 0; j < n; j++) {
            map[mat[0][j]] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (map[mat[i][j]] == i) {
                    map[mat[i][j]]++;
                    if (i == m - 1) {
                        System.out.print(mat[i][j]+" ");
                    }
                }
                
            }

        }

    }
}