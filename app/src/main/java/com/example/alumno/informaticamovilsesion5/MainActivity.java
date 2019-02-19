package com.example.alumno.informaticamovilsesion5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int countUo;
    private TextView mShowContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countUo=0;
        mShowContent=(TextView)findViewById(R.id.show_count);
    }


    public void mostrarMensaje(View view) {
        Toast toast=Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void aumentarContador(View view) {
        countUo++;
        if(mShowContent!=null){
            mShowContent.setText(Integer.toString(countUo));
        }
    }
}
