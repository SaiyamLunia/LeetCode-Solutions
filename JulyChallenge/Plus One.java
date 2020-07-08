class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length - 1 ;
        while(size >= 0) {
            if(digits[size] < 9) {
                digits[size]++;
                return digits;
            }
            else {
                digits[size] = 0;
                size--;
            }
        }
        
        int[] d = new int[digits.length + 1];
        d[0] = 1;
        for(int i = 1; i < d.length; i++)
            d[i] = digits[i - 1];
        return d;
    }
}