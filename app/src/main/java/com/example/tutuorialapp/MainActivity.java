package com.example.tutuorialapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ExpandableListView exp_list;
    List<String> listgrp;
    HashMap<String,List<String>> listitem;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exp_list = findViewById(R.id.exp_list);
        listgrp = new ArrayList<>();
        listitem = new HashMap<>();
        adapter = new MainAdapter(this,listgrp,listitem);
        exp_list.setAdapter(adapter);
        initListData();
    }

    private void initListData() {
        listgrp.add(getString(R.string.group1));
        listgrp.add(getString(R.string.group2));
        listgrp.add(getString(R.string.group3));
        listgrp.add(getString(R.string.group4));
        listgrp.add(getString(R.string.group5));

        String[] array;

        List<String> list1 =new ArrayList<>();
        array = getResources().getStringArray(R.array.group1);
        for (String item : array){
            list1.add(item);
        }

        List<String> list2 =new ArrayList<>();
        array = getResources().getStringArray(R.array.group2);
        for (String item : array){
            list2.add(item);
        }

        List<String> list3 =new ArrayList<>();
        array = getResources().getStringArray(R.array.group3);
        for (String item : array){
            list3.add(item);
        }

        List<String> list4 =new ArrayList<>();
        array = getResources().getStringArray(R.array.group4);
        for (String item : array){
            list4.add(item);
        }

        List<String> list5 =new ArrayList<>();
        array = getResources().getStringArray(R.array.group5);
        for (String item : array){
            list5.add(item);
        }

        listitem.put(listgrp.get(0),list1);
        listitem.put(listgrp.get(1),list2);
        listitem.put(listgrp.get(2),list3);
        listitem.put(listgrp.get(3),list4);
        listitem.put(listgrp.get(4),list5);
        adapter.notifyDataSetChanged();
    }
}