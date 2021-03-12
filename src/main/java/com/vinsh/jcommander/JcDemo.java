package com.vinsh.jcommander;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.internal.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * names 设置命令行参数，如-old
 * required 设置此参数是否必须
 * description 设置参数的描述
 * order 设置帮助文档的顺序
 * help 设置此参数是否为展示帮助文档或者辅助功能
 *
 * <p>
 *
 * @author Vinsh Liu
 * @since 2021.03.12 周五
 */
public class JcDemo {
    @Parameter
    public List<String> parameters = Lists.newArrayList();

    @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
    public Integer verbose = 1;

    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
    public String groups;

    @Parameter(names = "-debug", description = "Debug mode")
    public boolean debug = false;

    @DynamicParameter(names = "-D", description = "Dynamic parameters go here")
    public Map<String, String> dynamicParams = new HashMap<String, String>();


    public static void main(String[] args) {
        JcDemo jcDemo = new JcDemo();
        String[] argv = { "-log", "2", "-groups", "unit1,unit2,unit3",
                "-debug", "-Doption=value", "a", "b", "c" };

        JCommander.newBuilder().addObject(jcDemo)
                .build()
                .parse(args);

        System.out.println(jcDemo.verbose.intValue());
    }
}
