package Exe;

import java.util.Scanner;

import Classes.Calculo;

public class CalcMedia {
    
    public static void main(String[] args) {
       
       //Instanciando a classe scanner
       Scanner scan = new Scanner(System.in);
       
       //Instanciando a classe calculo
       Calculo c1 = new Calculo();
       
       System.out.println("Digite a sua primeira nota: ");
       double x = scan.nextDouble();
       
       System.out.println("Digite a sua segunda nota: ");
       double y = scan.nextDouble();

       //Calculando media atraves do metodo calcularMedia    
       System.out.println("A média de suas notas são: " + c1.calcularMedia(x, y));
       
    }
}
