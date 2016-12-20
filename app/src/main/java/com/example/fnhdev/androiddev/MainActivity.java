package com.example.fnhdev.androiddev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSalir;
    Button btnPasarValor;
    EditText v_etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instanciamos.

        btnSalir = (Button)findViewById(R.id.btn_cerrarApp);
        btnPasarValor = (Button)findViewById(R.id.btn_pasarValor);
        v_etNombre = (EditText)findViewById(R.id.et_valorNombre);


        btnPasarValor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value",v_etNombre.getText().toString());

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
