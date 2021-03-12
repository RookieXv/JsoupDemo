package com.vinsh.collections

import scala.collection.mutable.ArrayBuffer

/**
 * 创建数组两种方法
 * 遍历数组的三种方法
 *
 * <p>
 *
 * @author Vinsh Liu
 * @since 2021.03.12 周五
 */
object ArrayTest {
  def main(args: Array[String]): Unit = {

    var array = new Array[Int](10)
    array(0) = 10
    println(array(0))

    array = Array(1, 2, 3)
    println(array(0))

    for (a <- array) {
      println(a)
    }

    for (i <- 0 to array.length - 1) {
      printf("%d::", array(i))
    }

    for (a <- array.indices) {
      println(array(a))
    }

    println(array.max)
    var a = ArrayBuffer(1,2)
    a-=1

  }
}
