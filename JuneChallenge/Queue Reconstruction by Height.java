class Solution {
    public int[][] reconstructQueue(int[][] people) {
        // sorting the array so that the higher values are ahead of the lower values
		// meaning if a[0] > b[0] then it will be ahead in the list
		// if a[0] == b[0] the we sort based on its next value i.e a[1]<b[1] then a will be ahead in the list
		// the reason we do this is lets take the given example - [[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]
		//after this sort we will have the array somewhat in this manner - [[7,0],[7,1],[6,1]..]
		//here if we observer the largest number i.e 7 all of its occurences are in place, jus that the ones after 7 is not
		// like [6,1] is not in place as it has 2 7's ahead of it.
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
        
        //what the below code does is put the values after 7 in its place, so a = [6,1] in the above example
		// is put at position 1 i.e the a[1]. what happens when doing this is a goes into its correct place
		//but does not affect the positioning of the 7's as it doesnt matter where 6 or any number below 7 is put in the list.
		// it doesnt matter 'cause value of 7 is higer than all of them.
		// this is the main idea of the question, place the highest values in place first and then go to the lower ones
		//why this works is the lower values are not dependent on the higher values.
        List<int[]> res = new ArrayList<>();
        for(int[] p : people)
            res.add(p[1], p);
        return res.toArray(new int[people.length][2]);
    }
}