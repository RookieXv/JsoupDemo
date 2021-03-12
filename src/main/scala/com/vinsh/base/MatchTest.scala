package com.vinsh.base

/**
 * @author Vinsh.Liu 
 * @createTime 2021/03/10
 * @version 1.0.0
 * @description 模糊匹配
 */
object MatchTest {
  def main(args: Array[String]): Unit = {
    println(matchAny(null))
  }

  def matchAny(item: Any): Any = item match {
    case 1 => "woshi shuzi 1"
    case "2" => "woshi zifu 2"
    case _ => "woshi 0"
  }
}
