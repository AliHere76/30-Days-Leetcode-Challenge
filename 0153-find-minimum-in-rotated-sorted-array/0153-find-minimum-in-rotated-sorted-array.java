class Solution {
    public int findMin(int[] arr) {
        int n = arr.length;
        int beg = 0, end = n-  1;
        int ans=-1;
        while(beg < end) {
            int mid = (beg + end)/2;
            if(arr[mid] > arr[n-1])
                beg = mid+1;
               
            else if(arr[mid] <= arr[n-1]){ 
                end = mid;
            }
        }
        return arr[beg];
    }
}