import java.util.Arrays;

public class Main {
    public static int[] numbers = new int[30];

    public static void main(String[] args) {
        // code here...
        for ( int i = 0; i < numbers.length; i++) {
            if ( i == 0 || i == 1) {
                numbers[i] = 1;
            } else if (i == 2){
                numbers[i] = 2;
            } else {
                numbers[i] = numbers[i-1] + numbers[i-2];
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
