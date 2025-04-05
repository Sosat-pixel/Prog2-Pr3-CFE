import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] arg){
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cuantos números desea sumar");
        int numaSumar = leer.nextInt();
        int contador = 1;
        int resultado = 0;

        while(contador <= numaSumar)
        {
            System.out.println("Ingrese números a sumar");
            int num = leer.nextInt();
            if(num >= 0)
            {
            resultado = resultado + num;
            contador++;
            }
        }
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
