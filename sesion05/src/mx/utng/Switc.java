package mx.utng;

import java.util.Scanner;

public class Switc {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea tu calificacion");
        int calif = scanner.nextInt();
        
        if(calif == 10){

        }

        switch (calif) {
            case 10:
                System.out.println("Exelente");
                break;
                
            case 9:
                System.out.println("Muy bien");
                break;    
        

            case 8:
                  System.out.println("Muy bien");
                break; 

            case 7:
                System.out.println("Bien hecho");
                 break; 
                
            case 6:
                System.out.println("Pasaste");
         break;

           case 5:
                System.out.println("Mejor vuelve a intentar");
         break; 
            default:  
            System.out.println("Calificaion invalida");
            break; 
        }
        scanner.close();

    }
    
}
