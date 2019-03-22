package com.example.msitplacements;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentHomeActivity extends AppCompatActivity {
    Button viewCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_home);

        viewCompany = (Button) findViewById(R.id.button14);
        viewCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentHomeActivity.this, CompanyDetails.class);
                startActivity(i);
            }
        });
    }
}
