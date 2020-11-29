# 学习笔记

## 动态规划 Dynamic Programming
- Wiki: "simplifying a complicated problem by breaking it down into simpler sub-problems"  (in a recursive manner)
- 分治 + 最优子结构
- 和递归或者分治没有根本上的区别 （关键看有无最优子结构）
- 共性： 找到重复子问题
- 差异性；最优子结构，中途可以淘汰次优解 (O(2^n) -> O(n)/O(n^2))
- 关键点
    - 最优子结构： opt[n] = best_of(opt[n-1], opt[n-2], ...)
    - 储存中间状态： opt[i]
    - 递推公式 （状态转移方程/DP方程）
        - Fib: opt[i] = opy[i-1] + opt[i-2]
        - 二维路径： opt[i,j] = opy[i+1][j]+ opt[i][j+1] (且判断a[i,j]是否为空地)