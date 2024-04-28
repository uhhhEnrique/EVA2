import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String Dia;
       Scanner captu = new Scanner(System.in);
       System.out.println("introduce el dia (lune, martes, etc");
       Dia = captu.nextLine();
       
       if(Dia.equals("Domingo"))
           System.out.println("1");
       else if (Dia.equals("lunes"))
           System.out.println("2");
       else if (Dia.equals("martes"))
           System.out.println("3");
       else if (Dia.equals("miercoles"))
           System.out.println("4");
       else if (Dia.equals("jueves"))
           System.out.println("5");
       else if (Dia.equals("viernes"))
           System.out.println("6");
       else if (Dia.equals("sabado"))
           System.out.println("7");
    }
}
