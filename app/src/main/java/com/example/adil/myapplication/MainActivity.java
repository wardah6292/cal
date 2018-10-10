package com.example.adil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,divd,mult,clear,equals,close;
    private TextView result;
    float mValueOne , mValueTwo ;

    boolean mAddition , mSubtract ,mMultiplication ,mDivision ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString()+"9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else {
                        mValueOne=Float.parseFloat(result.getText()+"");
                        mAddition=true;
                        result.setText(null);
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(result.getText()+"");
                    mSubtract=true;
                    result.setText(null);
                }
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(result.getText()+"");
                    mMultiplication=true;
                    result.setText(null);
                }
            }
        });
        divd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result==null){
                    result.setText("");
                }
                else {
                    mValueOne=Float.parseFloat(result.getText()+"");
                    mDivision=true;
                    result.setText(null);
                }
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(result.getText() + "");

                if (mAddition == true){

                    result.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    result.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    result.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    result.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
    }
    private void setup(){
        one=(Button)findViewById(R.id.one);
        zero=(Button)findViewById(R.id.zero);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six);
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        add=(Button)findViewById(R.id.plus);
        sub=(Button)findViewById(R.id.minmus);
        mult=(Button)findViewById(R.id.mult);
        divd=(Button)findViewById(R.id.divde);
        clear=(Button)findViewById(R.id.clear);
        result=(TextView)findViewById(R.id.resu);
equals=(Button)findViewById(R.id.equal);
close=(Button)findViewById(R.id.close);
    }
}
