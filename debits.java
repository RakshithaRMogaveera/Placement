public class debits {
    public static void main(String[] args) {
        int[] transaction = { 900, 1500, 600, 1200, 400 };
        int debit = 0;
        int size= transaction.length;
        int j=0;
        for (int i = 0; i < size; i++) {
            if ( debit>transaction[i] ) {
                j=j+1;
            }
            debit=transaction[i];
        }
        System.out.println("Number of debit transactions: " + j);

    }
}