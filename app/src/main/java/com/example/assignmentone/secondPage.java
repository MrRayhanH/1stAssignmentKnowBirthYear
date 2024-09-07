package com.example.assignmentone;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Calendar;

public class secondPage extends AppCompatActivity {
    EditText yearEt;
    Button calculateBtn;
    TextView Myage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        yearEt = findViewById(R.id.ageEdittex);
        calculateBtn = findViewById(R.id.calculateBtn);
        Myage = findViewById(R.id.ageText);

        calculateBtn.setOnClickListener(V -> {
            String userDBO = yearEt.getText().toString().trim();
            int year = Calendar.getInstance().get(Calendar.YEAR);

            if(userDBO.isEmpty())
            {
                Toast.makeText(secondPage.this, "Please Enter a year", Toast.LENGTH_SHORT).show();
            }
            else if(userDBO.compareTo(String.valueOf(year)) > 0)
            {
                //Toast.makeText(secondPage.this, "Year should less then present year", Toast.LENGTH_SHORT).show();
                int myage = year - Integer.parseInt(userDBO);
                Myage.setText("My birth year is "+myage+" Years.");
            }
            else
            {
                int myage = year - Integer.parseInt(userDBO);
                Myage.setText("My birth year is "+myage);
            }
        });
    }
}