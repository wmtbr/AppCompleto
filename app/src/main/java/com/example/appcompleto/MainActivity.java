package com.example.appcompleto;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    /*  private EditText editLogin;
      private EditText editSenha;
      private TextView resultado;


      @Override
      protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
      }

      public void enviar (View view) {
          editLogin = findViewById(R.id.editLogin);
          editSenha = findViewById(R.id.editSenha);
          resultado = findViewById(R.id.resultado);

          String login = editLogin.getText().toString();
          String senha = editSenha.getText().toString();
          resultado.setText(login + senha);

      }

     */
    private EditText editLogin;
    private EditText editSenha;
    private TextView resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void enviar (View view){

        editLogin = findViewById(R.id.editLogin);
        editSenha = findViewById(R.id.editSenha);
        resultado = findViewById(R.id.resultado);

        String login = editLogin.getText().toString();
        String senha = editSenha.getText().toString();

        resultado.setText( login + senha);
        editLogin.setText( "");
        editSenha.setText("");
    }

}
