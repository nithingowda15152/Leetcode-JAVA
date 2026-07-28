class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sumN=n*(n+1)/2;
        int sum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        res=sumN-sum;
        return res;
    }
}