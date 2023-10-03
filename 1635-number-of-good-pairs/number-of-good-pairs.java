class Solution {
    public int numIdenticalPairs(int[] nums) {
        int answer = 0;
        int[] counts = new int [101];
        for(int num: nums)
            counts[num]++;
        for(int count: counts)
            answer += count*(count-1)/2;
        return answer;
    }
}