package com.pendaftaranmahasiswabaru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNomorPendaftaran, etNama;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNomorPendaftaran = findViewById(R.id.et_NomorPendaftaran);
        etNama = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomorPendaftaran etNomorPendaftaran.getText().toString();
                String nama = etNama.getText().toString();
                if(NomorPendaftaran.trim().equals("Nama Wajib Diisi")) {

                }
                else if(nama.trim().equals("")){

                }
            }
        });

    }
}