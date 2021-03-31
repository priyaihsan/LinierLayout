package com.example.linierlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama,tvnomor;

    Bundle bundle = getIntent().getExtras();

    String nama = bundle.getString("a");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        switch (nama){
            case "inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;
            case "ilham":
                tvnama.setText("Ilham  R");
                tvnomor.setText("08133224455");
                break;
            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08125533344");
                break;
            case "Fikri":
                tvnama.setText("Intan S");
                tvnomor.setText("08122555344");
                break;
            case "vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08125556344");
                break;
            case "Gita S":
                tvnama.setText("Vian M");
                tvnomor.setText("0812296944");
                break;

        }

    }
}
