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
public class Circle extends Shape{
    private int radius;
    private int x,y;

    public Circle() {
    }

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    Circle(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double calcPerimeter(){
        double result = 2*Math.PI*this.radius;
        return result;
    }
    
    @Override
    public double calcArea(){
        double result = 2*Math.PI*this.radius*this.radius;
        return result;
    }
    
    @Override
    public String toString() {
        String output = "Chu vi hinh tron la: " +calcPerimeter()+
                "\nDien tich hinh tron la: " +calcArea();
        return output;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}