package com.melvincuellar.primerparcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CurrencyActivity extends AppCompatActivity {

    EditText etSalarioV3, etAniosServicioV3;
    Button btnCalcularV3, btnContinuarV3;
    TextView tvResultadoV3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_currency);

        //Ir a SummaryActivity
        btnContinuarV3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CurrencyActivity.this, SummaryActivity.class);
                startActivity(intent);
            }
        });
    }

    //Función para calcular el aguinaldo
    private void CalcularAguinaldo(){
        String AniosServ, Salar;
        double Aguinaldo, SalarioMensual;
        int DiasAguinaldo, AniosServicio;

        AniosServ = etAniosServicioV3.getText().toString();
        Salar = etSalarioV3.getText().toString();
        
        AniosServicio = Integer.parseInt(AniosServ);

        if (AniosServicio >= 1 & AniosServicio <3){
            DiasAguinaldo = 15;
        }else if(AniosServicio >= 3 & AniosServicio <= 10){
            DiasAguinaldo = 19;
        }else if(AniosServicio > 10){
            DiasAguinaldo = 21;
        }



    }
}