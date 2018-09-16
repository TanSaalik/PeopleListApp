package com.example.tan.peoplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final PeopleList peopleList = new PeopleList();
    private EditText firstName, lastName;
    private ListView listView;
    private ArrayAdapter<People> adapter;
    private List<People> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);


        firstName = findViewById(R.id.firstNameInput);
        lastName = findViewById(R.id.lastNameInput);
        listView = findViewById(R.id.listView);


    }

    public void clear(View view) {
        firstName.setText("");
        lastName.setText("");
        list.clear();
        adapter.notifyDataSetChanged();
    }

    public void add(View view) {
        adapter.notifyDataSetChanged();
    }
}
