package com.example.fnhdev.androiddev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button btnVolver,btnSalir;
    TextView v_tv_mostrarValor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnVolver = (Button)findViewById(R.id.btn_volverActividad);
        btnSalir = (Button)findViewById(R.id.btn_cerrarApp);
        v_tv_mostrarValor = (TextView)findViewById(R.id.tv_mostrarValor);



        //
        Bundle bundle = getIntent().getExtras();

        String valor = bundle.getString("value");

        v_tv_mostrarValor.setText(v_tv_mostrarValor.getText().toString()+" "+valor);

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
