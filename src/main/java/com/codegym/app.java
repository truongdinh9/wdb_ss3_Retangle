package com.codegym;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Retangle retangle2=new Retangle();
        Retangle retangle1=new Retangle(1,2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Retangle 2: ");
        System.out.println(" Enter witdth: ");
        retangle2.width=scanner.nextDouble();
        System.out.println("Enter height: ");
        retangle2.height=scanner.nextDouble();
        System.out.println("Retangle 1: "+retangle1.disPlay());
        System.out.println("Area of Retangle 1: "+retangle1.getArea());
        System.out.println("Perimetter of Retangle 1:"+retangle1.getPerimetter());
        System.out.println("Retangle 2: "+retangle2.disPlay());
        System.out.println("Area of Retangle 2: "+retangle2.getArea());
        System.out.println("Perimetter of Retangle 2:"+retangle2.getPerimetter());
    }
}
