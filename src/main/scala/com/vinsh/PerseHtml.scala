package com.vinsh

import com.vinsh.jsoup.HtmlParse
import org.jsoup.nodes.Element

import scala.collection.JavaConversions.asScalaBuffer

/**
 * scala和Java联合使用
 *
 * <p>
 *
 * @author Vinsh Liu
 * @since 2021.03.11 周四
 */
object PerseHtml {

  var wechat = new Wechat()

  def main(args: Array[String]): Unit = {
    val res = HtmlParse.getEle
    conventWechatAccountInfo(Seq(res)).foreach(w => println(w.getName))
  }

  val conventWechatAccountInfo: (Seq[Element]) => List[Wechat] =
    (elements: Seq[Element]) => {
      parse(elements)
    }

  val parse: Seq[Element] => List[Wechat] = (elements: Seq[Element]) => {
    elements.map(element => {

      element.getElementsByTag("span").foreach(
        sub => {
          sub.child(0).text() match {
            case "昵称" => wechat.setName(sub.child(0).text())
            case "地址" => wechat.setAddr(sub.child(0).text())
            case "电话" => wechat.setPhone(sub.child(0).text())
            case _ =>
          }
        }
      )
      wechat
    }).toList
  }
}
