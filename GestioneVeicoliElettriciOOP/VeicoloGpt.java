package autoLogicaGPT;

public abstract class VeicoloGpt {

    protected String idVeicolo;
    protected String tipoVeicolo;

    public String getTipoVeicolo() {
        return tipoVeicolo;
    }
    public static int contatore = 0;
    protected boolean attivo;
    protected int livelloBatteria;

    public VeicoloGpt(String id) {

        this.idVeicolo = String.format("%06d", contatore++);
        this.attivo = false;
        this.livelloBatteria = 0;

    }

    public void attivaVeicolo() {
        if (this.livelloBatteria > 20) {
            this.attivo = true;
        } else {
            this.attivo = false;
        }
    }
    
    public void ricaricaBatteria(int livello){
        livello = Math.abs(livello);
       
        if(livello + this.livelloBatteria > 100){
            this.livelloBatteria= 100;
        } else {
            this.livelloBatteria= livelloBatteria + livello;
        }
    }

    public String getIdVeicolo() {
        return idVeicolo;
    }

    public boolean isAttivo() {
        return attivo;
    }

    public int getLivelloBatteria() {
        return livelloBatteria;
    }

    public void setIdVeicolo(String idVeicolo) {
        this.idVeicolo = idVeicolo;
    }

    public void setTipoVeicolo(String tipoVeicolo) {
        this.tipoVeicolo = tipoVeicolo;
    }

    public void setAttivo(boolean attivo) {
        this.attivo = attivo;
    }

    public void setLivelloBatteria(int livelloBatteria) {
        this.livelloBatteria = livelloBatteria;
    }

    @Override
    public String toString() {
        return "VeicoloGpt{" + "idVeicolo=" + idVeicolo + ", attivo=" + attivo + ", livelloBatteria=" + livelloBatteria + '}';
    }
    
    

}
