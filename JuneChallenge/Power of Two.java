class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && ((n&(n-1)) == 0);
    }
}

//  if we do Bitwise AND of (number) & (number -1) and if the result is 0 than the number is power of 2 else not.