package com.example.hp.convertor1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PoundActivity extends AppCompatActivity {
    public  void inr(View view){
        EditText e1=(EditText)findViewById(R.id.pdentry);

        double pamount=Double.parseDouble(e1.getText().toString());

        double inamt=pamount*90.03;
        String in=String.format("%.2f",inamt);

        TextView t1=(TextView)findViewById(R.id.ptxt);
        Toast.makeText(PoundActivity.this,"CONVERTED",Toast.LENGTH_SHORT).show();
        t1.append(String.valueOf(in));


    }
    public void pound(View view){
        EditText e1=(EditText)findViewById(R.id.ipdentry);
        double pamount=Double.parseDouble(e1.getText().toString());

        double inamt=pamount/90.03;
        String in=String.format("%.2f",inamt);

        TextView t1=(TextView)findViewById(R.id.iptxt);
        Toast.makeText(PoundActivity.this,"CONVERTED",Toast.LENGTH_SHORT).show();
        t1.append(String.valueOf(in));

    }
    public void res1(View view){
        EditText dollar=(EditText)findViewById(R.id.pdentry);
        dollar.setText(" ");
        TextView txt=(TextView) findViewById(R.id.ptxt);
        txt.setText(" ");

    }
    public void res2(View view){
        EditText dollar=(EditText)findViewById(R.id.ipdentry);
        dollar.setText(" ");
        TextView txt=(TextView) findViewById(R.id.iptxt);
        txt.setText(" ");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound);
    }
}
