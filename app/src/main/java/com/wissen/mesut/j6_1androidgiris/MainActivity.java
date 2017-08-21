package com.wissen.mesut.j6_1androidgiris;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    @BindView(R.id.btnGirisYap)
    Button btnGiris;
    @BindView(R.id.btnSiremiUnuttum)
    Button btnSifremiUnuttum;
    @BindView(R.id.txtKullaniciAdi)
    EditText txtKullaniciAdi;
    @BindView(R.id.txtSifre)
    EditText txtSifre;
    @BindView(R.id.cbBeniHatirla)
    CheckBox cbBeniHatirla;

    @OnClick(R.id.btnGirisYap)
    public void setBtnGirisClick() {
        String kullaniciAdi = txtKullaniciAdi.getText().toString(), sifre = txtSifre.getText().toString();
        boolean beniHatirla = cbBeniHatirla.isChecked();
        if (kullaniciAdi.equals("admin") && sifre.equals("1234")) {
            Toast.makeText(this, "Hoşgeldin Sahip", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, beniHatirla ? "Seni unutmayacağım" : "Seni hatırlamayacağım", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Kullanıcı adı veya şifre hatalı!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        /*btnGiris = (Button) findViewById(R.id.btnGirisYap);
        btnSifremiUnuttum = (Button) findViewById(R.id.btnSiremiUnuttum);*/

        //btnSifremiUnuttum.setOnClickListener(this);
        /*btnGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Butona tıkladın", Toast.LENGTH_SHORT).show();
            }
        });
        */
    }

    public void btnClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btnGirisYap:
                Toast.makeText(this, "Giriş yap", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSiremiUnuttum:
                Toast.makeText(this, "Şifremi unuttum", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "BtnID: " + view.getId(), Toast.LENGTH_SHORT).show();
    }
}
