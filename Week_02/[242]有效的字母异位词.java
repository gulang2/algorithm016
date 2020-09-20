


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "";
        String t = "";

        solution.isAnagram(s,t);

    }

        public boolean isAnagram (String s, String t){
            if (s.length() != t.length()) {
                return false;
            }
            int[] alpha = new int[26];
            for (int i = 0; i < s.length(); i++) {
                alpha[s.charAt(i) - 'a']++;
                alpha[t.charAt(i) - 'a']--;
            }
            for (int i = 0; i < 26; i++) {
                if (alpha[i] != 0) {
                    return false;

                }

            }
            return true;


        }

}
//leetcode submit region end(Prohibit modification and deletion)
