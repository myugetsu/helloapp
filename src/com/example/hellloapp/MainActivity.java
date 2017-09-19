package com.example.hellloapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener{

	  private TextView text;

	  Button submits;

	  EditText firstname;

	  EditText lastname;

	  EditText phone;

	  EditText email;

	 

	  @Override

	  protected void onCreate(Bundle savedInstanceState) {

	  	super.onCreate(savedInstanceState);

	  	setContentView(R.layout.activity_main);   	 

	  	text=(TextView)findViewById(R.id.firstname);

	  	text=(TextView)findViewById(R.id.lastname);

	  	text=(TextView)findViewById(R.id.phone);

	  	text=(TextView)findViewById(R.id.email);

	 	 

	 	 

	  	submit=(Button)findViewById(R.id.submit);

	         	 

	  	submit.setOnClickListener(this);

	  	submit.setOnClickListener(new View.OnClickListener() {

	     	 

	      	@Override

	      	public void onClick(View v) {

	          	// TODO Auto-generated method stub

	         	 

	          	String userInput;

	          	userInput = text.getText().toString();

	          	Intent i = new Intent(MainActivity.this,Submit.class);

	          	i.putExtra("firstname", userInput);

	          	startActivity(i);

	      	}

	      	});

	 	 

	  }

	  @Override

	  public boolean onCreateOptionsMenu(Menu menu) {

	  	// Inflate the menu; this adds items to the action bar if it is present.

	  	getMenuInflater().inflate(R.menu.activity_main, menu);

	  	return true;

	  }

	@Override

	public void onClick(View v) {

	  Intent intent = new Intent(MainActivity.this, Activity.class);

	  startActivity(intent);}

	}


	