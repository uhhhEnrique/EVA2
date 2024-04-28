public class App {
    public static void main(String[] args) throws Exception {
        //OPERADORES ARITMETICOS:
        //SUMA +, RESTA -, MULTIPLICACION *, DIVICION /
        int num1, num2;
        num1 = 5;
        num2 = 3;
        int suma = num1 + num2; //operador de suma +
        // si en el operador  + uno de los terminos  es 
        //una cadena,  todo se comvierte a cadena y se unen 
        // concatenacion: union de cadena de texto
        System.out.println("la suma es " + suma);
        boolean prueba = true;
        System.out.println("el valor de prueba es" + prueba);
        // MULTIPLICACION
        int multi;
        multi = num1 * num2;
        System.out.println("la multiplicacion es:" + multi);
        //DIVICION /
        int divi = 7/2;
        System.out.println("la divicion 7/2 es" + divi);
        double diviDouble = 7 / 2.0;
        System.out.println("la divicion (double) de 7 / 2.0 es " + diviDouble);
        //ACUMULADORES
        //SUMA=, RETA-=, MULTI*=, DIVI /=
        int sumatoria = 0;
        /* sumatoria = sumatoria +90;
        suamtoria = sumatoria +80;
        sumatoria = sumatoria +80;*/
        sumatoria += 90;//agrego 90 a sumatoria
        sumatoria += 80;//agrego 80 a sumatoria
        sumatoria += 80;//agrego 80 a sumatoria
        System.out.println("la sumatoria es:" + sumatoria);
        sumatoria -= 70;//le reste 70 a sumatoria
        //sumatoria = sumatoria - 70;
        System.out.println("la sumatoria es: "+ sumatoria);
        //
        int multiAcum = 1;
        multiAcum *= 100;
        System.out.println("multiacum = "+ multiAcum);
        multiAcum *= 5;
        System.out.println("multiacum ="+ multiAcum);
    }
}
