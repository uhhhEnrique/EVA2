public class App {
    public static void main(String[] args) throws Exception {
        double moneda;
          int adivinar;
        Scanner captu = new Scanner (System.in);
        System.out.println("cara(0) o cruz (1)?");
        adivinar = captu.nextInt();
        
        moneda = Math.random();
        System.out.println("el valor de la moneda = " + moneda);
        
        // 0.5 es la mitad del rango, > cara, menor es cruz 
        if(moneda > 0.5 && adivinar == 0)
            System.out.println("adivinaste, es cara!!");
        else
            if(moneda <= 0.5 && adivinar == 1)
                System.out.println("adivinaste, es cruz!!");
            else 
                System.out.println("perdiste");
    }
}
