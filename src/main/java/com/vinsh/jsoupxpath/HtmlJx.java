package com.vinsh.jsoupxpath;

import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.util.List;

/**
 * @author Vinsh.Liu
 * @version 1.0.0
 * @createTime 2021/03/10
 * @description jsoupxpath
 */
public class HtmlJx {
    public static void main(String[] args) {
        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "\t<meta charset=\"utf-8\">\n" +
                "\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "\t<title>测试网页</title>\n" +
                "\t<link rel=\"stylesheet\" href=\"\">\n" +
                "</head>\n" +
                "<body>\n" +
                "\t<p>这是p标签的内容</p>\n" +
                "\t<a href=\"https://liuwenxu.com\" title=\"vinsh's blog\"> blog</a>\n" +
                "\t<a href=\"https://liuwenxu.com/code/42\" title=\"test article\"> blog</a>\n" +
                "</body>\n" +
                "</html>";
        JXDocument document = JXDocument.create(html);

        String xpath = "//@href";
        List<JXNode> jxNodes = document.selN(xpath);

        jxNodes.forEach(System.out::println);
    }
}
