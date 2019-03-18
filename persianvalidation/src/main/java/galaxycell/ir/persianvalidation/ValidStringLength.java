package galaxycell.ir.persianvalidation;

/**
 * Created by MrRadio on 11/5/2018.
 */

public class ValidStringLength {

    public boolean isValidLength(String string, int min)
    {
        if (string.length()<min)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
