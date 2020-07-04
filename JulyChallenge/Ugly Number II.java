class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int indexOf2 = 0, indexOf3 = 0, indexOf5 = 0;
        for(int i = 1; i < n; i++) {
            int currTwo = ugly[indexOf2] * 2;
			int currThree = ugly[indexOf3] * 3;
			int currFive = ugly[indexOf5] * 5;
			
			ugly[i] = Math.min (currTwo, Math.min (currThree, currFive));	
		
			if (ugly[i] == currTwo) {
				++indexOf2;
			}
			if (ugly[i] == currThree) {
				++indexOf3;
			}
			if (ugly[i] == currFive) {
	            ++indexOf5;
			}
        }
        return ugly[n - 1];
    }
    
}