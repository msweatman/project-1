package com.example.morgansweatman.calculatortest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    Button btnZero , btnOne , btnTwo , btnThree , btnFour , btnFive , btnSix ,
            btnSeven , btnEight , btnNine , btnPlus , btnSubtract , btnDivide ,
            btnMultiply , btnSqrt, btnPosNeg , btnPercent , btnClr, btnEquals, btnDecimal;

   // StringBuilder to append characters to which will be set to our TextView t
    private StringBuilder sb;
    private TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnSqrt = (Button) findViewById(R.id.btnSqrt);
        btnPosNeg = (Button) findViewById(R.id.btnPosNeg);
        btnPercent = (Button) findViewById(R.id.btnPercent);
        btnClr = (Button) findViewById(R.id.btnClr);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);

        t = findViewById(R.id.outputField);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("0");
                t.setText(sb);
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("1");
                t.setText(sb);
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("2");
                t.setText(sb);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("3");
                t.setText(sb);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("4");
                t.setText(sb);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("0");
                t.setText(sb);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("6");
                t.setText(sb);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("7");
                t.setText(sb);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("8");
                t.setText(sb);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("9");
                t.setText(sb);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(" ");
                sb.append("+");
                sb.append(" ");
                t.setText(sb);
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(" ");
                sb.append("-");
                sb.append(" ");
                t.setText(sb);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(" ");
                sb.append(getString(R.string.strDivide));
                sb.append(" ");
                t.setText(sb);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(" ");
                sb.append(getString(R.string.strMultiply));
                sb.append(" ");
                t.setText(sb);
            }
        });
        btnSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(" ");
                sb.append(getString(R.string.strSqrt));
                sb.append(" ");
                t.setText(sb);
            }
        });
        btnPosNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(" ");
                sb.append(getString(R.string.strPosNeg));
                sb.append(" ");
                t.setText(sb);
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(" ");
                sb.append(getString(R.string.strPercent));
                sb.append(" ");
                t.setText(sb);
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setText("");
                sb.delete(0, sb.length());
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result="";
                // BigDecimal d; want this
                Double d;
                String input = t.getText().toString();
                String[] vals = input.split(" ");

                if(vals.length==3){
                    Double num1 = Double.valueOf(vals[0]);
                    String op = vals[1];
                    Double num2 = Double.valueOf(vals[2]);

                    if(op.equals(getString(R.string.strMultiply))){
                        d = num1*num2;
                        result = String.valueOf(d);
                    }
                    else if(op.equals(getString(R.string.strDivide))){
                        d = num1/num2;
                        result = String.valueOf(d);
                    }
                    else if(op.equals(getString(R.string.strPlus))){
                        d = num1+num2;
                        result = String.valueOf(d);
                    }
                    else if(op.equals(getString(R.string.strSubtract))){
                        d = num1-num2;
                        result = String.valueOf(d);
                    }


                    t.setText(result);
                    sb.delete(0, sb.length());
                    sb.append(result);
                }

                else if(vals.length==2){
                    String op = vals[0];
                    Double num1 = Double.valueOf(vals[1]);

                    if(op.equals(getString(R.string.strSqrt))){
                        d = Math.sqrt(num1);
                        result = String.valueOf(d);
                    }

                    t.setText(result);

                    sb.delete(0, sb.length());
                    sb.append(result);
                }
            }
        });
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append(".");
                t.setText(sb);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
