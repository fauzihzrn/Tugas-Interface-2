public abstract class Negara implements Stateinterface {
    
    protected String negara;
    protected String ibukota;
	
    protected String getNegara() {
        return this.negara;
        
    }
    
    protected String getIbukota() {
        return this.ibukota;
        
    }
    public void setNegara(String negara) {
      this.negara= negara;  
        
    }
    
    public void setIbukota(String ibukota) {
        this.ibukota= ibukota;
    }
    
    protected abstract void Shownegara();
    protected abstract void Showibukota();
    
	
}