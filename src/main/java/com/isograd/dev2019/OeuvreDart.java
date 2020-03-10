package com.isograd.dev2019;

import java.util.*;
import java.util.stream.Collectors;

public class OeuvreDart {
    public static int get_int(List<String> lines, int x) {
        return Integer.parseInt(lines.get(x));
    }

    public static void main(String args[]) {
        List<String> lines = Arrays.asList("3", "6","65","222");
    /*    List<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }*/
        List<Integer> c = Arrays.asList(2, 3, 5, 7, 11);
        List<Integer> res = new ArrayList<>();
        Collections.reverse(c);
        int N = get_int(lines,0);
        int av = 0;
        for (int i=1;i<=N;i++) {
            int li = get_int(lines,i);
            int h=li;
            for (int m=0;m<5;m++) {
                int j=c.get(m);
                if ((j<=h)&&(h%j==0)) {
                        res.add(j);
                }
            }

        }
        Set<Integer> s = new HashSet<>(res);
  //      System.out.println(s.toString().replace(",","").replace("[","").replace("]",""));
        System.out.println(s.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }
}
