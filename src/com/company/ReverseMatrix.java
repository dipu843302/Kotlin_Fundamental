package com.company;

import java.util.Scanner;

public class ReverseMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row and column");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println("Enter the element");
        int[][] arr =new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Matrix in ascending order");
        for (int i=n-1;i>=0;i--){
            for (int j=m-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
