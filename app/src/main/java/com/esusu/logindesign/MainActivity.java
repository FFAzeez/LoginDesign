package com.esusu.logindesign;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    EditText emailText,passText;
    AlertDialog alertDialog;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailText = (EditText)findViewById(R.id.emailText);
        passText = (EditText)findViewById(R.id.passwordText);
    }
    public void goRegister(View view){
        LayoutInflater inflater = (LayoutInflater)getSystemService(LAYOUT_INFLATER_SERVICE);
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.signUp);
        View layout = inflater.inflate(R.layout.activity_sign_up, linearLayout,false);
        builder = new AlertDialog.Builder(MainActivity.this);
        alertDialog= builder.setView(layout).create();
        alertDialog.show();
    }
    public void goToHomepage(View view){
        startActivity(new Intent(MainActivity.this,Homepage.class));
    }
    public void goHomepage(View view){
//        String email
//        Intent intent = new Intent();
//        intent.putExtra("email",)
        startActivity(new Intent(MainActivity.this, Homepage.class));

    }
}
