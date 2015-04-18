package com.example.hellloapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Submit extends Activity{

  Intent caller;

  TextView mediumText;

  String fromMainActivity;

 

  @Override

  protected void onCreate(Bundle savedInstanceState) {

  	// TODO Auto-generated method stub

  	super.onCreate(savedInstanceState);

  	//setContentView(R.layout.show details);

  	/*mediumText=(TextView)findViewById(R.id.firstname);

  	caller=getIntent();

  	fromMainActivity=caller.getStringExtra("email");

  	mediumText.setText(fromMainActivity);*/

 	 

  }

 

}
