/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong5.donglenh;

import java.io.File;
import lthdt.chuong5.logic.FileAnDirectoryOperations;

/**
 *
 * @author LENOVO
 */
public class testFileAndDirectory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileAnDirectoryOperations fo = new FileAnDirectoryOperations();
        File[] content = fo.getDirectoryContent("D:\\wordpress\\wp-admin\\css");
        File[] thumuc = fo.getSubDirectories(content);
        System.out.println("Danh sach cac thu muc con: ");
        System.out.println(fo.displayContent(thumuc));
        File[] taptin = fo.getFiles(content);
        System.out.println("Danh sach cac tap tin: ");
        System.out.println(fo.displayContent(taptin));
        
    }
    
}
