class Solution {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int rightProduct = 1;
        int leftProduct = 1;
        int maxProduct = nums[0];
        for(int i = 0; i<nums.length; i++){
            leftProduct*=nums[i];
            rightProduct*=nums[length-1-i];
            if(leftProduct>maxProduct){
                maxProduct=leftProduct;
            }
            if(rightProduct>maxProduct){
                maxProduct=rightProduct;
            }
            if(leftProduct==0){
                leftProduct=1;
            }
            if(rightProduct==0){
                rightProduct=1;
            }
        }
        return maxProduct;
    }
}