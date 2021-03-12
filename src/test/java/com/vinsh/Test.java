package com.vinsh;

import java.util.Map;

/**
 * 查看电脑信息
 *
 * <p>
 *
 * @author Vinsh Liu
 * @since 2021.03.11 周四
 */
public class Test {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        Map<String, String> map = System.getenv();
        map.forEach((k, v) -> System.out.println(k + "::" + v));
    }
}
