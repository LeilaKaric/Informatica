package gestionefilm;

public class CollezioneTelefilm {
    private Telefilm[] telefilm;
    private int numTelefilmInseriti;

    // Costruttore default
    public CollezioneTelefilm(){
        this.numTelefilmInseriti = 0;
    }

    // Costruttore con parametri
    public CollezioneTelefilm(int numTelefilmInseriti)throws Exception{
        setNumTelefilmInseriti(numTelefilmInseriti);
        this.telefilm = new Telefilm[50];
    }

    public void setNumTelefilmInseriti(int numTelefilmInseriti)throws Exception{
        if (numTelefilmInseriti >= 0){
            this.numTelefilmInseriti = numTelefilmInseriti;
        }
        else{
            throw new Exception("Valore non valido");
        }
    }

    public int getNumTelefilmInseriti(){
        return this.numTelefilmInseriti;
    }

    public void setTelefilm(Telefilm telefilm)throws Exception{
        if (telefilm != null){
            this.telefilm = telefilm;
        }
        else(Exception e){
            throw new Exception("Valore non valido");
        }
    }

    // Metodo per aggiungere un telefilm alla collezione
    public void aggiungiTelefilm(Telefilm telefilm){

    }

    // Ordina il vettore dei telefilm in base al nome
    public void ordinaTelefilmPerNome(){
        for (int i = 0; i < numTelefilmInseriti - 1; i++) {
            for (int j = 0; j < numTelefilmInseriti - i - 1; j++) {
                if (telefilm[j].getNomeFilm().compareTo(telefilm[j + 1].getNomeFilm()) > 0) {
                    // Scambia i telefilm
                    Telefilm temp = telefilm[j];
                    telefilm[j] = telefilm[j + 1];
                    telefilm[j + 1] = temp;
                }
            }
        }
    }

    @Override 
    public String toString(){
        for (int i = 0; i < numTelefilmInseriti; i++) {
            System.out.println(telefilm[i].toString());
        }
        return "";
    }

}
