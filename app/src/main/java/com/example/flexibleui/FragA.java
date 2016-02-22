package com.example.flexibleui;

import android.support.v7.app.ActionBarActivity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FragA extends Fragment implements OnItemClickListener {

	ListView list;
	Communicator comm;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view=inflater.inflate(R.layout.activity_frag,container,false);
		list=(ListView)view.findViewById(R.id.listView1);
		ArrayAdapter adapter=ArrayAdapter.createFromResource(getActivity(), R.array.chapters, android.R.layout.simple_list_item_1);
		list.setAdapter(adapter);
		list.setOnItemClickListener(this);
		return view;
	}
	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int i, long arg3) {
		comm.respond(i);
		
	}
    public void setCommunicator(Communicator comm){
    	
    	this.comm=comm;
    }
	public interface Communicator
	
	{
	public void respond(int index);
	}
	}
	

	
