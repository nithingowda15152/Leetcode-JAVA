class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int temp=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }else{
            return false;
        }
    }
}