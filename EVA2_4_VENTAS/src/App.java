import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        int piezas,calSaldo;
        System.out.println("¿cuantas piesas quieres comprar?");
        piezas = read.nextInt();
        if(piezas > 1000)
            calSaldo = piezas * 500;
        else
            calSaldo = piezas * 800;
        System.out.println("el saldo es "+ calSaldo);
    }
}
