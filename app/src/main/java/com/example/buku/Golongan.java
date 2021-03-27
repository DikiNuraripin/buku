package com.example.buku;

import java.util.List;

public class Golongan {
    private int id;
    private List<Buku> buku;
    private String nama;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Buku> getBuku() {
        return buku;
    }

    public void setBuku(List<Buku> buku) {
        this.buku = buku;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
