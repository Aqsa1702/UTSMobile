package com.example.muhammadaqsahamdani_32922_if633_bl_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MasukActivity extends AppCompatActivity {
    private Button btnLogin;
    EditText etUname, etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        getSupportActionBar().setTitle("Halaman Login");
        btnLogin=(Button)findViewById(R.id.btnLogin);
        etUname=(EditText)findViewById(R.id.form_username);
        etPass=(EditText)findViewById(R.id.form_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etUname.getText().toString().equals("uasmobile") && etPass.getText().toString().equals("uasmobilegenap")){
                    startActivity(new Intent(MasukActivity.this, LaguActivity.class));
                    finish();
                }else{
                    Toast.makeText(getApplicationContext(), "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}