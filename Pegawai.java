package com.company;

public class Pegawai{
    protected int tarif;

    public static void main (String[] args){
        Staff staff = new Staff();
        Supervisor supervisor = new Supervisor();
        Gaji gaji = new Gaji();

        gaji.gajian(supervisor.tarif);
        gaji.gajian(staff.tarif);
    }
}

