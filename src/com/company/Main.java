package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] unit = new int[] { 1, 5, 10, 25, 100, 500, 1000, 5000, 10000 };
        String[] fmt = new String[] { "Penny", "Nickel", "Dime", "Quarter",
                "One Dollar bill", "Five Dollar bill", "Ten Dollar bill",
                "Fifty Dollar bill", "One Hundred Dollar bill" };
        while (scan.hasNext()) {
            StringBuilder sb = new StringBuilder();
            int N = (int) (scan.nextFloat() * 100);
            for (int i = unit.length - 1; i >= 0 && N > 0; i--) {
                if (N >= unit[i]) {
                    if (sb.length() > 0)
                        sb.append('\n');
                    int n = N / unit[i];
                    String fmts = n > 1 ? i == 0 ? "Pennies" : String.format(
                            "%ss", fmt[i]) : fmt[i];
                    sb.append(String.format("%d %s", N / unit[i], fmts));
                    N = N % unit[i];
                }
            }
            System.out.println(sb.toString());
        }
}
}
