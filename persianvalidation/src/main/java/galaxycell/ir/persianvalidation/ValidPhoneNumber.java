package galaxycell.ir.persianvalidation;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by Admin on 14/01/2018.
 */
public class ValidPhoneNumber
{

    public boolean isValidPhoneNumber(CharSequence phoneNumber)
    {
        if (!TextUtils.isEmpty(phoneNumber))
        {
            if(phoneNumber.length()<11 || phoneNumber.length()>11)
            {
                return false;
            }
            return Patterns.PHONE.matcher(phoneNumber).matches();
        }
        return false;
    }

}
