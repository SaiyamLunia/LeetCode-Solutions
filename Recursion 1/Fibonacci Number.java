class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int fib(int N) {
        if(map.containsKey(N))
        	return map.get(N);
        int result;
        if(N < 2)
        	result = N;
        else
        	result = fib(N - 1) + fib(N - 2);
        map.put(N, result);
        return fib(N);
    }
}