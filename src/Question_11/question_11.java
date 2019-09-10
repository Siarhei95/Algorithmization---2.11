package Question_11;

import java.util.Scanner;

public class question_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] a = new int[10][20];
        int []array = new int[20];
        System.out.println("Enter all the elements into matrix (range from 0 to 15): ");
        for(int i=0; i<10;i++){
            for(int j=0;j<20;j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix 10x20: ");
        for(int i=0; i<10;i++) {
            for (int j = 0; j < 20; j++) {
                if(a[i][j]<=15) {
                    System.out.print(a[i][j] + "\t");
                }
            }
            System.out.println();
        }
        int s = 0;
        for(int i=0; i<10;i++) {
            int k = 0;
            for (int j = 0; j < 20; j++) {
                if (a[i][j] == 5) {
                    k = k + 1;
                }
                if (k >= 3) {
                    s = s + 1;
                    array[s] = i+1;
                }
            }
        }
            System.out.println("Lines with 3 or more fives: ");
            for (int i=1; i<=s; i++) {
                System.out.println(array[i]);
            }
        }

    }

