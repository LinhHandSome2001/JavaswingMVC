/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong1.donglenh;

import java.util.Scanner;

/**
 *
 * @author DAI
 */
public class XuatNhap {

    public static void main(String[] args) {
        boolean flag = true;
        int a =15;
        byte b = 2;
        double c =12.6;
        float d =4.5f;
        String s = "Hello";
        char ch = 'A';
        Scanner  sc = new Scanner(System.in);
        System.out.print("Hay nhap ho ten: ");
        String hoten = sc.nextLine();
        System.out.println("ho ten la: " +hoten );
        System.out.println("-----------------------------");
        
        System.out.print("Hay nhap vao mot so nguyen: ");
        String input = sc.nextLine();
        a = new Integer(input).intValue();
        System.out.println("So nguyen la: "+a);
        System.out.println("-----------------------------");
        
         
    }
    
}
