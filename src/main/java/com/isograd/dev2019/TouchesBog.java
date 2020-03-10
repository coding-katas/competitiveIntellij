package com.isograd.dev2019;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TouchesBog {
    public static int get_int(List<String> lines, int x) {
        return Integer.parseInt(lines.get(x));
    }
    public static List<String> get_list_str(List<String> lines, int x) {
        return Stream.of(lines.get(x).split(" ")).collect(Collectors.toList());
    }

    public static void main(String args[]) {
        List<String> lines = Arrays.asList("2", "h d", "k i", "xpxw igcbIA lbHd SprdNszf feWiOk nsMzNdt uwqcb empw Efdl jgQdgzcrj nwqbB gxJfkjmt uhppqahuy djn cWl hxftMiy ixmzp fpbhEU ywioiu rckge qnaPo bbhhfnm sxObqfS ptbki tqLoG mKjPy cilqE amc Hydv dwXs");
        /*List<String> lines = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }*/

        int N = get_int(lines,0);
        String s = lines.get(N+1);
        for (int i=1;i<=N;i++) {
            s.replace(get_list_str(lines,i).get(0),get_list_str(lines,i).get(1));
        }
        System.out.print(s);
    }
}

//      List<HashMap<String,String>> h= new ArrayList<>();
//HashMap<String,String> x = new HashMap<String, String>();
//x.put(get_list_str(lines,i).get(0),get_list_str(lines,i).get(1));
//h.add(x);
