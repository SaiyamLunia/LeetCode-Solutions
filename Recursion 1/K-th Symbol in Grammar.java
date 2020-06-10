class Solution {
    public int kthGrammar(int N, int K) {
        if(N == 0) return 0;
        // Recursively get the value of parent symbol. Can be memorized but it's too much of chore in Java.
        int result = kthGrammar(N - 1, (K - 1) / 2 + 1);
        
        // If K is odd element is same as parent symbol else it's invert of parent symbol.
        return K % 2 != 0 ? result : invert(result);
    }
    private int invert(int N) {
        return N * -1 + 1;
    }
}