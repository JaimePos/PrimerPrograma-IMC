/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jposadasa.eg1.imc;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPJPosadasAEg1IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calculadora IMC");
        //1- declarar variables
        double w, l, imc;
        String eIMC;
        //2- declarar teclado
        Scanner teclado = new Scanner (System.in);
        //2.1- asignar valor a variables
        System.out.println("Introduce el peso (en kilogramos)");
        w=teclado.nextDouble();
        System.out.println("Introduce la altura (en metros)");
        l=teclado.nextDouble();
        //3- resolver el problema
        imc = w / Math.pow (l, 2);
        //3.1- Evaluar IMC
        if (imc>25){
            eIMC="Por encima del peso ideal";
        }
        else if (imc<19){
            eIMC="Por debajo de peso ideal";
        }
        else {
            eIMC="Peso ideal";
        }
        
        System.out.println("Peso = " + w + "kg");
        System.out.println("Estatura = " + l + "m");
        System.out.println("IMC = " + imc);
        System.out.println(eIMC);
        
        
    }
    
}
