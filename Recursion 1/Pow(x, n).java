class Solution {
    public double myPow(double x, int n) {
        long M = 1000_000_000 + 7; // Use modulo wherever there is a chance to overflow
        if (n == 0) return 1;
        if (n == 1) return x;
        n = (int) (n % M);
        if(n < 0) {
            x = 1 / x;
            n = -n;
        }
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) 
            return temp * temp; 
        else 
            return x * temp * temp;
    }
}