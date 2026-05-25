class Solution {
    public boolean isPalindrome(String s) {
         s = s.replaceAll("[^a-zA-Z0-9]", "");
         s = s.toLowerCase();
         StringBuilder str = new StringBuilder();
         for(int i = s.length()-1; i >= 0; i--)
         {
            str.append(s.charAt(i));
         }
    return s.equals(str.toString());
    }
}