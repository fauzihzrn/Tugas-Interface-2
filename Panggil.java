public class Panggil {
        public static void main (String[] args) {
        Daerah dr = new Daerah();
        
        dr.Shownegara();
        dr.Showibukota();
        dr.setProvinsi("Jawa Barat");
        System.out.println("Provinsi = " +dr.getProvinsi());
        dr.setKota("Bandung");
        System.out.println("Kota = " +dr.getKota());
        dr.Tropis("Iklim = " +"Tropis");
        dr.Benua("Benua = " +"Asia", "Tenggara");
    }

    
}
