package com.vinsh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @author Vinsh.Liu
 * @version 1.0.0
 * @createTime 2021/03/10
 * @description jsoup解析html
 */
public class HtmlParse {
    public static Element getEle() {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<meta charset=\"utf-8\">\n" +
                "\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "\t<title>测试网页</title>\n" +
                "\t<link rel=\"stylesheet\" href=\"\">\n" +
                "</head>\n" +
                "<body>\n" +
                "  <div class=\"navbar-menu\">\n" +
                "            <a href=\"https://vr.beifengtz.com/\" target=\"_blank\">VR360</a>\n" +
                "            <a href=\"/\">文章</a>\n" +
                "            <a href=\"/archives\">归档</a>\n" +
                "            <a href=\"/links\">友链</a>\n" +
                "            <a href=\"/about\">关于</a>\n" +
                "            <a href=\"http://blog.beifengtz.com/admin\" target=\"_blank\">管理</a>\n" +
                "            <div  id=\"myDIV\"class=\"navbar-search\" onclick=\"\">\n" +
                "<span class=\"icon-search\">" +
                "<li>昵称</li>" +
                "<li>地址</li>" +
                "<li>电话</li>" +
                "</span>" +
                "                <form role=\"search\" onsubmit=\"return false;\">\n" +
                "                <span class=\"search-box\">\n" +
                "                    <input type=\"text\" id=\"search-inp\" class=\"input\" placeholder=\"搜索...\" maxlength=\"30\" autocomplete=\"off\" />\n" +
                "                </span>\n" +
                "                </form>\n" +
                "            </div>\n" +
                "        </div>"+
                "</body>\n" +
                "</html>";

        // html转化为document对象
        Document document = Jsoup.parse(html);
        return document.getElementById("myDIV");
    }
}
