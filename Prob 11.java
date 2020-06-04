class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1,size=height.length-1;
        int area = 0;
        while(start < end){
            if(height[start] < height[end])
                area = Math.max(area, height[start++]*size--);
            else
                area = Math.max(area, height[end--]*size--);
        }
        return area;
    }
}