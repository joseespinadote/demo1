package com.example.jose.demostracion1;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBoton(View view) {
        EditText edittext = (EditText) findViewById(R.id.cajaTexto);
        int x = Integer.parseInt(edittext.getText().toString());
        Context context = getApplicationContext();

        if(x % 2 == 0) {
            Toast toast = Toast.makeText(context, "ES PAR!!!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            Toast toast = Toast.makeText(context, "ES IMPAR!!!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
