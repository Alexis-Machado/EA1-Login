package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Encontrar el TextView "Registrarme" por su ID
        TextView textViewRegistrarme = findViewById(R.id.textViewRegistrarme);

        // Configurar un OnClickListener para el TextView
        textViewRegistrarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Definir la acción a realizar al hacer clic (navegar a la nueva pantalla)
                Intent intent = new Intent(login.this, Registro.class);
                startActivity(intent);
            }
        });

    }
}
