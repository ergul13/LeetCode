class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> pairIndx = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];

            if(pairIndx.containsKey(target - num)){
                return new int[] {i, pairIndx.get(target - num)};
            }
            pairIndx.put(num, i);
        
        }
        return new int[] {};
    }
}