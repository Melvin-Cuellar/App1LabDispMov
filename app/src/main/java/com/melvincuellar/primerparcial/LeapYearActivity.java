package com.melvincuellar.primerparcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LeapYearActivity extends AppCompatActivity {

    EditText etIngresarAnioV2;
    Button btnResolverV2, btnContinuarV2;
    TextView tvResultadoV2;

    String ResultadoV2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_leap_year);

        //Ir a CurrencyActivity
        btnContinuarV2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LeapYearActivity.this, CurrencyActivity.class);
                startActivity(intent);
            }
        });
    }

    //Función para manejar el año
    private void DeterminarTipoDeAño(){
        String anioV2 = etIngresarAnioV2.getText().toString();

        double Mod1 = Integer.parseInt(anioV2) % 4;
        double Mod2 = Integer.parseInt(anioV2) % 400;
        if(Mod1 == 0 & Mod2 == 0){
            ResultadoV2 = "Año viciesto";
        }else{
            ResultadoV2 = "Año NO viciesto";
        }
    }
}