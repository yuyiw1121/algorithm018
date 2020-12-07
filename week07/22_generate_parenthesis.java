class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        generate(n, 0,0,"");
        return res;    
    }
    
    public void generate(int n, int numLeft, int numRight, String s) {
        // Terminator
        if(numLeft == n && numRight == n) {
            res.add(s);
        }
        
        //剪枝
        if(numLeft < n) {
            generate(n, numLeft + 1, numRight, s + "(");
        }

        //剪枝
        if(numRight < n && numRight < numLeft) {
            generate(n, numLeft, numRight + 1, s + ")");
        }
    }
}
