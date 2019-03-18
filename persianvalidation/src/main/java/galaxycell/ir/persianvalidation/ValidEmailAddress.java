package galaxycell.ir.persianvalidation;

import android.text.TextUtils;
import android.util.Patterns;

/**
 * Created by Admin on 13/02/2018.
 */
public class ValidEmailAddress
{
    public boolean isValidEmailAddress(CharSequence email)
    {
        if (!TextUtils.isEmpty(email))
        {
            return Patterns.EMAIL_ADDRESS.matcher(email).matches();
        }
        return false;
    }
}
