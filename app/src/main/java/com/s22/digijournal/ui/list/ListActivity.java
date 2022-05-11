package com.s22.digijournal.ui.list;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.s22.digijournal.R;

public class ListActivity extends AppCompatActivity
{
    RecyclerView lists;
    ListAdapter adapter;
    
    @Override protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_list);
        
        lists = findViewById(R.id.list_details_tasks_recycler);
        lists.hasFixedSize();
        lists.setLayoutManager(new LinearLayoutManager(this));
        //TODO instantiate adapter (what arg?), lists.setAdapter, set listener on adapter
    }
}