package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();
        String[] label = {"A", "B", "C"};

        for (int cont = 0 ;(cont < 3); cont++) {
            System.out.print("How many students for course "+ label[cont]+" ? ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Student " + (i+1) + ": ");
                int number = sc.nextInt();
                set.add(number);
            }
        }
        System.out.println("Total students: " + set.size());
    }
}