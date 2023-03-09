package com.example.samsungproject;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;

public class Authorization extends FragmentActivity {
    Button btn;
    private String loginString;
    private String pswrdString;
    EditText loginEditText;
    EditText pswrdEditText;

    public String getLoginString(){
        return loginString;
    }
    public String getpswrdString(){
        return pswrdString;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        loginEditText = findViewById(R.id.loginId);
        pswrdEditText = findViewById(R.id.editTextTextPassword);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginString =loginEditText.getText().toString();
                pswrdString= pswrdEditText.getText().toString();
                // if(СЧИТАННЫЕ ДАННЫЕ = ДАННЫЕ В БД){
                    //РЕАЛИЗОВАТЬ ПЕРЕХОД ПО ФРАГМЕНТУ В МЕЙН АКТИВИТИ}
            }
        };
    }
}
