package com.vinsh.jsoupxpath;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.seimicrawler.xpath.JXDocument;
import org.seimicrawler.xpath.JXNode;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;

import static java.nio.file.StandardOpenOption.*;

/**
 * @author Vinsh.Liu
 * @version 1.0.0
 * @createTime 2021/03/10
 * @description 测试JsoupXpath根据url解析并写入本地文件
 */
public class UrlJx {
    public static void main(String[] args) {
        JXDocument jxDocument = JXDocument.createByUrl("https://liuwenxu.com/archive");
        List<JXNode> list = jxDocument.selN("//ul/li@title");

        list.stream()
                .map(e -> e.asElement().select("a"))
                .filter(a -> a.attr("href").startsWith("https://liuwenxu.com/archives"))
                .limit(20)
                .forEach(a -> {
                    String text = a.text();
                    String href = a.attr("href");
                    String alist = text + "[" + href + "]" + "\r\n";
                    System.out.println(alist);

                    Path path = Paths.get(System.getProperty("user.dir") + File.separator + "list.txt");
                    byte[] bytes = alist.getBytes();

                    try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(path, CREATE, APPEND))) {
                        os.write(bytes, 0, bytes.length);
                    } catch (IOException e) {
                        System.err.println(e);
                    }
                });
    }
}
