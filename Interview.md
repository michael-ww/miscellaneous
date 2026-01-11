1. disk data page cache: 4K L1,L2,L3 cache line: 64bytes
2. Redis 分布式锁用 lua 脚本实现开锁并设置过期时间保证原子性
3. sql 语句的执行顺序 from-on-join-where-group by-having-select-distinct-order by-limit
4. 查看 SQL 语句执行过程 explain 关键字
5. 解决哈希冲突的四种方法：开放地址方法(再散列法)，再哈希法，建立公共溢出区，链式地址法
6. GC 垃圾回收器：分代收集器的代表是 CMS，分区收集器的代表是 G1 和 ZGC
7. synchronized 是 JVM 层面的锁，是 Java 关键字，通过 monitor 对象来完成（monitorenter 与 monitorexit），对象只有在同步块或同步方法中才能调用 wait/notify 方法，ReentrantLock 是从 jdk1.5 以来（java.util.concurrent.locks.Lock）提供的 API 层面的锁。

synchronized 的实现涉及到锁的升级，具体为无锁、偏向锁、自旋锁、向 OS 申请重量级锁，ReentrantLock 实现则是通过利用 CAS（CompareAndSwap）自旋机制保证线程操作的原子性和 volatile 保证数据可见性以实现锁的功能 8. MySql 隔离级别：Read Uncommitted Read Committed Repeatable Read Serializable 9. 滑动窗口大小的选择根据网络带宽、延迟和丢包率等因素进行调整，发送方的让自己的发送窗口=min(cwnd，接受端接收窗口大小)。说明: 发送方取拥塞窗口与滑动窗口的最小值作为发送的上限。TCP 拥塞控制的几种方法：慢启动，拥塞避免，快重传和快恢复。
