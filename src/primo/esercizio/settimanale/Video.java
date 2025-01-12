package primo.esercizio.settimanale;

public class Video extends PlayerMultimediale implements Volume, Luminosita,Riproducibile {

    protected int luminosita;
    protected int durata;
    protected int volume;
    String titolo;

    public Video(int volume, int luminosita, int durata, String titolo){
          this.volume = volume;
          this.luminosita = luminosita;
          this.durata = durata;
          this.titolo = titolo;
    }

    @Override
    public void esegui(){
        play();
    }

    public void play(){
        System.out.println("Stiamo caricando il tuo video...");
        for (int i = 0; i<= durata; i++){
            System.out.println(titolo + " " + "*".repeat(luminosita) + "!".repeat(volume)  );
        }
    }
    @Override
    public void aumentaLuminosita(){luminosita++;}

    @Override
    public void diminuisciLuminosita(){luminosita--;}

    @Override
    public void alzaVolume(){volume++;}

    @Override
    public void abbassaVolume(){
        if (volume > 0) {
            volume--;
        }}
}
