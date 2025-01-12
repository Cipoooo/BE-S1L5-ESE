package primo.esercizio.settimanale;

public class Audio extends PlayerMultimediale implements Volume,Riproducibile {

    protected int durata;
    protected int volume;
    String titolo;

    public Audio(int volume, int durata, String titolo){
        this.volume = volume;
        this.durata = durata;
        this.titolo = titolo;
    }


    @Override
    public void esegui(){
        play();
    }

    public void play(){
        System.out.println("Stiamo caricando il tuo audio...");
        System.out.println();
        for (int i = 0; i<= durata; i++){
            System.out.println(titolo + new String(new char[volume]).replace("\0","!"));
        }
    }

    @Override
    public void alzaVolume(){
        volume++;
    }
    @Override
    public void abbassaVolume(){
        if (volume>0){
            volume--;
        }
    }

}
