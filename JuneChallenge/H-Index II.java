class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int low = 0, high = n - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(n - mid > citations[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return n - low;
    }
}