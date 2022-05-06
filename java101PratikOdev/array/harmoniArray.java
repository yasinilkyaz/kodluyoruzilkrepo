public class Main {
    static double avarageHarmonic(int[] array ) {
        double total = 0 ;
        int c = 0;
        for(int i : array) {
            total += ( 1.0 / i ) ;
            c++;
        }
        total = total/c;
        return total ;
    }
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Harmonic avarage of array is : " + avarageHarmonic(array1));
    }
}