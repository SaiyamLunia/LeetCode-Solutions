class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[nums.length];
        int[] index = new int[nums.length];
        Arrays.fill(arr, 1);
        Arrays.fill(index, -1);
        
        if(nums == null || nums.length == 0) return list;
        Arrays.sort(nums);
        
        int max=0;
        int maxIndex=-1;
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i - 1; j >= 0 ; j--) {
                if(nums[i] % nums[j] == 0 && arr[j] + 1 > arr[i]) {
                    arr[i] = arr[j] + 1;
                    index[i] = j;
                }
            }
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        
        while(maxIndex >= 0) {
            list.add(nums[maxIndex]);
            maxIndex = index[maxIndex];
        }
        return list;
    }
}