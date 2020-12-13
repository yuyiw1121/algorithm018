class Solution {
    public int[][] merge(int[][] intervals) {
        // 按起始位置排序
        Arrays.sort(intervals, (v1, v2) -> v1[0] - v2[0]);
        
        int[][] res = new int[intervals.length][2];
        int index = -1;
        
        for(int[] interval : intervals) {
            // 如果数组为空或当前区间的起始值大于res数组中最后区间的终止值，添加该区间至res末尾
            if(index == -1 || interval[0] > res[index][1]) {
                res[++index] = interval;
            } else {
                // 反之将当前区间合并至res的最后区间
                res[index][1] = Math.max(res[index][1], interval[1]);
            }
        }
        
        // 去掉合并区间后空出的位置
        return Arrays.copyOf(res, index + 1);
    }
}