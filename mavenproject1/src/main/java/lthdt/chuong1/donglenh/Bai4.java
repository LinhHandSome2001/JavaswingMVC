/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong1.donglenh;

import java.text.SimpleDateFormat;
/**
 *
 * @author LENOVO
 */
public class Bai4 {

    public static void main(String[] args) {
        Shape htron = new Circle(5,1,2);
        System.out.println("Chu vi hinh tron la: " + htron.calcPerimeter());
        System.out.println("Dien tich hinh tron la: " + htron.calcArea());
        System.out.println(htron);
        
        System.out.println("----------------------------------");
         
        Shape  hcn = new Rectangle(3,15,8,5);
        System.out.println("Chu vi hinh chu nhat la: " + hcn.calcPerimeter());
        System.out.println("Dien tich hinh chu nhat la: " + hcn.calcArea());
        System.out.println(hcn);
    }    
}