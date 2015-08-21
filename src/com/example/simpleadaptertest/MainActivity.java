package com.example.simpleadaptertest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener{
    private ListView listview;
    private ArrayAdapter<String> array_adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listview=(ListView)findViewById(R.id.listView1);
		String[]item={"我是谁","我从哪里来","要到哪里去"};
		
		array_adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,R.id.listView1,item);
		listview.setAdapter(array_adapter);
		
		
		
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		listview.getItemAtPosition(position);//获取ListView中的item
		Toast.makeText(this, "position="+position, Toast.LENGTH_SHORT).show();
		
	}
	

	
	
}
