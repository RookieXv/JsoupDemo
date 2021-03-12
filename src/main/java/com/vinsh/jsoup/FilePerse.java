package com.vinsh.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;

/**
 * @author Vinsh.Liu
 * @version 1.0.0
 * @createTime 2021/03/10
 * @description 本地html文件解析
 */
public class FilePerse {
    public static void main(String[] args) throws IOException {
        File file = new File(System.getProperty("user.dir") + File.separator + "index.html");
        Document document = Jsoup.parse(file, "utf-8");
        System.out.println(document.title());

        document.getAllElements().forEach(Element::id);
    }
}
