class Solution {
    public long gridGame(int[][] grid) {
        long row1=0,row2=0;
        long min=Long.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++)
        row1+=grid[0][i];
        for(int i=0;i<grid[0].length;i++){
           row1-=grid[0][i];
           min=Math.min(min,Math.max(row1,row2));
           row2+=grid[1][i]; 
        }
        return min;
        
    }
}