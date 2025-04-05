import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);
        int resultado=1;
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        for(int i=1;i<=num;i++){
            resultado=resultado*i;
            System.out.println(resultado);
        }

    }
}





