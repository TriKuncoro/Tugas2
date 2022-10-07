package pbo;

class MainCarCleaning {
   public static void main(String [] args) {
      MakmurSentosa data = new MakmurSentosa();

      // clear screen console
      System.out.print('\u000C');
      System.out.println("--- Car Cleaning. Anda Pesan Kami Datang ---");
      System.out.println("============================================");
      System.out.println("");
      System.out.println("");

      // render content scanner
      data.dataPeserta();
      System.out.print("\n");
      data.jenisJasa();
      System.out.print("\n");
      data.teamPenyediaJasa();
      System.out.print("\n");
      data.keteranganPemesanan();
      System.out.print("\n");
      data.biayaPenyediaJasa();

      System.out.println("");
      System.out.println("");
      System.out.println("=======================================");
      System.out.println("Jasa yang di Pesan: " + data.tampilkanJenisJasa());
      System.out.println("Nama Penyedia Jasa: " + data.tampilkanPenyediaJasa());
      System.out.println("Keterangan: " + data.tampilkanKeterangan());
      System.out.println("");
      System.out.println("Total Biaya yang di Bayar Pemesanan Rp. " + data.jumlahkanBiayaJasa());
      System.out.println("");
      System.out.println("Salam Bersih " + data.namaPeserta() + " Terimakasih");
   }
}    

