package com.example.flexibleui;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class FragB extends Fragment {
	TextView text;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.activity_frag_b,container,false);
		text=(TextView)view.findViewById(R.id.textView1);
		return view;
	}
	


public void changeData(int index) {
	// TODO Auto-generated method stub
	String[]descripation=getResources().getStringArray(R.array.descripation);
	text.setText(descripation[index]);
}
	
}
