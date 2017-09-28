package com.bowotmf.tugas2x;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edNama,edNpm,edTtl,edAgama,edFakultas,edProdi;
    private Button btnGetData;
    String nama,npm,ttl,agama,fakultas,prodi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNama     = (EditText) findViewById(R.id.isiNama);
        edNpm      = (EditText) findViewById(R.id.isiNpm);
        edTtl      = (EditText) findViewById(R.id.isiTtl);
        edAgama    = (EditText) findViewById(R.id.isiAgama);
        edFakultas = (EditText) findViewById(R.id.isiFakultas);
        edProdi    = (EditText) findViewById(R.id.isiProdi);
        btnGetData  = (Button) findViewById(R.id.btnambildata);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama       = edNama.getText().toString();
                npm        = edNpm.getText().toString();
                ttl        = edTtl.getText().toString();
                agama      = edAgama.getText().toString();
                fakultas   = edFakultas.getText().toString();
                prodi      = edProdi.getText().toString();

                Intent go = new Intent(MainActivity.this,Hasil.class);
                go.putExtra("Nama",nama);
                go.putExtra("Npm",npm);
                go.putExtra("Ttl",ttl);
                go.putExtra("Agama",agama);
                go.putExtra("Fakultas",fakultas);
                go.putExtra("Prodi",prodi);
                startActivity(go);

                finish();
            }
        });

    }
}

