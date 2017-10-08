package com.example.chinhpc.triphunter.Activity_Layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.chinhpc.triphunter.R;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnBack;
    private Button btnregiter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnBack = (Button) this.findViewById(R.id.btn_back);
        btnBack.setOnClickListener(this);
        //
        btnregiter = (Button) this.findViewById(R.id.btndangky);
        btnregiter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_back: Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent); break;
            case R.id.btndangky: Intent intent1 = new Intent(this, LoginActivity.class);
                startActivity(intent1); break;
        }
    }
}
