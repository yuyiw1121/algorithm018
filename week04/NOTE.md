# 学习笔记
## 搜索 - 遍历
- 每个节点都要访问一次
- 每个节点仅仅要访问一次
- 节点访问顺序
	- 深度优先： Depth First Search
	- 广度优先： Breath Firet Search
	- 优先级优先

### DFS代码
    visited = set()
    def dfs(node, visited):
        if node in visited: # terminaotr
            return # already visited
        visited.add(node)
        # process current node here

        for next_node in node.children():
            if not next_node in visited:
                dfs(next_node, visited)

### BFS代码

    def BFS(graph, start, end):
        queue = []
        queue.append([start])
        visited.add(start)
        
        while queue:
            node = queue.popleft()
            visited.add(node)

            process(node)
            nodes = generate_related_nodes(node)
            queue.push(nodes)

## 贪心算法 Greedy Algorithm
 - 在每一步选择中都采取当前状态下最好或最优的选择，从而希望导致结果是全局最好或最优的算法
 - 贪心 vs 回溯 vs 动态规划
	- 贪心： 当下做局部最优判断， 不会回退
	- 回溯： 能够回退
	- 动态规划： 最优判断 + 回退
 - 可解决最优化问题
 - 可用作辅助算法或者直接解决一些要求结果不特别精确的问题 （ 高效性及较为接近最优解的答案）
 - 适用贪心算法的场景
	- 问题能够分解成子问题来解决，子问题的最优解能递推到最终问题的最优解 -> 最优子结构

## 二分查找 Binary Search O(logN)
- 前提
    - 目标函数单调性 & 有序（单调递增或递减）
    - 存在上下界 （bounded）
    - 能够通过索引访问

### 代码模板
    left, right = 0, len(array) - 1
    while left <= right:
        mid = (left + right)/2
        if array[mid] == target:
            #find the target!!
            break or return result
        elif array[mid] < target:
            left = mid + 1 #目标在mid右侧
        else:
            right = mid - 1; #目标在mid左侧

## [单词接龙] (127_ladderLength.java)

## [柠檬水找零] (860_lenmonade_change)