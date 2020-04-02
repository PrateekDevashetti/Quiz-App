package com.example.qapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPage extends AppCompatActivity {

    // Variable Declaration

    Button button ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);

        // Introducing the button function

        button = findViewById(R.id.playButton);

        // Click Function

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizPage.this,Question.class);
                startActivity(intent);
            }
        });
    }
}
