package com.example.buku;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterpace {

        @GET("d37f8289")
        Call<List<Golongan>> getPerpustakaan();
}
