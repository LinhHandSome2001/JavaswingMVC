/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong5.logic;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class FileAnDirectoryOperations {
    public FileAnDirectoryOperations(){
        }
    public File[] getDirectoryContent(String folder){
    File directory = new File(folder);
    if(directory.isFile())
        return null;
    File[] results = directory.listFiles();
    return results;
    }
    public String displayContent(File[] content){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < content.length; i++){
            sb.append(content[i].getPath()).append(File.separator).append(content[i].getName());
            sb.append("\n");
        }
        return sb.toString();
    }
    public File[] getSubDirectories(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i=0; i < content.length; i++){
            if(content[i].isDirectory()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    public File[] getFiles(File[] content){
        ArrayList<File> result = new ArrayList<>();
        for(int i=0; i < content.length; i++){
            if(content[i].isFile()){
                result.add(content[i]);
            }
        }
        File[] ketqua = new File[result.size()];
        return result.toArray(ketqua);
    }
    }

