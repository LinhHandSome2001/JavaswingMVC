/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong1.donglenh;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author LENOVO
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
        String input ="11-04-2001";
        Date ngaysinh = df.parse(input);
        Person a =new Person("Nguyen Van A" , 1,ngaysinh );
        
        System.out.println("Hoten: " +a.getHoten() + 
                            "\n Gioi tinh: " + a.getGioitinh() +
                            "\n Ngay sinh: " + df.format(a.getNgaysinh()));
                            
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("12-02-2001"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println("Ho ten: " + sinhvien.getHoten() +
                            "\n Gioi tinh: " +sinhvien.getGioitinh()
                            +"\n Ngay sinh: " +sinhvien.getNgaysinh()
                            + "\n Truong hoc: " +sinhvien.getTruonghoc());
        
        Worker cty = new Worker();
        cty.setHoten("Ngyuen Thi Hoa");
        cty.setGioitinh(0);
        cty.setNgaysinh(df.parse("02-09-1999"));
        cty.setCty("IBM");
        System.out.println("Ho ten: "+cty.getHoten()+
                            "\n Gioi tinh: "+cty.getGioitinh()+
                            "\n Ngay sinh: " +df.format(cty.getNgaysinh())+
                            "\n Cong ty: " +cty.getCty());
    }
    
}