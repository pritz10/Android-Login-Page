package com.example.sony.sqldemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends Activity {

    EditText ET_NAME,ET_USER_NAME,ET_USER_PASS;
    String name,user_name,user_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        ET_NAME=(EditText) findViewById(R.id.name);
        ET_USER_NAME=(EditText) findViewById(R.id.new_user_name);
        ET_USER_PASS=(EditText) findViewById(R.id.new_user_pass);
    }

    public void userReg(View view)
    {
        name=ET_NAME.getText().toString();
        user_name=ET_USER_NAME.getText()
                .toString();
        user_pass=ET_USER_PASS.getText().toString();
        String method="register";
        BackgroundTask backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,name,user_name,user_pass);
        finish();
    }
}
