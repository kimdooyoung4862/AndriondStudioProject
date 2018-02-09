package com.example.calculator3;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity 
{

	Button one;
	Button two;
	Button three;
	Button four;
	Button five;
	Button six;
	Button seven;
	Button eight;
	Button nine;
	Button zero;
	Button plus;
	Button minus;
	Button divide;
	Button multiply;
	Button equal;
	Button backspace;
	EditText text;
	String string;
	String temp;
	int length;
	int yunsan;
	float sum=0;
	Boolean on=false;
	Boolean clean=false;



	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		one = (Button) findViewById(R.id.one);
		two = (Button) findViewById(R.id.two);
		three = (Button) findViewById(R.id.three);
		four = (Button) findViewById(R.id.four);
		five = (Button) findViewById(R.id.five);
		six = (Button) findViewById(R.id.six);
		seven = (Button) findViewById(R.id.seven);
		eight = (Button) findViewById(R.id.eight);
		nine = (Button) findViewById(R.id.nine);
		zero = (Button) findViewById(R.id.zero);
		plus = (Button) findViewById(R.id.plus);
		minus = (Button) findViewById(R.id.minus);
		divide = (Button) findViewById(R.id.divide);
		multiply = (Button) findViewById(R.id.multiply);
		equal = (Button) findViewById(R.id.equal);
		backspace = (Button) findViewById(R.id.backspace);
		text = (EditText) findViewById(R.id.edittext);
		
		one.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function("1");
			}
		});

		two.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function("2");
			}
		});

		three.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function("3");
			}
		});

		four.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function("4");
			}
		});

		five.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0)
			{
				function("5");
			}
		});

		six.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function("6");
			}
		});

		seven.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0)
			{
				function("7");
			}
		});

		eight.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0)
			{
				function("8");
			}
		});

		nine.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function("9");
			}
		});

		zero.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				if(on!=true) function("0");
			}
		});

		plus.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function2("+");
			}
		});

		minus.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function2("-");
			}
		});

		multiply.setOnClickListener(new View.OnClickListener() 
		{
			public void onClick(View arg0) 
			{
				function2("×");	
			}
		});

		divide.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View arg0)
			{
				function2("÷");
			}
		});

		equal.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View arg0) 
			{
				string=text.getText().toString();
				length=string.length();
				String last=string.substring(length-1,length);
				int j=0;
				int k=0;
				int point;
				int pointTemp;
				Boolean first = true;
				
				
				
				for(int i=0;i<length;i++)
				{
					point=string.codePointAt(i);
					if(point==215||point==247||point==43||point==45)
					{
						if(first==true)
						{
							sum=sum+Integer.parseInt(string.substring(0,i));
							first=false;
						}
						
						if(first==false)
						{
							if(point==43)
							{
								for(j=i+1;j<length;j++)
								{
									pointTemp=string.codePointAt(j);
									if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
								}
								
								sum=sum+Integer.parseInt(string.substring(i+1,j));
							}
							
							else if(point==45)
							{
								for(j=i+1;j<length;j++)
								{
									pointTemp=string.codePointAt(j);
									if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
								}
								
								sum=sum-Integer.parseInt(string.substring(i+1,j));
							}
							
							else if(point==215)
							{
								for(j=i+1;j<length;j++)
								{
									pointTemp=string.codePointAt(j);
									if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
								}
								
								sum=sum*Integer.parseInt(string.substring(i+1,j));
							}
							
							else if(point==247)
							{
								for(j=i+1;j<length;j++)
								{
									pointTemp=string.codePointAt(j);
									if(pointTemp==215||pointTemp==247||pointTemp==43||pointTemp==45) break;
								}
								
								sum=sum/Integer.parseInt(string.substring(i+1,j));
							}
						}
						
					}
					
					
				}
//				곱하기=215 나누기=247 더하기 =43 빼기=45


				text.setText(""+sum);
				sum=0;
				clean=true;
			}
		});

		backspace.setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				if(clean==true){
					text.setText("");
					clean=false;
				}
				else if(!text.getText().toString().equals("")){ 
					text.setText(text.getText().toString().substring(0, text.getText().toString().length()-1));
					if(on==true) on=false;
				}
			}
		});
	}
	

	void function(String a){
		string=text.getText().toString();
		length=text.getText().toString().length();
		
		
		
		if(string.equals("")||string.equals("0")){
			text.setText(""+a);
			on=false;
		}
		else if(clean==true){
			text.setText(""+a);
			clean=false;
		}
		else{
			text.setText(string+a);
			on=false;
		}
	}
	
	void function2(String a){
		string=text.getText().toString();
		if(clean==true)
		{
			text.setText("");
			clean=false;
			
		}
		else if(on==false){
			text.setText(string+a);
			on=true;
		}
	}
	

}