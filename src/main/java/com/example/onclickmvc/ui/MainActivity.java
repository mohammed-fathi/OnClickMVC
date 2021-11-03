package com.example.onclickmvc.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.onclickmvc.R;
import com.example.onclickmvc.pojo.MovieModel;

public class MainActivity extends AppCompatActivity {
    TextView MovienameTV;
    Button getmoviebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MovienameTV = findViewById(R.id.textView);
        getmoviebutton = findViewById(R.id.button);
        getmoviebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MovienameTV.setText(getMovieFromDatabase().getName());
            }
        });
    }
    public MovieModel getMovieFromDatabase(){
        return new MovieModel("Black and white","1990","nice",12);
    }

}