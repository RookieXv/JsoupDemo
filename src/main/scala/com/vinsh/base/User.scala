package com.vinsh.base

/**
 * apply
 *
 * <p>
 *
 * @author Vinsh Liu
 * @since 2021.03.12 周五
 */
class User {
  def apply() = 0
}

object UserTest {
  def test(x: Int): Int = {
    x + 1
  }

  def main(args: Array[String]): Unit = {
    val user = new User
    println(user())
    println(UserTest.test(10))
  }
}