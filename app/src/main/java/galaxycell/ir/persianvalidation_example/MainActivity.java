package galaxycell.ir.persianvalidation_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import galaxycell.ir.persianvalidation.ValidEmailAddress;
import galaxycell.ir.persianvalidation.ValidIRCardBank;
import galaxycell.ir.persianvalidation.ValidIRNationalCode;
import galaxycell.ir.persianvalidation.ValidPhoneNumber;
import galaxycell.ir.persianvalidation.ValidStringLength;
import galaxycell.ir.persianvalidation.ValidWebUrl;

public class MainActivity extends AppCompatActivity {

    private EditText e1,e2,e3,e4,e5,e6;
    private Button b1,b2,b3,b4,b5,b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Edit Text
        e1=(EditText)findViewById(R.id.main_editText1);
        e2=(EditText)findViewById(R.id.main_editText2);
        e3=(EditText)findViewById(R.id.main_editText3);
        e4=(EditText)findViewById(R.id.main_editText4);
        e5=(EditText)findViewById(R.id.main_editText5);
        e6=(EditText)findViewById(R.id.main_editText6);

        //Button
        b1=(Button)findViewById(R.id.main_button1);
        b2=(Button)findViewById(R.id.main_button2);
        b3=(Button)findViewById(R.id.main_button3);
        b4=(Button)findViewById(R.id.main_button4);
        b5=(Button)findViewById(R.id.main_button5);
        b6=(Button)findViewById(R.id.main_button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (new ValidIRCardBank().IsValidIRCardBank(e1.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Valid",Toast.LENGTH_LONG).show();
                }
                else
                {
                    e1.setError("Not valid");
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (new ValidEmailAddress().isValidEmailAddress(e2.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Valid",Toast.LENGTH_LONG).show();
                }
                else
                {
                    e2.setError("Not valid");
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (new ValidIRNationalCode().IsValidIRNationalCode(e3.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Valid",Toast.LENGTH_LONG).show();
                }
                else
                {
                    e3.setError("Not valid");
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (new ValidPhoneNumber().isValidPhoneNumber(e4.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Valid",Toast.LENGTH_LONG).show();
                }
                else
                {
                    e4.setError("Not valid");
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (new ValidStringLength().isValidLength(e5.getText().toString(),10))
                {
                    Toast.makeText(getApplicationContext(),"Valid",Toast.LENGTH_LONG).show();
                }
                else
                {
                    e5.setError("Not valid");
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (new ValidWebUrl().isValidUrl(e6.getText().toString()))
                {
                    Toast.makeText(getApplicationContext(),"Valid",Toast.LENGTH_LONG).show();
                }
                else
                {
                    e6.setError("Not valid");
                }
            }
        });

    }
}
