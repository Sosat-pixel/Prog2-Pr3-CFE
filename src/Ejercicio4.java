import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);
        int num;
        do {
            System.out.println("Ingrese un número entre 1 y 5:");
            num = leer.nextInt();
        } while (num < 1 || num > 5);
    }
}
