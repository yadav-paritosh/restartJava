package org.paritosh.leetcode;

import javax.xml.stream.events.Characters;
import java.util.HashMap;

class ValidAnagram242 {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        s = s.replace(" ","");
        t = t.replace(" ", "");

        if(s.length() != t.length())
            return false;

        int[] counts = new int[26];

        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
        }

        for(int j=0;j<t.length();j++){
            counts[t.charAt(j)-'a']--;
        }

        for(int count : counts){
            if(count != 0)
                return false;
        }

        return true;
    }




    public boolean isAnagramAllCharacters(String s, String t) {
        if(s.length() != t.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char d : t.toCharArray()){
            if(!map.containsKey(d))
                return false;
            map.put(d, map.get(d)-1);

            if(map.get(d)==0)
                map.remove(d);
        }

        return map.isEmpty();
    }
}