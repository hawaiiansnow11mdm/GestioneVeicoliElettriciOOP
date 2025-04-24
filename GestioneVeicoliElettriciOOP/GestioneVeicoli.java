
package autoLogicaGPT;

import java.util.ArrayList;

public class GestioneVeicoli {
   
    private ArrayList<VeicoloGpt> elencoVeicoli;
    
    public GestioneVeicoli(){
        elencoVeicoli = new ArrayList<VeicoloGpt>();
    }
    
    
    public boolean aggiungiVeicolo(VeicoloGpt veicolo){
        if(elencoVeicoli.contains(veicolo)){
            return false;
        }
        elencoVeicoli.add(veicolo);
        return true;
    }
    
    public ArrayList<VeicoloGpt> veicoliAttivi(){
        ArrayList<VeicoloGpt> elencoVeicoliAttivi = new ArrayList<VeicoloGpt>();
        for(VeicoloGpt veicolo : elencoVeicoli){
            if(veicolo.isAttivo()){
                elencoVeicoliAttivi.add(veicolo);
            }
        }
        return elencoVeicoliAttivi;
    }
    
    public ArrayList<VeicoloGpt> filtraPerTipo(String tipo){
        ArrayList<VeicoloGpt> elencoVeicoliTipo = new ArrayList<VeicoloGpt>();
        for(VeicoloGpt veicolo : elencoVeicoli){
            if(veicolo.getTipoVeicolo().equalsIgnoreCase(tipo)){
                elencoVeicoliTipo.add(veicolo);
            }
        }
        return elencoVeicoliTipo;
    }
    
    public void ricaricaVeicoliBassoLivello(int livello){
        for(VeicoloGpt veicolo : elencoVeicoli){
            if(veicolo.getLivelloBatteria() < 25){
                veicolo.ricaricaBatteria(livello);
            }
        }
    }
}
