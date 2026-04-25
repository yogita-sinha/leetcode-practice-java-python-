public class leetcode1351 {
    
    public int countNegatives(int[][] grid) {
    
        int n = grid.length;
        int m = grid[0].length;

        int count=0;

        for(int i=0; i <n; i++){
            for(int j=0; j<m; j++ ){
              if(grid[i][j]<0){
                count++;
              }
            }
           
        }

        return count;
        
    }

    
public static void main(String[] args) {
    leetcode1351 solver = new leetcode1351();
    int[][] testGrid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
    System.out.println("Negative count: " + solver.countNegatives(testGrid));
}
}

