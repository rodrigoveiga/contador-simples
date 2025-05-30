
package com.rodrigoveiga.contadorsimples;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textoContador = findViewById(R.id.textoContador);
        Button botaoIncrementar = findViewById(R.id.botaoIncrementar);

        botaoIncrementar.setOnClickListener(v -> {
            contador++;
            textoContador.setText("Contador: " + contador);
        });
    }
}
