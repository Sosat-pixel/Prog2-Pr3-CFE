import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número para multiplicar");
        int num = leer.nextInt();

        for (int i = 1; i <= 10; i++){
            int  resultado = num * i;
            System.out.println(resultado);
        }



    }
}
