package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Registro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registro);

        // Encontrar el botón o elemento para volver a la pantalla de inicio de sesión por su ID
        TextView textViewIniciarSeción = findViewById(R.id.textViewIniciarSeción);

        // Configurar un OnClickListener para el TextView
        textViewIniciarSeción.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Definir la acción a realizar al hacer clic (navegar de vuelta a la pantalla de inicio de sesión)
                Intent intent = new Intent(Registro.this, login.class);
                startActivity(intent);
            }
        });
    }
}
