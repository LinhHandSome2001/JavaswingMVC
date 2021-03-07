/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong1.donglenh;

/**
 *
 * @author LENOVO
 */
public class Pheptoan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Các phép toán với số nguyên
        
        int a = 17, b =4 , c;
        c = a + b;
        System.out.println("Cong: " + a + " + " + b + " = " + c);
        c = b - a;
        System.out.println("Tru: " + b + " - " + a+ " = " + c);
        c = a * b;
        System.out.println("Nhan: " + a + " * " + b + " = " + c);
        c = b / a;
        System.out.println("Chia lay phan nguyen: " + b + " / " + a + " = " + c);
        c = b % a;
        System.out.println("Chia lay phan du: " + b + " % " + a + " = " + c);
        
        // Các phép toán với số thực
        
        double x=14.3 , y=3.56 ,z;
        z = x + y;
        System.out.println("Cong: " + x + " + " + y + " = " + z);
        z = y - x;
        System.out.println("Tru: " + y + " - " + x+ " = " + z);
        z = x * y;
        System.out.println("Nhan: " + x + " * " + y + " = " +z);
        z = y / x;
        System.out.println("Chia lay phan nguyen: " + y + " / " + x + " = " + z);
        
        // Các phép toán kiểu logic
        
        boolean flag1 = true , flag2 = false , flag3 = true;
        System.out.println("Phep AND: " + (flag1 && flag2));
        System.out.println("Phep OR: " + (flag1 || flag2));
        System.out.println("Phep NOT: " + (!flag1));
        System.out.println("Phep XOR: " + (flag1 ^ flag3));
                
        //Một số phép toán trên chuỗi        
        
        String s1 = "Ha Tinh ";
        String s2 = "university";
        
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s1.toLowerCase().contains(s2));
        s1+= " " + s2;
        System.out.println(s1);
    }
    
}