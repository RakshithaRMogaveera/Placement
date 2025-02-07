public class secondMini {
    public static void main(String[] args) {
        int[] a = { 120, 92, 45, 95, 25, 568 };
        int size = a.length;
        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;
        int second=0;
        for (int i = 0; i < size; i++)
            if (a[i] < min) {
                min = a[i];
            }
        System.out.println("First minimum is " + min);
        for (int i = 0; i < size; i++) {
            if (sec_min > min && sec_min > a[i] && a[i]!= min) {
                sec_min = a[i];
            }
                second=sec_min;
        
            }
            System.out.println("second minimum is " + second);
        }
    }
