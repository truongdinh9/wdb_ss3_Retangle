package com.codegym;

public class Retangle {
    public double width;
    public double height;
    public Retangle(){};
    public Retangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.height*this.width;
    }
    public double getPerimetter(){
        return (this.height+this.width)*2;
    }
    public String disPlay(){
        return "width ="+ this.width +" height ="+this.height;
    }
}
