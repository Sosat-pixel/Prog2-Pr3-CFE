import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese números");
        int num = leer.nextInt();
        int resultado = 1;
        while(num != 0){
            num = leer.nextInt();
            resultado = resultado + num;
        }
        System.out.println("Resultado es: "+ resultado);

    }
}
