package com.vinsh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * @author Vinsh.Liu
 * @version 1.0.0
 * @createTime 2021/03/10
 * @description 解析url
 */
public class JsoupNetUrl {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://liuwenxu.com/archive").get();
        System.out.println(document.title());
    }
}
