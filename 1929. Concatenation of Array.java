class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];

        }
        return ans;
    }
}

//time taken - 1ms
//Space taken - 47.5MB
