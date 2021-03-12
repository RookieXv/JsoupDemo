package com.vinsh.base

import scala.io.Source.fromFile

/**
 * @author Vinsh.Liu 
 * @createTime 2021/03/10
 * @version 1.0.0
 * @description io
 */
object IOTest {
  def main(args: Array[String]): Unit = {
//    var writer = new PrintWriter(new File("D:\\code\\scala-demo\\test.txt"))
//    writer.write("ceshi yixia")
//    writer.close()

    println(fromFile("D:\\code\\scala-demo\\test.txt").foreach{print})
  }
}
