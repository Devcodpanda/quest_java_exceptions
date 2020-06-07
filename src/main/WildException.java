public class WildException {

    public static void main(String[] args) {
        try {
            int i = 3;
            int j = 0;
            System.out.println("résultat = " + (i / j));
        } catch (ArithmeticException e) {
            System.err.println("Division par zero interdite !!");
        } finally {
            System.out.println("action faite systématiquement");
        }
    }
}
