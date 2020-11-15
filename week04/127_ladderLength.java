class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Cornor case
        if(!wordList.contains(endWord)) return 0;

        // BFS
        Queue<String> queue = new LinkedList<String>();
        queue.add(beginWord);
        boolean[] marked = new boolean[wordList.size() +1];
        int count = 1;
        while(!queue.isEmpty()) {
            count++;
            int size = queue.size();

            while(size-- > 0) {
                String cur = queue.poll();
                // Loop through wordList and add transfromable word to the next level
                for(int i = 0; i < wordList.size(); i++) {
                    // If visited, skip
                    if(marked[i]) continue;
                    String word = wordList.get(i);
                    if(canChange(cur, word)) {
                        if(word.equals(endWord)) return count;
                        queue.add(word);
                        marked[i] = true;
                    } 
                }
            }
        }

        return 0;
    }

    // Check if the words are transformable.
    private boolean canChange(String cur, String next) {
        int diff = 0;
        for(int i = 0; i < cur.length(); i++) {
            if(cur.charAt(i) != next.charAt(i)) diff++;
        }

        return diff == 1;
    }
}