package LuhnCheck;

public class LuhnChecker {

    public String CardResult(long creditCardNumber) {

        /*
          Turn the number into a string and create an array of integers
          The string can be used to fill the array with a loop
          Last digit will need to be set aside as a check digit
         */

        String ccString = Long.toString(creditCardNumber);
        int[] ccArray = new int[ccString.length() - 1];

        for (int i = 0; i < ccString.length() - 1; i++)
        {
            ccArray[i] = ccString.charAt(i) - '0';
        }

        int checkDigit = ccString.charAt(ccString.length() - 1) - '0';

         /*
          Invert the digits and multiply every other value by 2 (starting with first)
          Subtract number 10 or greater by 9
          Sum total and find modulo of 10, adding check digit should equal 10
         */

        for (int i = ccArray.length - 1; i > -1; i = i - 2)
        {
            ccArray[i] = ccArray[i] * 2;
        }

        int sum = 0;

        for (int i = 0; i < ccArray.length; i++)
        {
            int temp = ccArray[i];

            if(temp > 9) {
                temp = temp - 9;
            }

            sum = sum + temp;

        }


        if ((sum % 10) + checkDigit == 10) {

            return "This card appears valid";

        }else{

            return "This card is not valid";

        }

    }


}