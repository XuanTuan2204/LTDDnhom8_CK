package com.example.nhom8_ltdd_ck;

public class Datve_data {
    public String Noidi;
    public String Noive;
    public String Timestart;
    public String Timeend;
    public String Gia;
    public byte[] Image;

    public Datve_data(String Noidi, String Noive, String Timestart, String Timeend, String Gia, byte[] Image) {
        this.Noidi = Noidi;
        this.Noive = Noive;
        this.Gia = Gia;
        this.Timeend = Timeend;
        this.Image = Image;
        this.Timestart = Timestart;
    }
}
