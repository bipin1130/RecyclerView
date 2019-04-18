package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.e.recyclerview.model.Contacts;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.RecyclerView);

        List<Contacts> contactsList = new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla", "9860050468",R.drawable.saugat))
        contactsList.add(new Contacts("Saugat Malla", "9860050468",R.drawable.saugat))
        contactsList.add(new Contacts("Saugat Malla", "9860050468",R.drawable.saugat))
        contactsList.add(new Contacts("Saugat Malla", "9860050468",R.drawable.saugat))
    }
}
