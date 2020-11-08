# 学习笔记

## 递归 recursion
### 基本结构
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { // 递归终结条件
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); // 处理当前层逻辑
  // drill down 
  recur( level: level + 1, newParam); // 下探到下一层
  // restore current status 
  // 有需要的话可清理当前层
}

### 思维要点
	- 不要进行人肉递归
	- 找到最近最简方法，将其拆解成可重复解决的问题 （重复子问题）

  
## 分治 divide & conquer
### 模板
private static int divide_conquer(Problem problem, ...) {
	// Recursion terminator
	if(problem == NULL) {
		int res = proceee_last_result();
		return res;
	}
	
	// Prepare date
	subProblem = split_problem(problem)
	
	// Conquer subproblems
	res0 = divide_conquer(subProblems[0])	
	res1 = divide_conquer(subProblems[1])
	
	// Process and generate the final result
	result = process_result(res0, res1);

	// Revert the current level states if needed

	return result;
}	
重点：找出可以重复运算的子问题

## 回溯 Backtracking
- 采用试错的思想，它尝试分布的去解决一个问题。在分布解决问题的过程中，当通过尝试发现现有的分步答案不能解决时，将取消上几步的计算，再通过其他的可能的分布解答再次尝试寻找问题的答案。
- 通常用最简单的递归方法来实现，经过重复后可能会出现两种情况：
	- 找到一个可能存在的答案
	- 在尝试了所有可能的分步方法后发现该问题没有答案