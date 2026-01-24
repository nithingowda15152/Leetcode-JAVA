class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int d=0;
        int prod=1;
        while(n>0){
            d=n%10;
            sum=sum+d;
            prod=(prod*d);
            n=n/10;
        }
        return prod-sum;
    }
}