class Solution {
    public boolean validPalindrome(String s) {
        int i = 0; 
        int j = s.length()-1;
        while(i < j && s.charAt(i) == s.charAt(j)) {
            i++; 
            j--;
        }

        if(i == j) return true;
        else return check(s,i,j-1) || check(s,i+1,j);
    }

    public boolean check(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }

        return true;
    }
}