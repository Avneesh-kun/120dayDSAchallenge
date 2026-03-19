//brute force approach
import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> v1 = new ArrayList<>();
        List<Integer> v2 = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        for (int num : nums) {
            if (num > 0) {
                v1.add(num);
            } else {
                v2.add(num);
            }
        }
        
        int ind1 = 0, ind2 = 0;
        
        while (ind2 < nums.length / 2) {
            ans.add(v1.get(ind1));
            ind1++;
            ans.add(v2.get(ind2));
            ind2++;
        }
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}

time = 2ms
space = 188mb

//Optimal solution
import java.util.*;

class Solution {
    public int[] rearrangeArray(int[] nums) {
       int n = nums.length;
       int[] ans= new int[n];
       int pos=0, neg = 1;
       for(int i=0; i<n; i++){
        if(nums[i]>0){
            ans[pos]=nums[i];
            pos+=2;
        }else{
            ans[neg]=nums[i];
            neg+=2;
        }
       }
       return ans;
    }
}

time = 3ms
space = 175mb
