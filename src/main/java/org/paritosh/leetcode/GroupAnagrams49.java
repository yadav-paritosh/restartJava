package org.paritosh.leetcode;

import java.util.*;

class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
            return new ArrayList<>();

        HashMap<String,List<String>> freqStrMap = new HashMap<>();
        for(String str : strs){
            String freqStr =  getStrFreq(str);
            if(freqStrMap.containsKey(freqStr)){
                freqStrMap.get(freqStr).add(str);
            }else{
                List<String> strList = new ArrayList<>();
                strList.add(str);
                freqStrMap.put(freqStr,strList);
            }
        }
        return new ArrayList<>(freqStrMap.values());
    }

    public String getStrFreq(String str){

        int[] freq = new int[26];
        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }

        StringBuilder freqStr = new StringBuilder("");

        char c='a';
        for(int i : freq){
            if(i>0) {
                freqStr.append(c);
                freqStr.append(i);
                c++;
            }
        }
        return freqStr.toString();
    }
}