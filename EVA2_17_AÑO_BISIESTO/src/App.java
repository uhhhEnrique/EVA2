public class App {
    public static void main(String[] args) throws Exception {
    
        int año;
        double resu;
        Scanner ver = new Scanner(System.in);
        System.out.println("introdusca el año que desae evaluar: " );
        año = ver.nextInt();
        resu = año;
        
        if(resu % 400 == 0)
            System.out.println("Son bisiesto");
        else if(resu % 4 == 0 && resu %100 != 0)
            System.out.println("son bisiesto");
        else
            System.out.println("no es bisiesto");
        
    }
}
}
