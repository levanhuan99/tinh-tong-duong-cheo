package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[][] matrix= new int[3][3];
        Scanner scanner=new Scanner(System.in);

        for (int row=0;row<matrix.length;row++){
            for (int colum=0;colum<matrix[row].length;colum++){
                System.out.println("nhap phan tu hang "+row+" cot "+colum);
                matrix[row][colum]=scanner.nextInt();
            }
        }

	    int total=0;
	    for (int i=0;i<matrix.length;i++){
	        for (int j=0;j<matrix[i].length;j++){
	            if (i==j){
	                total+=matrix[i][j];
                }
            }
        }
        System.out.println("tong la: "+total);
    }
}
