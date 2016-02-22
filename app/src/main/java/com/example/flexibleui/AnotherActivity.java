package com.example.flexibleui;

import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AnotherActivity extends ActionBarActivity {
	FragmentManager manager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
		Intent i=getIntent();
		int index=i.getIntExtra("index",0);
		
	FragB f2=(FragB) getFragmentManager().findFragmentById(R.id.fragment2);
	if(f2!=null)
    f2.changeData(index);
	
		
		
		
	}

}
