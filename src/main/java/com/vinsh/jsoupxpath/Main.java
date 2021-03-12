package com.vinsh.jsoupxpath;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<String> friends = Arrays.asList("CSS", "HTML", "Oracle", "Dart");

    Comparator<String> compByLength = Comparator.comparingInt(String::length);
    friends.stream().sorted(compByLength).forEach(System.out::println);
  }
}