package org.paritosh.leetcode;

import java.util.HashSet;

class Solution {
    public boolean ContainsDuplicate217(int[] nums) {
        HashSet<Integer> uniNums = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(uniNums.contains(nums[i]))
                return true;
            uniNums.add(nums[i]);
        }
        return false;
    }
}