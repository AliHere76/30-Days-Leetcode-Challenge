class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int check = 1;
        for(int i=0;i<nums.length;i++){
            result[i]=check;
            check*=nums[i];
        }
        check = 1;
        for(int j=nums.length-1; j >=0 ; j--){
            result[j]*=check;
            check*=nums[j];
        }
        return result;
    }
}