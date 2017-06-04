public class Daerah extends Negara  {
 
    private String Provinsi ;
    private String Kota;
   
    public void setProvinsi(String prov){
        this.Provinsi= prov;
    }
    public void setKota(String kt){
        this.Kota = kt;        
    }
    public String getProvinsi(){
        return this.Provinsi;
    }
    public String getKota(){
        return this.Kota;
    }    

    
    @Override
    protected void Shownegara() {
     super.setNegara("Indonesia"); 
     System.out.println("Negara = " +super.getNegara());
    }

    @Override
    protected void Showibukota() {
       super.setIbukota("Jakarta"); 
     System.out.println("Ibukota = " +super.getIbukota());
    }
    public void Tropis(String trop) {
		System.out.println(trop);
}
    public void Benua(String asiaA, String asiaB) {
		System.out.println(asiaA + asiaB);
}

    
}
