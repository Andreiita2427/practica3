package com.facci.andrealcivar.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent;
        switch (item.getItemId()){
            case R.id.opcionLogin:
                intent = new Intent(MainActivity.this, ActividadLogin.class);
                startActivity(intent);
                break;
            case R.id.opcionRegistrar:
                intent = new Intent(MainActivity.this, ActividadRegistrar.class);
                startActivity(intent);
                break;
            case R.id.opcionLinear:
                intent = new Intent(MainActivity.this, LayoutLinear.class);
                startActivity(intent);
                break;
            case R.id.opcionFrame:
                intent = new Intent(MainActivity.this, LayoutFrame.class);
                startActivity(intent);
                break;
            case R.id.opcionTable:
                intent = new Intent(MainActivity.this, LayoutTable.class);
                startActivity(intent);
                break;
            case R.id.opcionColores:
                intent = new Intent(MainActivity.this, FragmentoColores.class);
                startActivity(intent);
                break;
            case R.id.opcionSensores:
                intent = new Intent(MainActivity.this, SensoresAcelerometro.class);
                startActivity(intent);
                break;
            case R.id.opcionProximidad:
                intent = new Intent(MainActivity.this, SensoresProximidad.class);
                startActivity(intent);
                break;
            case R.id.opcionLuz:
                intent = new Intent(MainActivity.this, SensoresLuz.class);
                startActivity(intent);
                break;
            case R.id.opcionDetector:
                intent = new Intent(MainActivity.this, SensoresDetectores.class);
                startActivity(intent);
                break;
            case R.id.opcionVibrar:
                intent = new Intent(MainActivity.this, HardwareVibrar.class);
                startActivity(intent);
                break;
            case R.id.opcionLinterna:
                intent = new Intent(MainActivity.this, HardwareLinterna.class);
                startActivity(intent);
                break;
        }
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
