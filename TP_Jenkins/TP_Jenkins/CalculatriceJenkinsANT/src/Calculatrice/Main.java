/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculatrice;

/**
 *
 * @author ES52281931
 */
public class Main {
    public static void main(String[] args){ 
        CalculatriceJenkins c = new CalculatriceJenkins();
        int a = 10;
        int b = 5;
        System.out.println(c.addition(a,b));
        System.out.println(c.soustraction(a,b));
        System.out.println(c.multiplication(a,b));
        System.out.println(c.division(a,b));
}
}
