public class Main {
    public static void main(String[] args) {
        notNull(9, 3);
    }

    public static void notNull (Integer numeratore, Integer denominatore) throws NullPointerException{
        try {
            if (denominatore != 0){
                if (numeratore != null && denominatore != null) {
                    System.out.println("risultato: " + numeratore / denominatore + 
                    "\nNessun valore null riscontrato!");
                }
            } else {
                throw new ArithmeticException("Non si può dividere per zero!");
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("Errore! Uno dei due valori è null.");
        }
    }
}
