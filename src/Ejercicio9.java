//Usa un do while para pedir al usuario que escriba la contraseña
// Repita el ingreso hasta que coincida con la contraseña predefinida
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);
        String acceso = "admin";
        String pass;
        do {
            System.out.print("Ingrese una contraseña");
            pass = leer.nextLine();
        }while(pass .equals(acceso));

        System.out.println("Acceso exitoso");




    }
}
