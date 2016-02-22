package com.example.flexibleui;

import com.example.flexibleui.FragA.Communicator;

import android.support.v7.app.ActionBarActivity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity implements Communicator {
FragA f1;
FragB f2;
FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
    f1= (FragA) manager.findFragmentById(R.id.fragment1);
    f1.setCommunicator(this);
        
        
        
    }
	@Override
	public void respond(int index) {

		f2=(FragB)manager.findFragmentById(R.id.fragment2);
		
		if(f2!=null && f2.isVisible()){
			f2.changeData(index);
		}
		else{
			Intent i=new Intent(this,AnotherActivity.class);
			i.putExtra("index",index);
			startActivity(i);
			
		}
	}


}
