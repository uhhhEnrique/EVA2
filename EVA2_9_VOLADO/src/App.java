import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double mone =  Math.random();
        int num, mon;
        String jug;
        Scanner read = new Scanner(System.in);
        System.out.println("cara = 1 o cruz = 2");
        num = read.nextInt();
        if(num <= 1)
            jug = "cara";
        else
            jug = "cruz";
        if(mone > 0.5) {
            System.out.println("tu elegiste"+ jug+"la moneda cayo cara");
            mon = + 1;
        }
        else{
            System.out.println("tu eligiste"+jug+"la moneda cayo cruz");
            mon = 0;
        }
        if (num == mon)
            System.out.println("ganaste");
        else
            System.out.println("perdiste");
    }
}
