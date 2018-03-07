package com.example.hp.convertor1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EuroActivity extends AppCompatActivity {

    public  void toinr(View view){
        EditText e1=(EditText)findViewById(R.id.euroentery);
        double eamount=Double.parseDouble(e1.getText().toString());

        double inamt=eamount*80.49;
        String in=String.format("%.2f",inamt);

        TextView t1=(TextView)findViewById(R.id.inrdisp);
        Toast.makeText(EuroActivity.this,"CONVERTED",Toast.LENGTH_SHORT).show();
        t1.append(String.valueOf(in));


    }
    public void toeurofrominr(View view){
        EditText e1=(EditText)findViewById(R.id.toeurofrominr);
        double pamount=Double.parseDouble(e1.getText().toString());

        double inamt=pamount/80.49;
        String in=String.format("%.2f",inamt);

        TextView t1=(TextView)findViewById(R.id.eurodisp);
        Toast.makeText(EuroActivity.this,"CONVERTED",Toast.LENGTH_SHORT).show();
        t1.append(String.valueOf(in));

    }
    public void ereset1(View view){
        EditText dollar=(EditText)findViewById(R.id.euroentery);
        dollar.setText(" ");
        TextView txt=(TextView) findViewById(R.id.inrdisp);
        txt.setText(" ");

    }
    public void ereset2(View view){
        EditText dollar=(EditText)findViewById(R.id.toeurofrominr);
        dollar.setText(" ");
        TextView txt=(TextView) findViewById(R.id.eurodisp);
        txt.setText(" ");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_euro);
    }
}
