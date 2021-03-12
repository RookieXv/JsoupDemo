package com.vinsh.collections

/**
 * 元组
 *
 * <p>
 *
 * @author Vinsh Liu
 * @since 2021.03.12 周五
 */
object TupleTest {
  def main(args: Array[String]): Unit = {
    var tuple = ("a", 1, false)
    println(tuple._1)

    for (i <- 0 until tuple.productArity) {
      println(s"第${i}个元素是: ${tuple.productElement(i)}")
    }

    var t = (1->2)
  }
}
