/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ponus;
import java.util.Scanner;
  
/**
 *
 * @author boabd
 */
public class Ponus {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        s.useLocale(Locale.US);
        System.out.println("Hello World!");
        double [][]grid=new double [3][4];
        for (int row=0; row<grid.length; row++) {
    for (int col=0; col<grid[row].length; col++) {
         grid[row][col]= sc.nextDouble();
}
         }

        for (int col=0;col<4;col++){
            double sum =sumColumn(grid,col);
            System.out.println("sum of the elements at column"+col+"is"+sum);

        }
        
    }
    
    public static double sumColumn(double[][] m, int columnIndex){
        double sum=0;
                for (int row=0; row<m.length; row++) {
                    sum=sum+m[row][columnIndex];
                }
       return sum;
    }

    
}
