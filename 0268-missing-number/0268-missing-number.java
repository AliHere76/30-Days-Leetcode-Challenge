class Solution {
    public int missingNumber(int[] nums) {
        boolean[] checkArr=new boolean[nums.length+1];        
        for(int i=0;i<nums.length;i++){
            checkArr[nums[i]]=true;
        }
        for(int i=0;i<checkArr.length;i++){
            if(checkArr[i] == false){
                return i;
            }
        }
        return 0;
    }
}