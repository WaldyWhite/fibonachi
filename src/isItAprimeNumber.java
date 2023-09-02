public class isItAprimeNumber {
    String isItAprimeNumber(int x) {
        int n = x;

        // Проверить, является ли заданное число простым.
        for (int i = 2; i < (n/ 2); i++) {
            if (n % i == 0) {
                return "No";
            }
        }
        return "Yes";
    }

}
