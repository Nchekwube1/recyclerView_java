package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
String languages[],desc[];
int images[] = {R.drawable.golang, R.drawable.html,R.drawable.java,R.drawable.javascript,R.drawable.python};
RecyclerView recyclerView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        languages = getResources().getStringArray(R.array.programming_langs);
        desc = getResources().getStringArray(R.array.description);
        recyclerView = findViewById(R.id.recycler_view);

        RecAdapter new_adapter = new RecAdapter(this, languages,desc,images);
        recyclerView.setAdapter(new_adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}