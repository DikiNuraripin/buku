package com.example.buku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView txtId,txtBuku,txtJudul,txtHalaman,txtPenulis,txtNama,txtBuku2,txtJudul2,txtHalaman2,txtPenulis2,txtNama2;
    ApiInterpace apiInterpace;
    List<Golongan> daftarGol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    txtId=(TextView)findViewById(R.id.txt_Id);
    txtBuku=(TextView)findViewById(R.id.txt_Buku);
    txtJudul=(TextView)findViewById(R.id.txt_Judul);
    txtHalaman=(TextView)findViewById(R.id.txt_Halaman);
    txtPenulis=(TextView)findViewById(R.id.txt_Penulis);
    txtNama=(TextView)findViewById(R.id.txt_Nama);
        txtBuku2=(TextView)findViewById(R.id.txt_Buku2);
        txtJudul2=(TextView)findViewById(R.id.txt_Judul2);
        txtHalaman2=(TextView)findViewById(R.id.txt_Halaman2);
        txtPenulis2=(TextView)findViewById(R.id.txt_Penulis2);
        txtNama2=(TextView)findViewById(R.id.txt_Nama2);
    apiInterpace = Apiclient.ambilBuku().create(ApiInterpace.class);
        Call<List<Golongan>>call=apiInterpace.getPerpustakaan();
        call.enqueue(new Callback<List<Golongan>>() {
            @Override
            public void onResponse(Call<List<Golongan>> call, Response<List<Golongan>> response) {
                daftarGol=response.body();
                int a = daftarGol.get(0).getId();
                txtId.setText(Integer.toString(a));
                txtJudul.setText(daftarGol.get(0).getBuku().get(0).getJudul());
                txtHalaman.setText(daftarGol.get(0).getBuku().get(0).getHalaman());
                txtPenulis.setText(daftarGol.get(0).getBuku().get(0).getPenulis());
                txtNama.setText(daftarGol.get(0).getNama());
                txtJudul2.setText(daftarGol.get(1).getBuku().get(1).getJudul());
                txtHalaman2.setText(daftarGol.get(1).getBuku().get(1).getHalaman());
                txtPenulis2.setText(daftarGol.get(1).getBuku().get(1).getPenulis());
                txtNama2.setText(daftarGol.get(1).getNama());
            }

            @Override
            public void onFailure(Call<List<Golongan>> call, Throwable t) {

            }
        });
    }
}