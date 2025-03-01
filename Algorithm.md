# Algorithm

## 搜索二叉树
定义：左节点比父节点小，右节点比父节点大
校验：中序遍历 升序

### 平衡二叉搜索树
左子树和右子树高度差不大于1；

### AVL
带了自平衡功能(左旋或者右旋)的二叉搜索树

## 图
表示：邻接表法/邻接矩阵法/数组

## 完全二叉树
1>如果树为空，则直接返回错
2>如果树不为空：层序遍历二叉树
2.1>如果一个结点左右孩子都不为空，则pop该节点，将其左右孩子入队列；
2.1>如果遇到一个结点，左孩子为空，右孩子不为空，则该树一定不是完全二叉树；
2.2>如果遇到一个结点，左孩子不为空，右孩子为空；或者左右孩子都为空，且则该节点之后的队列中的结点都为叶子节点，该树才是完全二叉树，否则就不是完全二叉树;

## 满二叉树
一个二叉树，如果每一个层的结点数都达到最大值，则这个二叉树就是满二叉树。也就是说，如果一个二叉树的深度为K，且结点总数是2^k^ -1 ，则它就是满二叉树。

## 堆
堆(Heap)最高效的优先级队列
堆结构就是用数组实现的完全二叉树结构
优先级队列就是堆结构

## 哈希
输入域无穷大，输出区域有限
相同的输入，相同的输出，会出现不同的输入，相同的输出，因为输入域无穷大，输入域有限，概率极低
输出域离散性极度均匀
MD5:0～2^64^ -1,16个字符，16进制
SHA1:0~2^128^ -1，32个字符，16进制
哈希槽（Array）每个槽挂链表

## 布隆过滤器
没有删除，只有添加和查询

## 一致性哈希
哈希操，虚拟节点

## 树形DP
1.以某个节点X为头节点的子树中，分析答案有哪些可能性，并且这种分析是以X的左子树，X的右子树和X的整棵树的角度来考虑可能性的；
2.根据第一步的可能性分析，列出所需要的信息；
3.合并第二步的信息，对左树和右树提出同样的要求，并写出信息的结构；
4.设计递归函数，递归函数是处理以X为头节点的情况下的答案；
包括设计递归函数的Base Case，默认直接得到左树和右树的所有信息，以及把可能性做整合，并且要返回第三部的信息结构

## Morris遍历
假设来到当前节点Current，开始时Current来到头节点位置
1 如果Current没有左孩子，Current向右移动（Current=Current.Right）
2 如果Current有左孩子，找到左子树上最右的节点MostRight；
    a 如果MostRight的右指针指向null，让其指向Current，然后Current向左移动(Current=Current.Left)；
    b 如果MostRight的右指针指向Current，让其指向null，然后Current向右移动(Current=Current.Right)；
3 Current为空时遍历停止；

## 有序表 O(logN)
1.红黑树，AVL树，Size-Balance Tree，跳表
2.平衡搜索二叉树系列，上面前三,搜索二叉树上默认无重复值；
3.删除节点，然后用左树最右的节点或者右树最左的节点替代；
4.平衡树，任何一个节点，左树和右树的高度差不大于1；

## 桶排序
基数排序和计数排序
都是不基于比较的排序
时间复杂度O(N)，额外空间复杂度O(N)
应用范围有限，需要样本数据状况满足桶的划分
不基于比较的排序都是对实际的数据状况有要求

目前没有找到时间复杂度O(N*logN),并且空间复杂度O(1)，并且又具有稳定性的排序；

## 链表
技巧哈希表和快慢指针

## 牛顿迭代法
近似求解方程的方法，近似求解函数零点的方法，本质是借助泰勒级数，从初始值开始快速向函数零点逼近；

## 回溯
void backtracking(参数) {
    if (终止条件) {
        存放结果;
        return;
    }

    for (选择：本层集合中元素（树中节点孩子的数量就是集合的大小）) {
        处理节点;
        backtracking(路径，选择列表); // 递归
        回溯，撤销处理结果
    }
}

回溯法就是改良版的穷举法。其属于深度优先搜索，由于是全局搜索，复杂度相对高

对于寻找所有可行解的题，可以尝试用「搜索回溯」的方法来解决

## 递归
任何递归都是dfs
带路径的递归和不带路径递归

## 汉诺塔问题
最优移动次数是：2^n^-1

## 嵌套问题
1. 定义全局int where；
2. 递归函数f(i):s[i...],从i位置开始解析，遇到字符串终止或嵌套条件终止，就返回
3. 返回值是f(i)负责的这一段结果
4. f(i)返回前更新where，让上级函数通过where知道解析到了什么位置，进而继续
5. 如果f(i)遇到嵌套条件开始，就调用下级递归去处理嵌套，下级会负责嵌套部分的计算结果
6. f(i)下级处理完成后，f(i)可根据下级更新的where，知道该从什么位置继续解析

## 最大公约数
欧几里得算法：转辗相除法 gcd(a,b) {return b==0? a:gcd(b,a%b);}

## 对数器打表找规律
1. 使用场景：入参和返回值都是简单类型
2. 过程
   用暴力方式求的入参不大的答案(一般是递归实现)
   打印上面的答案，观察规律
   将规律编程代码，即最优解

## 根据数据量猜解法
10^7~10^8,入参的取值范围

## 滑动窗口
分析问题单调性(贪心)方面的特征

## 二分答案法
1.估计答案可能的范围<br/>
2.建立问题的答案和给定条件之间的单调性<br/>
3.建立f函数，在答案固定的情况下，判断给定的条件是否达标(小于等于这个条件的情况下)<br/>
4.在最终答案的可能范围上不断的二分搜索，每次用f函数判断，大于等于给定条件，直到二分结束，找到最合适的答案<br/>


## 动态规划
任何动态规划问题都一定对应着一个有重复调用行为的递归<br/>
任何动态规划问题都一定可以从递归入手，逐渐实现动态规划的方法<br/>