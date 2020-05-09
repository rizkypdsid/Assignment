package com.mrpds.barvolume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtpanjang, txtlebar, txttinggi;
    Button btnhitung;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtpanjang=findViewById(R.id.panjang);
        txtlebar=findViewById(R.id.lebar);
        txttinggi=findViewById(R.id.tinggi);
        btnhitung=findViewById(R.id.hitung);
        txthasil=findViewById(R.id.hasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length, width , height, value;

                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("This field cannot be empty!");
                    return;
                }
                if(txtlebar.getText().toString().isEmpty()){
                    txtlebar.setError("This field cannot be empty!");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("This field cannot be empty!");
                    return;
                }

                length = Integer.parseInt(txtpanjang.getText().toString());
                width = Integer.parseInt(txtlebar.getText().toString());
                height = Integer.parseInt(txttinggi.getText().toString());

                value = length*width*height;
                String Result = "Result : ";

                txthasil.setText(String.valueOf(Result + value));
            }
        });
    }
}
