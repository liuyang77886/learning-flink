package top.xiesen.stream.custompartition

import org.apache.flink.api.common.functions.Partitioner


class MyPartitionScala extends Partitioner[Long] {
  override def partition(key: Long, numPartitions: Int): Int = {
    println("分区总数: " + numPartitions)
    if (key % 2 == 0) {
      0
    } else {
      1
    }
  }
}
