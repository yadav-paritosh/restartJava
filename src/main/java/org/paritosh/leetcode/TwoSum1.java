package org.paritosh.leetcode;

import java.util.HashMap;

class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> resHM = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (resHM.containsKey(rem)) {
                return new int[]{resHM.get(rem), i};
            }
            resHM.put(nums[i], i);
        }

        return new int[]{};
    }
}
