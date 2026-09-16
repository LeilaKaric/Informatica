package gestionefilm;

public class Stagione {

    private int numEpisodi;
    private String nomeSceneggiatore;
    private String trama;
    private int numStagione;

    public Stagione{

    }

    public void setEpisodio (int numEpisodi){
        if (numEpisodi > 0){
            this.numEpisodi = numEpisodi;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setnomeSceneggiatore (String nomeSceneggiatore){
        if (!nomeSceneggiatore.isBlank()){
            this.nomeSceneggiatore = nomeSceneggiatore;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setTrama (String trama){
        if (!trama.isBlank()){
            this.trama = trama;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setStagione (int numStagione){
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

    public String getSceneggiatore 
}
