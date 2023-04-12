package com.example.chatapp3.activities;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chatapp3.databinding.ActivitySingUpBinding;

public class SingUpActivity extends AppCompatActivity {
private ActivitySingUpBinding binding;
private String encodedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySingUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
    }
    private void setListeners(){
        binding.txtusuarioRegistrado.setOnClickListener(v -> onBackPressed());
        binding.btnRegistrar.setOnClickListener(v -> {
            if(isValidSignUpDetails()){
                signUP();
            }
        });
    }
    private void showToast(String message){
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }

    private void signUP(){

    }
    //private String encodeimage(Bitmap bitmao){
       // int previewWidth = 150;

   // }

    private Boolean isValidSignUpDetails(){
        if(encodedImage== null){
            showToast("Seleccione Imagen de Perfil");
            return false;
        }else if(binding.inputNombre.getText().toString().trim().isEmpty()){
            showToast("Ingrese su Nombre");
            return false;
        } else if(binding.inputEmail.getText().toString().trim().isEmpty()){
            showToast("Ingrese su correo");
            return false;
        } else if(!Patterns.EMAIL_ADDRESS.matcher(binding.inputEmail.getText().toString()).matches()){
            showToast("Ingrese imagen valida");
            return false;
        } else if(binding.inputPassword.getText().toString().trim().isEmpty()){
            showToast("Ingrese su contraseña");
            return false;
        }else if(binding.inputConfirmPassword.getText().toString().trim().isEmpty()){
            showToast("Confirme su contraseña");
            return false;
        } else if(!binding.inputPassword.getText().toString().equals(binding.inputConfirmPassword.getText().toString())){
            showToast("Contraseña no es igual ");
            return false;
        }else{
            return true;
        }
    }

    private void loading(Boolean isLoading){
        if(isLoading){
            binding.btnRegistrar.setVisibility(View.INVISIBLE);
            binding.progessbar.setVisibility(View.VISIBLE);
        } else{
            binding.btnRegistrar.setVisibility(View.VISIBLE);
            binding.progessbar.setVisibility(View.INVISIBLE);

        }
    }

}