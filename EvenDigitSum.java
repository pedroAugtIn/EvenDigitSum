public class EvenDigitSum {

    public static void main (String[] args){
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int evenSum = 0;
        int lastNumber = number % 10;

        if(number > 0){
            if(lastNumber % 2 == 0){
                evenSum += lastNumber;
            }

            while (number > 0){
                number = number / 10;
                if(number >= 10 && number % 2 == 0){
                    evenSum += number % 10;
                } else if(number % 2 == 0){
                    evenSum += number;
                }
            }
        } else {
            return -1;
        }

        return evenSum;
    }
}
