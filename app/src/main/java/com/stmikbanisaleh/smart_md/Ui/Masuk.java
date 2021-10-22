package com.stmikbanisaleh.smart_md.Ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.stmikbanisaleh.smart_md.R;

public class Masuk extends AppCompatActivity {

    private Button btn_login;
    private EditText email;
    private EditText password;
    private TextView texErrorLogin;
    private ProgressBar pb_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audit_store2);


    }


}