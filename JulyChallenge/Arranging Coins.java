Approach 1: (16ms runtime)
class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(n - i >= 0) {
                count++;
                n -= i;
            }
        }
        return count;
    }
}

Approach 2: (1ms runtime)

class Solution {
    public int arrangeCoins(int n) {
        // 1 + 2 + 3 + .. + k <= n
        // k(k + 1) / 2 <= n
        // k(k + 1) <= 2n
        // k*k + k - 2n <= 0
        // k <= (-1 + sqrt(1 + 8n))/2
        return (int)(Math.sqrt(1 + (n * 8.0)) - 1) / 2;
    }
}