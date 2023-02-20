class Solution {
    
    // Two Pointer
    // T: O(n)
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        
        while (i < j) {
            char start = Character.toLowerCase(s.charAt(i));
            char end = Character.toLowerCase(s.charAt(j));
            
            if (!Character.isLetterOrDigit(start)) {
                i++;
            } else if (!Character.isLetterOrDigit(end)) {
                j--;
            } else if (start == end) {
                i++; j--;
            } else {
                return false;
            }
        }
        
        return true;
    }
}
