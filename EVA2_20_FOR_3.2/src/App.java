import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int numero = read.nextInt();
         if (numero <= 0) {
            System.out.println("Debe ingresar un número entero positivo.");
            return; 
        }   
        int sumatoria = 0;
        for (int i = 1; i <= numero; i++) {
            sumatoria += i;
        }
        System.out.println("La sumatoria de los números desde 1 hasta " + numero + " es: " + sumatoria);

    }
}
