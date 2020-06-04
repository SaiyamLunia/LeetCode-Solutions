class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0, num = x;
        if(num < 0)
            return false;
        while(x != 0){
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && x%10 > 7)) return false;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && x%10 < -8)) return false;
            
            reverse = reverse * 10;
            reverse = reverse + x % 10;
            x = x / 10;
        }
        return (reverse == num) ? true : false;
    }
}