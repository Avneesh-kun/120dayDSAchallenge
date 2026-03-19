//BRUTE FORCE APPROACH
// Time Complexity - O(n Square )
// Space Complexity - O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==num)
                    cnt++;
            }
            if(cnt==1){
                result = num;
            }
        }
        return result;
    }
}



//Optimal Soluion
// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
}
