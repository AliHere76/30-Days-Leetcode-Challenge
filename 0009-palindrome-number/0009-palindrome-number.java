class Solution {
    public boolean isPalindrome(int x) {
        int check = x;
        if(x < 0 || (x > 0 && x % 10 == 0)){
            return false;
        }
        int num = 0;
        while(x>0){
            num*=10;
            num += x % 10;
            x/=10;
        }
        if(check == num){
            return true;
        }
        return false;
    }
}
