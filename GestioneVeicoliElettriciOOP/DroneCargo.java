
package autoLogicaGPT;


public class DroneCargo extends VeicoloGpt{
    
    private int quotaMassima;
    private int quotaAttuale;
    
    public DroneCargo(String id, int quota){
        super(id);
        
        if(quota > 30){
            this.quotaMassima= 30;
        } else if (quota < 0){
            this.quotaMassima = 0;
        } else {
            this.quotaMassima= quota;
        }
        this.quotaAttuale= 0;
    }
    
    public void vaiAQuota (int nuovaQuota){
        nuovaQuota = Math.abs(nuovaQuota);
        if(livelloBatteria > 40 && attivo && nuovaQuota >= 0 && nuovaQuota <= 30){
            this.quotaAttuale = nuovaQuota;
        }
        System.out.println("Impossibile raggiungere quota");
    }

    public int getQuotaMassima() {
        return quotaMassima;
    }

    public void setQuotaMassima(int quotaMassima) {
        this.quotaMassima = quotaMassima;
    }

    public int getQuotaAttuale() {
        return quotaAttuale;
    }

    public void setQuotaAttuale(int quotaAttuale) {
        this.quotaAttuale = quotaAttuale;
    }
    
    @Override
    public boolean equals (Object o){
        if ( o == null || (!(o instanceof DroneCargo))){
            return false;
        }
        DroneCargo oDroneCargo = (DroneCargo) o ;
        return this.idVeicolo.equals(oDroneCargo.idVeicolo);
    }
    
}
