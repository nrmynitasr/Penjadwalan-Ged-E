package tubespbo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User-5
 */
public class Kelas {
    private int jam_mulai,jam_selesai;
    private String nama,kd_ruang,tgl_pinjam;
    
    public Kelas(String nama, String kd_ruang, String tgl_pinjam,int jam_mulai,int jam_selesai){
        this.nama=nama;
        this.kd_ruang=kd_ruang;
        this.tgl_pinjam=tgl_pinjam;
        this.jam_mulai=jam_mulai;
        this.jam_selesai=jam_selesai;
    }
    
    public String getnama(){
        return nama;
    }
    public String getkd_ruang(){
        return kd_ruang;
    }
    public String gettgl_pinjam(){
        return tgl_pinjam;
    }
    public int getjam_mulai(){
        return jam_mulai;
    }
    public int getjam_selesai(){
        return jam_selesai;
    }
}
