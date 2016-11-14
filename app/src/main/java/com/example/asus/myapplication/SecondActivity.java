package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    private ListView mListView;
    String[] programmeArray = {"Programme Structure","Co-curricular Registration"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mListView = (ListView) findViewById(R.id.listView);
// 1
        final ArrayList<String> recipeList = new ArrayList<String>();
// 2
        String[] listItems = new String[programmeArray.length];
// 3
        for(int i = 0; i < programmeArray.length; i++){
            listItems[i] = programmeArray[i];
        }
// 4
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems);
        mListView.setAdapter(adapter);
    }
}
