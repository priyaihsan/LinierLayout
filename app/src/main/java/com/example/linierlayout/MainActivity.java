package com.example.linierlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    EditText edEmail,edPassword;
    Button btnLogin;
    String nama,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin  =findViewById(R.id.button);
        edEmail   =findViewById(R.id.editTextTextEmailAddress);
        edPassword=findViewById(R.id.editTextTextPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama     = edEmail.getText().toString();
                password = edPassword.getText().toString();

                String email = "priya@gmail.com";
                String pass = "1234";


                // untuk menampilkan toast
                if (nama.isEmpty() || password.isEmpty()){
                    Toast t = Toast.makeText(getApplicationContext()
                            ,"Email dan Password wajib diisi",Toast.LENGTH_LONG);
                    t.show();

                }
                else{
                    if (nama.equals(email) || password.equals(pass)){
                        Toast t = Toast.makeText(getApplicationContext()
                                ,"login Berhasil",Toast.LENGTH_LONG);
                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a",nama.trim());

                        b.putString("b",password.trim());

                        Intent i =  new Intent(getApplicationContext(),Home_Activity.class);

                        i.putExtras(b);

                        startActivity(i);

                    }
                    else{
                        Toast t = Toast.makeText(getApplicationContext()
                                ,"login Gagal",Toast.LENGTH_LONG);

                        t.show();
                    }
                }
            }
        });
    }


}