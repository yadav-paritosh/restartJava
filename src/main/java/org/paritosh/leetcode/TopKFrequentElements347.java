package org.paritosh.leetcode;

import java.util.*;

class TopKFrequentElements347 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        for(int i : nums){
            freqMap.put(i, freqMap.getOrDefault(i,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> res = new PriorityQueue<>(
                (a,b)-> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            res.offer(entry);
            if(res.size()> k)
                res.poll();
        }

        int[] arr = new int[k];
        int i=0;

        while(! res.isEmpty()){
            arr[i++] = res.poll().getKey();
        }
        return arr;
    }
}