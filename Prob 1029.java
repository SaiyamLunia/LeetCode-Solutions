class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (x,y) -> Math.abs(y[0]-y[1]) - Math.abs(x[0] - x[1]));
        
        int costA = 0, costB = 0, res = 0;
        int len = costs.length/2;
        
        for(int[] cost : costs) {
            if((cost[0] < cost[1] && costA < len) || costB >= len) {
                res += cost[0];
                costA++;
            } else {
                res += cost[1];
                costB++;
            }      
        }
        return res;
    }
}