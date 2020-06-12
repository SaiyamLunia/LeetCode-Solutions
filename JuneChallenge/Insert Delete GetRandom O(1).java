class RandomizedSet {

    /** Initialize your data structure here. */
    Map<Integer, Integer> map;
    List<Integer> nums;
    
    public RandomizedSet() {
        map = new HashMap<>();
        nums = new ArrayList<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)) {
            map.put(val, nums.size());
            nums.add(val);
            return true;
        } else
            return false;
            
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        
        int index = map.get(val);
        int lastElement = nums.get(nums.size() - 1);
        nums.set(index, lastElement);
        map.put(lastElement, index);
        nums.remove(nums.size() - 1);
        map.remove(val);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int item = new Random().nextInt(map.size());
        return nums.get(item);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */