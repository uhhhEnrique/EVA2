import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int nume = 5;//numero que tine que adivinira  ( entre 1 y 10)
        int valor = 0; //valor para almacenar lo que capture el usuario
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("¿cual es el numero? (entre 1 y 10):");
            valor = captu.nextInt();
        }while(nume != valor);
        System.out.println("adivinaste!!");
    }
}
