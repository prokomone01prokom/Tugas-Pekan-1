/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author ASUS
 */
public class coba1 {
    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ardy Sendleep
 */
public static void main(String[] args) {
   
    DataInputStream in = new DataInputStream (System.in);

   
   
        String modalAwal = null;
        String tktbunga = null;
       

        try {
            System.out.print("Masukkan jumlah modal awal anda (Rp) : ");
            modalAwal = in.readLine();

            System.out.print("Masukkan tingkat bunga : ");
            tktbunga = in.readLine();

       

        } catch(IOException ioe) {
            System.out.println();
        }

        double ModalAwal;
        double bunga;
        double waktu = 1;
        double ModalAkhir;

   
        ModalAwal = Double.parseDouble(modalAwal);
        bunga = Double.parseDouble(tktbunga);
       
        ModalAkhir = (ModalAwal *(1 + waktu * bunga));
        waktu = ModalAwal + ModalAkhir;
        System.out.println("Modal Akhir : " + ModalAkhir);
       
        
    }
}


