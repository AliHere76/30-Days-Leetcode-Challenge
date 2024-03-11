class Solution {
    public int singleNumber(int[] nums) {
        int length = nums.length;
        HashMap<Integer, Integer> counting = new HashMap<>();
        for(int i=0; i<length; i++) {
            if(counting.containsKey(nums[i])){
                counting.put(nums[i],counting.get(nums[i])+1);
            }
            else{
                counting.put(nums[i],1);
            }
        }
        for(int i : counting.keySet()){
            if(counting.get(i) == 1){
                return i;
            }
        }
        return 0;
    }
}