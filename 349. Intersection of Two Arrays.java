//Brute Force 
//time - 7ms
//space - 45.1MB

class Solution {
    
    void addList(ArrayList<Integer> list, int x) {
        if(list.isEmpty() || list.get(list.size() - 1) != x) {
            list.add(x);
        }
    }

    public int[] intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                addList(list, arr1[i]);
                i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        int[] result = new int[list.size()];
        for(int k = 0; k < result.length; k++) {
            result[k] = list.get(k);
        }
        
        return result;
    }
}

//optimal solution
//time - 0ms
//space - 44.8MB

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] bNum1 = new boolean[1001];
        int size = nums1.length > nums2.length ? nums2.length : nums1.length;
        int[] result = new int[size];
        int index = 0;

        for(int num : nums1) {
            bNum1[num] = true;
        }

        for(int num : nums2) {
            if(bNum1[num]) {
                result[index++] = num;
                bNum1[num] = false;
            }
        }

        int[] result1 = new int[index];
        for (int i = 0; i < index; i++) {
            result1[i] = result[i];
        }

        return result1;
    }
}
