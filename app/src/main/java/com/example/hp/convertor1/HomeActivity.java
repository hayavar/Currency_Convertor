package com.example.hp.convertor1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    public  void udinr1(View view){
        EditText e1=(EditText)findViewById(R.id.usentry);
        double eamount=Double.parseDouble(e1.getText().toString());

        double inamt=eamount*64.82;
        String in1=String.format("%.2f",inamt);

        TextView t1=(TextView)findViewById(R.id.ustxt);
        Toast.makeText(HomeActivity.this,"CONVERTED",Toast.LENGTH_SHORT).show();
        t1.append(String.valueOf(in1));


    }
    public void tousd(View view){
        EditText e1=(EditText)findViewById(R.id.iusentry);
        double pamount=Double.parseDouble(e1.getText().toString());

        double inamt=pamount/64.82;
        String in=String.format("%.2f",inamt);

        TextView t1=(TextView)findViewById(R.id.iustxt);
        Toast.makeText(HomeActivity.this,"CONVERTED",Toast.LENGTH_SHORT).show();
        t1.append(String.valueOf(in));

    }
    public void udres(View view){
        EditText dollar=(EditText)findViewById(R.id.usentry);
        dollar.setText(" ");
        TextView txt=(TextView) findViewById(R.id.ustxt);
        txt.setText(" ");

    }
    public void inrusd(View view){
        EditText dollar=(EditText)findViewById(R.id.iusentry);
        dollar.setText(" ");
        TextView txt=(TextView) findViewById(R.id.iustxt);
        txt.setText(" ");

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
