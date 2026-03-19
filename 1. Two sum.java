Brute force code:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int[] result =new int[2];
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++)
            if(nums[i]+nums[j]==target)
            result=new int[]{i,j};
        }
        return result;
        
    }
}

time - 66ms ( O(n^2))
space - 47.18mb (O(n)


Better Solution:

class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      if (numToIndex.containsKey(target - nums[i]))
        return new int[] {numToIndex.get(target - nums[i]), i};
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException();
  }
}

time - 3ms
space - 47.04 mb


Optimal code :

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}

Time - 2ms
Space - 47.32mb



Most Optimal code✅ :

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=1; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if((nums[j-i] + nums[j]) == target){
                    return new int[]{j-i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

time - 0ms beats 100% 🎉
space - 46.38mb beats 99.27%🎉
