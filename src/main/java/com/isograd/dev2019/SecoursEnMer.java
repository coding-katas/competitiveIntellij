package com.isograd.dev2019;

import java.util.*;
import java.util.stream.Stream;

public class SecoursEnMer {
    public static int get_int(List<String> lines, int x) {
        return Integer.parseInt(lines.get(x));
    }

    public static void main(String args[]) {
        //     List<String> lines = Arrays.asList("4", "41","29","10","1");
        List<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }

        int N = get_int(lines,0);
        int av = 0;
        for (int i=1;i<=N;i++) {
            int li = get_int(lines,i);
            av+= (li/10);
            if (li % 10 != 0) {
                av += 1;
            }
        }
        System.out.print(av);
    }
}