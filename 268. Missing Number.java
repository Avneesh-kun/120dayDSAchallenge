//Brute Force
//Time - 8MS
//space - 47.9MB

class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int start = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != start) {
                return start;
            }

            start++;
        }

        return start;
    }
}


//Optimal solution
//time - 0MS
//space - 47.6MB

class Solution {
    public int missingNumber(int[] nums) {
        int l=nums.length;
        int res=l*(l+1)/2;
        int cur=0;
        for(int i=0;i<l;i++){
            cur+=nums[i];
        }

        return res-cur;
        
    }
}
