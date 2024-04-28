public class App {
    public static void main(String[] args) throws Exception {
        // numero aleatorio en java:
        double moneda;
        moneda = Math.random();
        System.out.println("El valor de la moneda = " + moneda); 
        if (moneda > 0.5){
            System.out.println("CARA");
        }else
        System.out.println("CRUZ");



    }
}
