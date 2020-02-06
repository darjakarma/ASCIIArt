package com.company;

import java.util.Scanner;


public class ASCIIArt {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter width");
        int width = scan.nextInt();

        System.out.println("Enter height");
        int height = scan.nextInt();
        System.out.println("How many rows: ");
        int rows = scan.nextInt();

        for (int r = 0; r < rows; r++) {
            for (int g = 0; g < height; g++) {

                for (int i = 0; i < width; i++) {
                    System.out.print(
                            i == 0 || i == width - 1 || g == 0 || g == height - 1 ? "*" : "-");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}