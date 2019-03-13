package com.example.second_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {
    Button submitted;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        i1=(ImageView)findViewById(R.id.top);

        Intent i=getIntent();
        String msg=i.getStringExtra("EXTRA_MESSAGE");
        TextView text=findViewById(R.id.title);
        text.setText(msg);

        Bundle bundle=getIntent().getExtras();
        int resid=bundle.getInt("resId");
        i1.setImageResource(resid);



        submitted=findViewById(R.id.submit);
          submitted.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(SubActivity.this,"Successfully Submitted", Toast.LENGTH_SHORT).show();
              }
          });

    }
}
