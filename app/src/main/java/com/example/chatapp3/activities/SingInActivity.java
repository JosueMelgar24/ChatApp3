package com.example.chatapp3.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.chatapp3.R;
import com.example.chatapp3.databinding.ActivitySingInBinding;

public class SingInActivity extends AppCompatActivity {

    private ActivitySingInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();

    }



    private void setListeners(){
       binding.txtnuevoUsuario.setOnClickListener(v ->
               startActivity(new Intent(getApplicationContext(), SingUpActivity.class)));
    }
}