package com.isograd.dev2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class toboggan {
    public static int get_int(List<String> lines, int x) {
        return Integer.parseInt(lines.get(x));
    }
    public static List<Integer> get_list_int(List<String> lines, int x) {
        return Stream.of(lines.get(x).split(" ")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());
    }

    public static void main(String args[]) {
        List<String> lines = Arrays.asList("13", "2 15 8 4 10 11 6 6 12 3 9 9 8");
        /*List<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }*/

        int N = get_int(lines,0);
        long l = get_list_int(lines,1).stream()
                .filter(x -> x>=5 && x<=9)
                .count();
        System.out.print(l);
    }
}