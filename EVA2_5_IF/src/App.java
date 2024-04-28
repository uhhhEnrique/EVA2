import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // CAPTURA TEMEPERATURA 
        int temp;
        Scanner captu = new Scanner(System.in);
        //CAPTURAR TEMPERATURA
        System.out.println("Temperatura (°C): ");
        temp = captu.nextInt();
        //VAMOS A EVALUAR 
        // SI LA TEMPERATURA ES MAYOR A 22°, SE ENCIENDE 
        //CLIMA 
        if(temp > 22)
            System.out.println("ENCENDER EL AIRE");
    }
}
