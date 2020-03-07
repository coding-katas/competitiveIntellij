package com.isograd.dev2019;

import java.util.Scanner;
import java.util.stream.Stream;

public class SecoursEnMer {
    public static void main(String args[]) {
        String  line;
        int N = 0;
        Scanner sc = new Scanner(System.in);
        //line = sc.nextLine();
        line = "13";
        N = Integer.parseInt(line);
        //line = sc.nextLine();
        line="2 15 8 4 10 11 6 6 12 3 9 9 8";
        long l = Stream.of(line.split(" "))
                .map(s -> Integer.parseInt(s)) // convert to int
                .filter(x -> x>=5 && x<=9)  // filter
                .count();
        System.out.print(l);
    }
}
