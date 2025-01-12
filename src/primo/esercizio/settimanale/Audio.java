package primo.esercizio.settimanale;

public class Audio implements Volume {

    protected int durata;
    protected int volume;
    String titolo;

    public Audio(int volume, int durata, String titolo){
        this.volume = volume;
        this.durata = durata;
        this.titolo = titolo;
    }

    public void play(){
        System.out.println("Stiamo caricando il tuo audio...");
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
        volume--;
    }

}
