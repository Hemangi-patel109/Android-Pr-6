package com.example.myapplication5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edit_text = findViewById(R.id.edit_text);
        EditText password = findViewById(R.id.password);
        Button Login = findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edit_text.getText().toString();
                String p_word = edit_text.getText().toString();

                if (username.isEmpty() || p_word.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
