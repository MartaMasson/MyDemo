public class MyDemoApplication {

    public static void main(String[] args) {
        int iFatorial = 5;
        System.out.println("Let´s calculate the fatorial of " + iFatorial + "!");
        Fatorial fatorial = new Fatorial();
        System.out.println("\n Final Result of fatorial " + iFatorial + ": " + fatorial.calculate(iFatorial));
    }
}