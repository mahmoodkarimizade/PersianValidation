package galaxycell.ir.persianvalidation;

/**
 * Created by Admin on 05/04/2018.
 */
public class ValidIRCardBank
{
    private int sum;

    public boolean IsValidIRCardBank(String cardNumber)
    {
        boolean flag=false;
        sum=0;

        if (!(cardNumber.isEmpty() || cardNumber.length()!=16))
        {
            for (int i=0;i<16;i++)
            {
                if ((i+1)%2!=0)
                {
                    int x= Character.getNumericValue(cardNumber.charAt(i));
                    if(x*2>9)
                    {
                        sum+=((x*2)-9);
                    }
                    else
                    {
                        sum+=x*2;
                    }

                }
                else
                {
                    int x= Character.getNumericValue(cardNumber.charAt(i));
                    sum+=x;
                }
            }

            if ((sum%10)==0)
            {
                flag = true;
            }
            else
            {
                flag = false;
            }
        }
        else
        {
            flag= false;
        }

        return flag;

    }
}
