package mx.utng;

import java.util.Scanner;

public class meses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Teclea el mes");
        String mesActual = scanner.nextLine().toLowerCase(); {
            scanner.close();
            switch (mesActual) {
            case "enero":
                System.out.print("febrero ,");
            case "febrero":
                System.out.print("marzo ,");  
            case "marzo":
                System.out.print("abril ,");
            case "abril":
                System.out.print("mayo ,");
            case "mayo":
                System.out.print("junio ,");
            case "junio":
                System.out.print("julio ,");  
            case "julio":
                System.out.print("agosto ,");
            case "agosto":
                System.out.print("septiembre ,");
            case "septiembre ":
                System.out.print("octubre ,");
            case "octubre":
                System.out.print("noviembre  ,");
            case "noviembre":
                System.out.print("diciembre ,");
            
                
            default:
                break;
        }
    }

}
}
