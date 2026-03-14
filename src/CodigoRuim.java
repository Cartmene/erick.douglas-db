/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigo.ruim;

import java.util.Scanner;

public class CodigoRuim {
    public static void main(String[] args) {

        double a = 0;
        double b = 0;
        
        Scanner sc1 = new Scanner (System.in);
        
        System.out.println("Coloque o primeiro numero: ");
        
        a = sc1.nextInt();
        
                System.out.println("Coloque o segundo numero: ");
        
        b = sc1.nextInt();
        
                System.out.print("Coloque alguma das seguintes operações: \n soma \n subtração \n divisão \n multiplicação \n ");
        
        String operacao = sc1.next();
                  
        if (operacao . equals("soma")) {  
             System.out.println("A soma desses numeros é: " + (a + b));  }
             
        else if (operacao . equals("subtração")) {  
             System.out.println("A subtração desses numeros é: " + (a - b));  }
             
             else if (operacao . equals("divisão")) {  
             System.out.println("A divisão desses numeros é: " + (a / b));  }
             
             else if (operacao . equals("multiplicação")) {  
             System.out.println("A multiplicação desses numeros é: " + (a * b));  }
        
         else {  
             System.out.println("Escreve direito");   }
        
        
        
    }
    
}
