package com.example.chatapp3.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.chatapp3.R;
import com.example.chatapp3.databinding.ActivitySingInBinding;
import com.example.chatapp3.databinding.ActivitySingUpBinding;

public class SingUpActivity extends AppCompatActivity {
private ActivitySingUpBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners(){
        binding.txtusuarioRegistrado.setOnClickListener(v -> onBackPressed());
    }
}