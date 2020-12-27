package com.nijad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> a = new ArrayList<>(); //
    public static ArrayList<String> b = new ArrayList<>(); //
    static void init(){
        a.add("");
        a.add("bir");
        a.add("iki");
        a.add("uch");
        a.add("dord");
        a.add("bes");
        a.add("altı");
        a.add("yeddi");
        a.add("sekkiz");
        a.add("doqquz");

        b.add("");
        b.add("on");
        b.add("iyirmi");
        b.add("otuz");
        b.add("qirx");
        b.add("elli");
        b.add("altmis");
        b.add("yetmis");
        b.add("seksen");
        b.add("doxsan");



    }
    static int getLength(int n){
        int res = 0;
        if(n == 0) return 1;
        while(n > 0){
            res++;
            n/=10;
        }
        return res;
    }
    static void convert(String s){
        int n = Integer.parseInt(s);
        int len = getLength(n);
        if(len == 1){
            System.out.print(a.get(n));
        }else if(len == 2){
            System.out.print(b.get(n / 10) + " " + a.get(n%10));
        }else{
            int d1 = s.charAt(0) - '0';
            int d2 = s.charAt(1) - '0';
            int d3 = s.charAt(2) - '0';
            System.out.print(a.get(d1) + " yuz " + b.get(d2) + " " + a.get(d3));
        }
    }
    public static void main(String[] args) {
        init();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] p = line.split("\\.");

        ArrayList<String> parts = new ArrayList<>();
        int n = p[0].length();
        int i = n-1;
        for(i = n - 1; i >= 2; i -= 3){
            String newPart = new StringBuilder().append(p[0].charAt(i)).append(p[0].charAt(i-1)).append(p[0].charAt(i-2)).reverse().toString();
            parts.add(newPart);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(i>= 0){
            stringBuilder.append(p[0].charAt(i));
            i--;
        }
        String last = stringBuilder.reverse().toString();
        if(!last.isEmpty())parts.add(last);
        int parts_size = parts.size();
        for(int j = parts_size - 1; j >= 0; j--){
            convert(parts.get(j));
            if(!parts.get(j).equals("0") && !parts.get(j).equals("00") &&  !parts.get(j).equals("000") ) {
                if (j == 3) {
                    System.out.print(" milyard ");
                } else if (j == 2) {
                    System.out.print(" milyon ");
                } else if (j == 1) {
                    System.out.print(" min ");
                } else {
                    // nothing
                }
            }
        }


        if(Integer.parseInt(p[0]) == 0){
            System.out.print("sıfır");
        }
        System.out.print( " manat " );



        if(p[1].equals("00")){
            System.out.print("sıfır");
        }else{
            convert(p[1]);
        }

        System.out.print( " qepik " );

    }
}
