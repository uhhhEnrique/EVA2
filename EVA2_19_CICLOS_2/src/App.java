import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int NumAlumn;
        Scanner read = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes tiene el grupo?");
        NumAlumn = read.nextInt();
        //Hay que capturar todas las calificaciones
        for (int i = 0; i <NumAlumn; i++){
            System.out.println("Caliicación: ");
            int califa = read.nextInt();
            
        }
    }
}
