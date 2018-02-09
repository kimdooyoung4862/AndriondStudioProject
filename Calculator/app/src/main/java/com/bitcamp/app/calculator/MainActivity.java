package com.bitcamp.app.calculator;




import android.os.Bundle;

import android.app.Activity;

import android.util.Log;

import android.view.Menu;

import android.view.View;

import android.widget.Button;

import android.widget.EditText;




public class MainActivity extends Activity {




    int sum;

    int temp=0;

    int length;

    boolean onoff=false;

    boolean start=false;

    String string;

    String tmp_string;



    EditText text;

    Button equal;

    Button plus;

    Button minus;

    Button divide;

    Button multiply;

    Button backspace;

    Button zero;

    Button one;

    Button two;

    Button three;

    Button four;

    Button five;

    Button six;

    Button seven;

    Button eight;

    Button nine;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);



        text = (EditText)findViewById(R.id.edittext);

        equal = (Button)findViewById(R.id.equal);

        plus = (Button)findViewById(R.id.plus);

        minus = (Button)findViewById(R.id.minus);

        divide = (Button)findViewById(R.id.divide);

        multiply = (Button)findViewById(R.id.multiply);

        backspace = (Button)findViewById(R.id.backspace);



        zero = (Button)findViewById(R.id.zero);

        one = (Button)findViewById(R.id.one);

        two = (Button)findViewById(R.id.two);

        three = (Button)findViewById(R.id.three);

        four = (Button)findViewById(R.id.four);

        five = (Button)findViewById(R.id.five);

        six = (Button)findViewById(R.id.six);

        seven = (Button)findViewById(R.id.seven);

        eight = (Button)findViewById(R.id.eight);

        nine = (Button)findViewById(R.id.nine);




        zero.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("0");

            }

        });



        one.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("1");

            }

        });



        two.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("2");

            }

        });




        three.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("3");

            }

        });




        four.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("4");

            }

        });




        five.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("5");

            }

        });




        six.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("6");

            }

        });



        seven.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("7");

            }

        });



        eight.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("8");

            }

        });



        nine.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("9");

            }

        });




        plus.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("+");

                function2("+");

            }

        });



        minus.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("-");

            }

        });



        multiply.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("*");

            }

        });



        divide.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                function("/");

            }

        });



        backspace.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View v) {

                tmp_string=text.getText().toString();

                length=tmp_string.length();

                if(length>0){

                    text.setText(tmp_string.substring(0, length-1));

                }

            }

        });



        equal.setOnClickListener(new View.OnClickListener() {



            @Override

            public void onClick(View arg0) {

                text.setText("="+temp);

                temp=0;

                start=true;



            }

        });





    }








    void function(String a){

        if(text.getText().toString().equals("")||text.getText().toString().equals("0")){

            text.setText(""+a);

        }

        else if(start==true){

            text.setText(""+a);

            start=false;

        }

        else{

            string=text.getText().toString();

            text.setText(""+string+a);

        }




    }



    void function2(String a){

        length=text.length();

        temp=temp+Integer.parseInt(text.getText().toString().substring(0, length-1));

        start=true;





        /*if(start==false){

            length=text.length();

            temp=Integer.parseInt(text.getText().toString().substring(0, length-1));

            start=true;

        }

        else{

            length=text.length();

            temp=temp+(Integer.parseInt(text.getText().toString().substring(0, length-1)));

            text.setText(""+temp);

        }*/



    }



}