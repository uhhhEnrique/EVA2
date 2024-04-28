import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num, divi, resi;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce un numero entero");
        num = captu.nextInt();
        divi = num / 2;
        System.out.println("Division entera de " + num +" / 2 = " + divi);
       resi = num % 2;
        System.out.println("El residuo de " + num +" % 2 = " + resi);
            // NUMERO PAR O IMPAR
            if(resi == 1)
            System.out.println(num + " es impar");
            else 
            System.out.println(num + " es par"); 

    }
}
