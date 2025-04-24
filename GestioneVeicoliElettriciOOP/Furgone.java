
package autoLogicaGPT;


public class Furgone extends VeicoloGpt {
    
    protected int capacitaCarico;
    protected int capacitaImpegnata;
    
    public Furgone(String id, int capacitaCarico){
        super(id);
        
        if (capacitaCarico > 1000 ){
            this.capacitaCarico = 1000;
        } else if (capacitaCarico < 0 ){
            this.capacitaCarico = Math.abs(capacitaCarico);
        } else {
            this.capacitaCarico= capacitaCarico;
        }
        
        this.capacitaImpegnata = 0;
    }
    
    public void caricaMerce(int peso){
        peso = Math.abs(peso);
        if(capacitaImpegnata + peso < capacitaCarico && attivo ){
            this.capacitaImpegnata = capacitaImpegnata + 1000; 
        }
        System.out.println("Peso massimo raggiunto, impossibile caricare");
    }

    public int getCapacitaCarico() {
        return capacitaCarico;
    }

    public void setCapacitaCarico(int capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }

    public int getCapacitaImpegnata() {
        return capacitaImpegnata;
    }

    public void setCapacitaImpegnata(int capacitaImpegnata) {
        this.capacitaImpegnata = capacitaImpegnata;
    }
    
    @Override
    public boolean equals (Object o){
        if(o == null || (!(o instanceof Furgone))){
            return false;
        }
        Furgone oFurgone = (Furgone) o;
        return this.idVeicolo.equals(oFurgone.idVeicolo);
    }
    
}
