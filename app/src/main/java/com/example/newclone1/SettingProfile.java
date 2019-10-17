package com.example.newclone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SettingProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_profile);

        ListView mlistView = (ListView)findViewById(R.id.settingListView1);
        final ArrayList<String> mlist = new ArrayList<>();
        mlist.add("logout");

        ArrayAdapter<String> marrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mlist);

        mlistView.setAdapter(marrayAdapter);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(SettingProfile.this,logout.class);
                startActivity(intent);

            }
        });

        ListView listView = (ListView)findViewById(R.id.settingListView);
        final ArrayList<String> list = new ArrayList<>();
        list.add("Archive");
        list.add("Your Activity");
        list.add("NameTag");
        list.add("Saved");
        list.add("Close Friends");
        list.add("Discover People");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SettingProfile.this,SettingIntent.class);
                startActivity(intent);

            }
        });
    }
}
