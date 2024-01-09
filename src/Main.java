public class Main {
    public static void main(String[] args) {

        System.out.println("isPalindrome:");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("isPerfectNumber :");
        System.out.println(isPerfectNumber (6));
        System.out.println(isPerfectNumber (28));
        System.out.println(isPerfectNumber (5));
        System.out.println(isPerfectNumber (-1));

        System.out.println("numberToWords  :");
        System.out.println(numberToWords  (123));
        System.out.println(numberToWords  (1010));
        System.out.println(numberToWords  (-12));
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        char[]digits=String.valueOf(num).toCharArray();
        String reversed="";
        for (int i = digits.length-1;i>=0;i--) {
           reversed+=digits[i];
            }
            return reversed.equals(String.valueOf(num));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 0) {
            return false;
        }

        int totalDivisor = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                totalDivisor += i;
            }
        }
            return totalDivisor == number;
        }


    public static String numberToWords (int num){
        if (num<0) return "Invalid Value";


        char [] numerics= Integer.toString(num).toCharArray();

        String number="";
        for(char numeric:numerics){
            switch (numeric){
                case '0':
                    number+="Zero ";
                    break;
                case '1':
                    number+="One ";
                    break;
                case '2':
                    number+="Two ";
                    break;
                case '3':
                    number+="Three ";
                    break; case '4':
                    number+="Four ";
                    break; case '5':
                    number+="Five ";
                    break; case '6':
                    number+="Six ";
                    break;
                case '7':
                    number+="Seven ";
                    break;
                case '8':
                    number+="Eight ";
                    break;
                case '9':
                    number+="Nine ";
                    break;

            }
        }
        return number.trim();

    }
}