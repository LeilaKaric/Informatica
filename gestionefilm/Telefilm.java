package gestionefilm;

public class Telefilm {
    private String nomeTelefilm;
    private String genereFilm;
    private boolean produzione;
    private Stagione[] stagioni;
    private int numStagioniInserite;

    public Telefilm(){
        this.nomeTelefilm = "";
        this.genereFilm = "";
        this.produzione = false;
        this.stagioni = new Stagione[10];
        this.numStagioniInserite = 0;

    }

    public Telefilm(String nomeTelefilm, String genereFilm, boolean produzione, int numStagioniInserite)throws Exception{
        setNomeFilm(nomeTelefilm);
        setGenereFilm(genereFilm);
        setProduzione(produzione);
        setNumStagioniInserite(numStagioniInserite);
    }

    public void setNomeFilm (String nomeTelefilm)throws Exception{
        if (!nomeTelefilm.isBlank()){
            this.nomeTelefilm = nomeTelefilm;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setGenereFilm (String genereFilm)throws Exception{
        if (!genereFilm.isBlank()){
            this.genereFilm = genereFilm;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public void setProduzione(boolean produzione){
        this.produzione = produzione;
    }

    public void setNumStagioniInserite (int numStagioniInserite)throws Exception{
        if (numStagioniInserite > 0){
            this.numStagioniInserite = numStagioniInserite;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public String getNomeFilm(){
        return this.nomeTelefilm;
    }

    public String getGenereFilm(){
        return this.genereFilm;
    }

    public boolean isProduzione(){
        return this.produzione;
    }

    public int getNumStagioni(){
        return this.numStagioniInserite;
    }

    // Calcolo numero medio di puntate per stagione
    public int calcoloMedioEpisodi(){
        if (numStagioniInserite == 0){
            return 0;
        }
        int sommaEpisodi = 0;
        for (int i = 0; i < numStagioniInserite; i++) {
            sommaEpisodi += stagioni[i].getEpisodi();
        }
        return sommaEpisodi / numStagioniInserite;
    }

    // Verifica la presenza di un determinato sceneggiatore in tutte le stagioni
    public boolean verificaSceneggiatore(String nomeSceneggiatore){
        for (int i = 0; i < numStagioniInserite; i++) {
            if (stagioni[i].getSceneggiatore().equals(nomeSceneggiatore)) {
                return true;
            }
        }
        return false;
    }

    // Ordina il vettore delle stagioni in base al numero delle stagioni in ordine crescente
    public void ordinaStagioni(){
        for (int i = 0; i < numStagioniInserite - 1; i++) {
            for (int j = 0; j < numStagioniInserite - i - 1; j++) {
                if (stagioni[j].getStagione() > stagioni[j + 1].getStagione()) {
                    Stagione temp = stagioni[j];
                    stagioni[j] = stagioni[j + 1];
                    stagioni[j + 1] = temp;
                }
            }
        }
    }

    @Override //sovrascritto
    public String toString(){
        String separatore = ",";
        return this.nomeTelefilm + separatore + this.genereFilm + separatore + this.produzione + separatore + this.stagioni;
    }
}
