package autoLogicaGPT;

public class Auto extends VeicoloGpt {

    private int numPasseggeri;
    private int postiOccupati;

    public Auto(String id, int maxPasseggeri) {
        super(id);

        if (maxPasseggeri > 5) {
            this.numPasseggeri = 5;
        } else if (maxPasseggeri < 0) {
            this.numPasseggeri = Math.abs(maxPasseggeri);
        } else {
            this.numPasseggeri = maxPasseggeri;
        }
        this.postiOccupati = 0;
    }

    public int getNumPasseggeri() {
        return numPasseggeri;
    }

    public void setNumPasseggeri(int numPasseggeri) {
        this.numPasseggeri = numPasseggeri;
    }

    public void prenotaPosta() {
        if (this.postiOccupati < 5 && attivo == true) {
            this.postiOccupati = postiOccupati + 1;
        } else {
        System.out.println("Posti tutti occupati");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || (!(o instanceof Auto))) {
            return false;
        }
        Auto oAuto = (Auto) o;
        return this.idVeicolo.equals(oAuto.idVeicolo);
    }

}
