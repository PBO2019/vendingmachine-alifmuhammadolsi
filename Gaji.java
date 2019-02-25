package com.company;

public class Gaji {
    private int jumlah;

    public void gajian(int tarif){
        this.jumlah = 30 * tarif;
        System.out.println("Gaji anda perbulan sebesar Rp"+ jumlah);
    }
}
