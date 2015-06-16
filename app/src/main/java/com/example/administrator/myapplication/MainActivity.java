package com.example.administrator.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;


public class MainActivity extends ActionBarActivity {

    private Button btnCaculteGT, btnCaculteSF, btnClear;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tvResult;
    private EditText et1, et2, et3, et4, et5, et6;
    private double dt1;
    private double dt2;
    private double dt3, dtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tvResult = (TextView) findViewById(R.id.tvResult);
        et1 = (EditText) findViewById(R.id.etDateOne);
        et2 = (EditText) findViewById(R.id.etDateTwo);
        et3 = (EditText) findViewById(R.id.etDateThree);
        et4 = (EditText) findViewById(R.id.etDateFour);
        et5 = (EditText) findViewById(R.id.etDateFive);
        et6 = (EditText) findViewById(R.id.etDateSix);



        findViewById(R.id.btnClear).setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                et3.setText("");
                et4.setText("");
                et5.setText("");
                et6.setText("");

                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                tv5.setText("");
                tv6.setText("");
                tvResult.setText("");
            }
        });

        findViewById(R.id.btnCalulateGT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    dt1 = Double.parseDouble(et2.getText().toString()) - Double.parseDouble(et1.getText().toString());
                    dt2 = Double.parseDouble(et3.getText().toString()) - Double.parseDouble(et1.getText().toString());
                    dt3 = dt2 / dt1;
                    DecimalFormat df = new DecimalFormat("0.0000");
                    dtResult = dt3;
                    tv1.setText(df.format(dt1));
                    tv2.setText(df.format(dt2));
                    tv3.setText(df.format(dt3));


                    dt1 = Double.parseDouble(et5.getText().toString()) - Double.parseDouble(et4.getText().toString());
                    dt2 = Double.parseDouble(et6.getText().toString()) - Double.parseDouble(et4.getText().toString());
                    dt3 = dt2 / dt1;
                    dtResult += dt3;
                    tv4.setText(df.format(dt1));
                    tv5.setText(df.format(dt2));
                    tv6.setText(df.format(dt3));
                    tvResult.setText(df.format(dtResult/2));

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
        findViewById(R.id.btnCalulateSF).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    dt1 = Double.parseDouble(et2.getText().toString()) - Double.parseDouble(et1.getText().toString());
                    dt2 = Double.parseDouble(et2.getText().toString()) - Double.parseDouble(et3.getText().toString());
                    dt3 = dt2 / dt1;
                    DecimalFormat df = new DecimalFormat("0.0000");
                    dtResult = dt3;
                    tv1.setText(df.format(dt1));
                    tv2.setText(df.format(dt2));
                    tv3.setText(df.format(dt3));


                    dt1 = Double.parseDouble(et5.getText().toString()) - Double.parseDouble(et4.getText().toString());
                    dt2 = Double.parseDouble(et5.getText().toString()) - Double.parseDouble(et6.getText().toString());
                    dt3 = dt2 / dt1;
                    dtResult += dt3;
                    tv4.setText(df.format(dt1));
                    tv5.setText(df.format(dt2));
                    tv6.setText(df.format(dt3));
                    tvResult.setText(df.format(dtResult/2));

                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, e.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
