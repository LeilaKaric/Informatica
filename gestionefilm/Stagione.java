package gestionefilm;

public class Stagione {

    private int numEpisodi;
    private String nomeSceneggiatore;
    private String trama;
    private int numStagione;

    public Stagione(int numEpisodi, String nomeSceneggiatore, String trama, int numStagione)throws Exception{
        try {
            setEpisodio(numEpisodi);
            setStagione(numStagione);
            setTrama(trama);
            setnomeSceneggiatore(nomeSceneggiatore);
        } catch (Exception e) {
            throw new Exception("Errore: ");
        }
    }

    public void setEpisodio (int numEpisodi)throws Exception{
        if (numEpisodi > 0){
            this.numEpisodi = numEpisodi;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setnomeSceneggiatore (String nomeSceneggiatore)throws Exception{
        if (!nomeSceneggiatore.isBlank()){
            this.nomeSceneggiatore = nomeSceneggiatore;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setTrama (String trama)throws Exception{
        if (!trama.isBlank()){
            this.trama = trama;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setStagione (int numStagione)throws Exception{
        if (numStagione > 0){
            this.numStagione = numStagione;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public int getEpisodi(){
        return this.numEpisodi;
    }

    public String getSceneggiatore(){
        return this.nomeSceneggiatore;
    }

    public String getTrama(){
        return this.trama;
    }

    public int getStagione(){
        return this.numStagione;
    }

    @Override //sovrascritto
    public String toString(){
        String separatore = ",";
        return this.numEpisodi + separatore + this.nomeSceneggiatore + separatore + this.trama + separatore + this.numStagione;
    }
}
