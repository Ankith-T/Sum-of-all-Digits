public class SummingDigits {
    public static void main(String[] args) throws Exception {
        System.out.println(sumDigits(1000));
    }
    public static int sumDigits(long n) {
        int firstDigit = 0;
        int digitCheck = (Long.toString(n)).length();
        for (int i = 0; i < digitCheck; i++ ){
        double powerOfI = Math.pow(10, i);
        int integerPowerOfI = (int)powerOfI;
        firstDigit += (n/integerPowerOfI) % 10;
        }
                return firstDigit;
        

    }
}
