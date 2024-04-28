public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            int mod = i % 2;
            if(mod == 1)
                continue;
            
            System.out.println(i);
        }
        System.out.println("BREAK:>>>>>>>>>>>>>");
        
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if(i == 50)
                break;
    }
}
}
