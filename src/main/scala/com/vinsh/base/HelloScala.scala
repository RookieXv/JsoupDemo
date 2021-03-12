package com.vinsh.base

/**
 * @author Vinsh.Liu 
 * @createTime 2021/03/10
 * @version 1.0.0
 * @description 第一个Scala程序
 */
object HelloScala {
  def main(args: Array[String]): Unit = {

    // val相当于final
    val money = 100.00d

    // var声明变量，可以不指定类型
    var name = "vinsh"
    val addr: String = "Suzhou"

    // 打印可以用+，也可以用逗号
    println(name + "--" + money, addr)
    println(f"姓名：%%s,价格：%%1.1f,地址：%%s", name, money, addr)
    println(s"name=$name", name, money, addr)

    println(money + (20.00d))
    // money=120.00d

    /*
    方法声明与调用
     */
    val res = iftest(11, 12)
    println(res)

    val arr = Array(1, 2, 3, 4, 5)
    fortest(arr)


    /*
    函数声明与调用
     */
    val s = (x: Int) => x * 8
    println(s(10))

    def addOne(x: Int): Int = x + 1

    println(addOne(10))

    def three() = 1 + 1

    three()

    val doubl = (x: Int) => x * 2
    println(doubl.apply(2))


    val threeNumAdd: (Int, Int, Int) => Int = (x: Int, y: Int, z: Int) => x + y + z
    println(threeNumAdd(1, 2, 3))

    val sx: (Int => String) = x => x + "1"
    println(sx(1))

  }

  /**
   *
   * @param a
   * @param b
   * @return
   */
  def iftest(a: Int, b: Int): Boolean = {
    if (a > b) true
    else false
  }

  /**
   *
   * @param array
   */
  def fortest(array: Array[Int]): Unit = {
    for (elem <- array) {
      println(elem)
    }
  }
}
