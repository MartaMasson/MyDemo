public class Fatorial {

    public int calculate(int number) {
        if (number == 0) 
            return 1;
        else { 
            System.out.println ("Calculating fatorial of " + number + "!");
            int fatorial = number * calculate(number - 1);
            System.out.println ("\nFatorial result of " + number + ": " + fatorial + "!");
            return (fatorial);
        }
    }
}
