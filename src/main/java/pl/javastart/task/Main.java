package pl.javastart.task;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row;
        int col;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbę wierszy");
            row = sc.nextInt();
            if (row > 100 || row < 1) {
                System.out.println("Przedział dla wierszy to od 1 do 100");
                System.out.println("Podaj liczbę wierszy");
                row = sc.nextInt();
            }
        } while (!(row >= 1 && row <= 100));

        do {
            System.out.println("Podaj liczbę kolumn");
            col = sc.nextInt();
            if (col > 100 || col < 1) {
                System.out.println("Przedział dla kolumn to od 1 do 100");
                System.out.println("Podaj liczbę kolumn");
                col = sc.nextInt();
            }
        } while (!(col >= 1 && col <= 100));

        int[][] arrays = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arrays[i][j] = i * j;
            }
        }

        for (int[] array : arrays) {
            for (int cell : array) {
                System.out.printf("%3d |", cell);
            }
            System.out.println();
            System.out.println("--------------------------------------------------");
        }
        sc.close();
    }
}
