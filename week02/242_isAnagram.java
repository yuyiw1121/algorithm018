class Solution {
    /*
    *执行用时：14 ms, 在所有 Java 提交中击败了21.60%的用户
    *内存消耗：39.2 MB, 在所有 Java 提交中击败了26.72%的用户
    *运行时间较长
    */
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()) return false;
        //loop through first string, increase the count as each char shows up
        for(char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        //loop through second string, decrease the count as we go
        for(char c : t.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)-1);
        }

        //check if all the characters are cancelled out
        for(char c : map.keySet()) {
            if(map.get(c) != 0) return false;
        }

        return true;
    }


    /*
    * 优化 - 4ms runtime
    */
    public boolean isAnagram(String s, String t) {
        //array for chars count
        int[] alphabet = new int[26];

        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for(int i : alphabet) {
            if(i != 0) return false;
        }

        return true;
    }
}