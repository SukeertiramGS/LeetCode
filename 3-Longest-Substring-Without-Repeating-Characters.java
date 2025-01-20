 class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int r = 0;
        int cnt = 0;
        int position = 0;
        for(int i = 0; i < s.length(); i++) {
            if(
                map.containsKey(s.charAt(i)) 
                && 
                map.get(s.charAt(i)) >=position
            ) {
                cnt = i - map.get(s.charAt(i));
                position = map.get(s.charAt(i));
            } else {
                cnt ++;
            }
            map.put(s.charAt(i), i);
            r = Math.max(r, cnt);
        }
        return r;
    }

        }