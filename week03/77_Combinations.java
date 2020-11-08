class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        getComb(n, k, 0, new ArrayList<Integer>());
        return res;
    }

    public void getComb(int n, int k, int start, List<Integer> list) {
        // Terminator 
        if(list.size() == k) {
            res.add(new ArrayList(list));
            return;
        }

        for(int i = start + 1; i <= n; i++) {
            list.add(i);
            getComb(n, k, i, list);
            list.remove(list.size() - 1); // Restore the current state
        }
    }
}