package com.example.msitplacements;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TPOHomeActivity extends AppCompatActivity {
    Button addCompany;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tpohome);

        addCompany = (Button) findViewById(R.id.button10);
        addCompany.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TPOHomeActivity.this, CompanyActivity.class);
                startActivity(i);
            }
        });
    }
}
