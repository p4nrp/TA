package core;

import java.util.Scanner;
public class Films extends FIlm
{
    public Scanner input = new Scanner(System.in);



    public void addFilm(){
        System.out.println("====================================================================");
        input.nextLine();
        System.out.print("Masukkan nama Film : ");
        String namaFilm = input.nextLine();

        System.out.print("Masukkan Jam Tayang : ");
        String jamTayang = input.nextLine();

        System.out.print("Masukkan Nomor Kursi : ");
        String namaKursi = input.nextLine();



        Namafilm.add(namaFilm);
        Jamtayang.add(jamTayang);
        Nomorkursi.add(namaKursi);

    }

    public void editFilm(){
        System.out.println("====================================================================");
        System.out.print("Masukkan nomor yang diedit : ");
        int nomor = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan nama Film : ");
        String namaFilm = input.nextLine();
        System.out.print("Masukkan Jam Tayang : ");
        String jamTayang = input.nextLine();
        System.out.print("Masukkan Nomor Kursi :");
        String namaKursi = input.nextLine();

        Namafilm.set(nomor,namaFilm);
        Jamtayang.set(nomor,jamTayang);
        Nomorkursi.set(nomor, namaKursi);
    }

    public void removeFilm(){
        System.out.println("====================================================================");
        System.out.print("Masukkan nomor yang dihapus : ");
        int nomor = input.nextInt();

        Namafilm.remove(nomor);
        Jamtayang.remove(nomor);
        Nomorkursi.remove(nomor);
    }

    public void tampilkanFilm(){
        for (int i = 0 ; i < Namafilm.size() ; i++){
            System.out.println("====================================================================");
            System.out.println(Namafilm.get(i) + "    " + Jamtayang.get(i) + "  " + Nomorkursi.get(i));
            System.out.println("====================================================================");
        }
    }
}
