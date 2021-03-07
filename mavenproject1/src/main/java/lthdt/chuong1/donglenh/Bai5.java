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
public class Bai5 {
    
    public static void main(String[] args) throws ParseException {
        //chuyen kieu du thieu thanh String
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH);
        Date currentDate = new Date();
        String  output = df.format(currentDate);
        System.out.println(output);
        
        //chuyen kieu du lieu String thanh Date
        
        String input = "07-03-2021";
        Date ngay = df.parse(input);
        System.out.println(ngay);
        System.out.println(df.format(ngay));
        
    }
    
}