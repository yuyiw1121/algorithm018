public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;

        // 第一次使用的condition为 while(n>0), 这里忽略了n可以为负的可能性
        while(n  != 0) {
            count ++;
            n = n & (n-1);
        }

        return count;
    }
}
