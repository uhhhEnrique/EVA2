public class App {
    public static void main(String[] args) throws Exception {
        boolean A, B;
        A = false;
        B = false;
        boolean resu;
        //OPERADORES AND -->
        resu = A && B;
        System.out.println("resu =" + resu);
        A = true;
        B = false;
        resu = A && B;
        System.out.println("resu=" + resu);
        A = true;
        B = true;
        resu = A && B;
        System.out.println("resu =" +resu);
        A = false;
        B = false;
        resu = A || B;
        System.out.println("resu(or)" + resu);
        A = true;
        B = false;
        resu = A || B;
        System.out.println("resu(or) =" + resu);
        A = true;
        B = true;
        resu = A || B;
        System.out.println("resu (or) = " + resu);
        //NEGACION --> !
        A = false;
        resu = !A;
        System.out.println("resu (!)" + resu);
    }
}
