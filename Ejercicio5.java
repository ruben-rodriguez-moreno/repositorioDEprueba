
package ejerciciosif;

import java.util.Scanner;
public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
      
        int sustos = 0;
        int golosinas = 0;
        System.out.println("Cual es tu nombre?");
        nombre = teclado.next();
        System.out.println("Tu edad?");
        edad = teclado.nextInt();
        System.out.println("Tu altura en centimetros?");
        altura = teclado.nextInt();
        System.out.println("Truco o trato?");
        decision = teclado.next();
        
        
        if(decision.equals("truco") || decision.equals("Truco"))
        {
        sustos = nombre.length()/2;
            if(edad%2 == 0)
            {
            sustos = sustos+2;
            }
            if(altura>100)
            {
            sustos = sustos+3;
            }
            System.out.println("Tienes "+sustos+" BUUUH");
        }
        else if(decision.equals("trato") || decision.equals("Trato"))
        {
        golosinas = nombre.length()/1;
        
           if(edad<=10)
           { 
           if(edad%3 == 0)
           {
           golosinas = golosinas+1;
           }
           }
        if(altura>=50)
        {
        golosinas = golosinas+2;
        }
         if(altura>=100)
        {
        golosinas = golosinas+2;
        }
          if(altura>=150)
        {
        golosinas = golosinas+2;
        }
          System.out.println("Tienes "+golosinas+" DULCES");
        }
        
    }
    
}
