package pucrs.qp.triangle;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 /**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
    final static int carLiters = 12;
    
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Type the spent time(hours): ");
        int spentTime = scanner.nextInt();
        
        System.out.println("Type the avarage speed(km/h): ");
        int avarageSpeed = scanner.nextInt();
        
        double result = calculateFuel(spentTime, avarageSpeed);
        result = Math.floor(result * 1000) / 1000;
        System.out.println("Fuel necessary is: " + result);
        
    }
    
    public static double calculateFuel(int spentTime, int avarageSpeed){
        double distance = avarageSpeed * spentTime;
        double result = distance/carLiters;
        return result;
    }
 
}

