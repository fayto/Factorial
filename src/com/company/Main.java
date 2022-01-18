package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int fact = 1;
        for (int i = 2; i < n+1; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
