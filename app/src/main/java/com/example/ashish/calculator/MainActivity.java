package com.example.ashish.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    Button btnOne, btnTwo,btnThree,btnFour,btnFive,btnSix,btnSeven,btnEight,btnNine,btnZero,btnDivide,btnMultiply,btnSubtract,btnDot,btnClear,btnAdd,btnEqual;
    TextView txtScreen;
    float valueone,valuetwo;
    boolean maddition, msubstraction, mmultiplication, mdivision;
    @Override
    protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnOne = (Button) findViewById(R.id.btnOne);
            btnTwo = (Button) findViewById(R.id.btnOne);
            btnThree = (Button) findViewById(R.id.btnOne);
            btnFour = (Button) findViewById(R.id.btnOne);
            btnFive = (Button) findViewById(R.id.btnOne);
            btnSix = (Button) findViewById(R.id.btnOne);
            btnSeven = (Button) findViewById(R.id.btnOne);
            btnEight = (Button) findViewById(R.id.btnOne);
            btnNine = (Button) findViewById(R.id.btnOne);
            btnZero = (Button) findViewById(R.id.btnOne);
            btnAdd = (Button) findViewById(R.id.btnOne);
            btnSubtract = (Button) findViewById(R.id.btnOne);
            btnMultiply = (Button) findViewById(R.id.btnOne);
            btnDivide = (Button) findViewById(R.id.btnOne);
            btnDot = (Button) findViewById(R.id.btnOne);
            btnClear = (Button) findViewById(R.id.btnOne);
            btnEqual = (Button) findViewById(R.id.btnOne);
            txtScreen = (TextView) findViewById(R.id.txtScreen);

            btnOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   txtScreen.setText(txtScreen.getText() + "1");
                }
            });

            btnTwo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText() + "2");
                }
            });

            btnThree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText() + "3");
                }
            });

            btnFour.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText()+"4");
                }
            });

            btnFive.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText()+"5");
                }
            });

            btnSeven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText()+"7");
                }
            });

            btnEight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText()+"8");
                }
            });

            btnNine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText()+"9");
                }
            });

            btnZero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText()+"0");
                }
            });

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (txtScreen==null){
                        txtScreen.setText("");
                    } else {
                        valueone = Float.parseFloat(txtScreen.getText()+"");
                        maddition=true;
                        txtScreen.setText(null);
                    }
                }
            });

            btnSubtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (txtScreen==null) {
                        txtScreen.setText("");
                    } else {
                        valueone = Float.parseFloat(txtScreen.getText() + "");
                        msubstraction=true;
                        txtScreen.setText(null);
                    }
                }
            });

            btnMultiply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(txtScreen==null){
                        txtScreen.setText("");
                    } else      {
                        valueone = Float.parseFloat(txtScreen.getText() + "");
                        mmultiplication=true;
                        txtScreen.setText(null);

                    }
                }
            });

            btnDivide.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(txtScreen==null) {
                        txtScreen.setText("");
                    } else {
                        valueone= Float.parseFloat(txtScreen.getText()+ "");
                        mdivision = true;
                        txtScreen.setText(null);
                    }
                }
            });


            btnEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    valuetwo = Float.parseFloat(txtScreen.getText()+ "");
                    if (maddition==true){
                        txtScreen.setText(valueone+valuetwo+"");
                        maddition=false;
                    }

                    if (msubstraction==true){
                        txtScreen.setText(valueone-valuetwo+"");
                        msubstraction=false;
                    }

                    if(mmultiplication==true){
                        txtScreen.setText(valueone*valuetwo+"");
                        mmultiplication=false;
                    }

                    if(mdivision==true){
                        txtScreen.setText(valueone/valuetwo+"");
                        mdivision=false;
                    }
                }
            });


            btnClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText("");
                }
            });

            btnDot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txtScreen.setText(txtScreen.getText()+".");
                }
            });




    }
}
