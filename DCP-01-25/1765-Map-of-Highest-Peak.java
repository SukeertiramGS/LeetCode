class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m=isWater.length;
        int n=isWater[0].length;
        int[][] dp=new int[m][n];
        for(int[] x:dp)Arrays.fill(x,10000);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1)
                {
                    dp[i][j]=0;
                    continue;
                }
                if(i>0)
                dp[i][j]=Math.min(dp[i][j],dp[i-1][j]+1);
                if(j>0)
                dp[i][j]=Math.min(dp[i][j],dp[i][j-1]+1);

            }
        }
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i<m-1)
                dp[i][j]=Math.min(dp[i][j],dp[i+1][j]+1);
                if(j<n-1)
                dp[i][j]=Math.min(dp[i][j],dp[i][j+1]+1);
            }
        }
        return dp;
    }
}