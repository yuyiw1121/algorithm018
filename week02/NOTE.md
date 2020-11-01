# 学习笔记

## 哈希表 HashMap
 - ex: 电话表，员工信息
 - 通过哈希函数Hash（key）映射index给Value
 - 当碰撞（Hash collisions)发生时，通过添加维度（Linked List)去存放更多的关键码值
 - 获取，添加，删除 O（1）
 - 最坏情况（链表过长，哈希表过小时发生） O（n）

 ## [isAnagram] (242_isAnagram.java)
 ### 1. 暴力解法
 sort --> if(s == t) ? 
 runtime: O(nlogn)
 space: O(1)

 ### 2. 用HashMap
 统计每个字母的出现频率，增加第一个string的字母，减少第二个string的字母，最后对比表内所有的字母的值为零
 runtime：O(n)
 space: O(n)

 ## 树 Tree
 - 链表是特殊化的树 
 - 树是特殊化的图 - 没有闭环
 ### 遍历（递归）
 - 前序 （pre-order）： 根-左-右
 - 中序 （in-order）： 左-根-右
 - 后续 （post-order）： 左-右-根
 ### 二叉搜索树 Binary Search Tree
 - 左子树上所有结点的值均小于它的根节点的值
 - 右子树上所有节点的值均大于它的根节点的值
 - 左右子树均为二叉搜索树
 - 常见错误： 只比较左儿子和右儿子
 - 搜索 从根开始比较大小 O（nlog) - 树的深度
 - 插入 同搜索  O（nlog) - 树的深度
 - 删除 O（nlog) - 树的深度
   - leaf 直接删除
   - 关键节点 根或子树根节点， 用第一个大于删除节点的节点替代其原本位置

   ## [144. Binary Tree Preorder Traversal](144_preorder_traversal.java)
   创一个stack，先push根进去
   while stack != empty
   持续pop节点，将其加入result list，同时push此节点的左右节点进stack

   ## [94. Binary Tree Inorder Traversal](94_inorder_traversal.java)
   同上，改变遍历顺序（左-根-右）

   ## [145. Binary Tree Postorder Traversal](145_postorder_traversal.java)
   同上，使用链表，加入stack的顺序为根-左-右，每次pop出的节点用addFirst加入至链表的最前端

   ## 堆 Heap
 - 迅速找到一堆数种的最大或最小值
 - 大顶堆：根节点最大
 - 小顶堆：根节点最小
 - find-max O（1）
 - delete-max O(logN）
 - insert(create) O(logN)/O(1)
    ### 二叉堆
 - 通过完全二叉树实现
 - 满足
   - 是一颗完全数
   - 树中任意节点的值总是 >= 其子节点值
 - 通过数组实现
 - 假设第一个元素在数组中的索引为0
   - 索引为i的左孩子的索引是（2i+1）
   - 索引为i的右孩子的索引是（2i+2）
   - 索引为i的父节点的索引是floor（（i-1)/2)
 - 插入操作 HeapifyUp
   - 加入最末端
   - 依次向上调整结构
 - Delete Max
   - 将堆尾元素替换到顶部
   - 依次从根向下调整整个堆的结构 （找较大且大于自己的子节点进行交换）

## 图 Graph
 - Graph（V, E)
 - V - vertex 点
   - 度 - 入度/出度
   - 点与点之间是否联通
 - E -edge 边
   - 有向/无向
   - 权重
 - 表示方法
   - adjacency matrix
   - adjacency list

