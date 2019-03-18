package galaxycell.ir.persianvalidation;

import java.util.Arrays;

/**
 * Created by Admin on 17/02/2018.
 */
public class ValidIRNationalCode {

    public boolean IsValidIRNationalCode(String nationalCode)
    {
        if(!(nationalCode.isEmpty()||nationalCode.length()<10||nationalCode.length()>10))
        {
            String[] allDigitEqual  = {"0000000000","1111111111","2222222222","3333333333","4444444444","5555555555","6666666666","7777777777","8888888888","9999999999"};
            if(Arrays.asList(allDigitEqual).contains(nationalCode))
            {
                return false;
            }
            else
            {
                char[] chars=nationalCode.toCharArray();

                Character.getNumericValue(chars[0]);
                int num0 = Character.getNumericValue(chars[0])*10;
                int num2 = Character.getNumericValue(chars[1])*9;
                int num3 = Character.getNumericValue(chars[2])*8;
                int num4 = Character.getNumericValue(chars[3])*7;
                int num5 = Character.getNumericValue(chars[4])*6;
                int num6 = Character.getNumericValue(chars[5])*5;
                int num7 = Character.getNumericValue(chars[6])*4;
                int num8 = Character.getNumericValue(chars[7])*3;
                int num9 = Character.getNumericValue(chars[8])*2;
                int a = Character.getNumericValue(chars[9]);

                int b = (((((((num0 + num2) + num3) + num4) + num5) + num6) + num7) + num8) + num9;
                int c = b%11;

                return (((c < 2) && (a == c)) || ((c >= 2) && ((11 - c) == a)));
            }
        }
        else
        {
            return false;
        }


    }
}
