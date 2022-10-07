package pbo;

import java.util.Scanner;

class CarCleaning {
    String nama, alamatRumah, notelp, email;
    int pilihJasa, pilihTeam;
    String keterangan, pesananJasa, PesananTeam;
    int biayaJasa, biayaAlat, biayaBahan, biayaTransportasi, totalBiaya;
    String pesananTeam;

   public void dataPeserta() {
     Scanner input = new Scanner(System.in);

     System.out.println("--------------------*-------------------");
     System.out.println("Masukan Data Pemesanan");
     System.out.print("Masukan Nama: ");
     this.nama = input.nextLine();

     System.out.print("Masukan Alamat: ");
     this.alamatRumah = input.nextLine();

     System.out.print("Masukan No.Telp:" );
     this.notelp = "+62" + input.nextLine();

     System.out.print("Masukan Email: ");
     this.email = input.nextLine();
   }

   public void jenisJasa() {
       System.out.println("Jenis Jasa");
       System.out.println("1. Cuci Mobil");
       System.out.println("2. Salon Mobil Interior");
       System.out.println("3. Salon Mobil Exterior");

       Scanner input = new Scanner(System.in);

       System.out.print("Pilih Jasa: ");
       this.pilihJasa = input.nextInt();

        switch (this.pilihJasa) {
            case 1:
                this.pesananJasa = "Cuci Mobil";
                break;
            case 2:
                this.pesananJasa = "Salon Mobil Interior";
                break;
            case 3:
                this.pesananJasa = "Salon Mobil Exterior";
                break;
            default:
                System.out.print("Jenis Jasa Tidak Tersedia");
                break;
        }
   }
   public void teamPenyediaJasa() {
       System.out.println("Team Penyedia Jasa");
       System.out.println("1. Team Sea (2 Orang)");
       System.out.println("2. Team Mountain (4 Orang)");
       System.out.println("3. Team Forest (5 Orang)");

      Scanner input = new Scanner(System.in);

       System.out.print("Pilih Jasa: ");
       this.pilihTeam = input.nextInt();

       if(this.pilihTeam == 1) {
          this.pesananTeam = "Team Sea (2 Orang)";
       } else if(this.pilihTeam == 2) {
          this.pesananTeam = "Team Mountain (4 Orang)";
       } else if(this.pilihTeam == 3) {
          this.pesananTeam = "Team Forest (5 Orang)";
       } else {
          System.out.print("Team Layanan Jasa Tidak Tersedia");
       }
   }

   public void keteranganPemesanan() {
    Scanner input = new Scanner(System.in);

    System.out.print("Berikan Keterangan Pemesanan: ");
    this.keterangan = input.nextLine();
  }

   public void biayaPenyediaJasa() {
     Scanner input = new Scanner(System.in);

     System.out.print("Masukan Biaya Penyedia Jasa Rp. ");
     this.biayaJasa = input.nextInt();

     System.out.print("Masukan Biaya Jasa Alat Rp. ");
     this.biayaAlat = input.nextInt();

     System.out.print("Masukan Biaya Bahan Jasa Rp. " );
     this.biayaBahan = input.nextInt();

     System.out.print("Masukan Biaya Transportasi Rp. ");
     this.biayaTransportasi = input.nextInt();

    System.out.println("--------------------*-------------------");
   }
}