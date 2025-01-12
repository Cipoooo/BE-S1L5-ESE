package primo.esercizio.settimanale;

public class Video implements Luminosita {

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

    public void play(){
        System.out.println("Stiamo caricando il tuo video...");
        for (int i = 0; i<= durata; i++){
            System.out.println(titolo + new String(new char[volume]).replace("\0","*" + "!"));
            //System.out.print( new String(new char[luminosita]).replace("\0","!");
        }
    }

    @Override
    public void aumentaLuminosita(){luminosita++;}

    @Override
    public void diminuisciLuminosita(){luminosita--;}
}
