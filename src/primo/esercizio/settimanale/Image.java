package primo.esercizio.settimanale;

public class Image implements Luminosita{

    protected int luminosita;
    String titolo;

    public Image(int luminosita, String titolo) {
        this.titolo = titolo;
        this.luminosita = luminosita;
    }
    public void show(){
        System.out.println("La tua immagine è:");
        System.out.print(titolo);
        for (int i = 0; i<1; i++){
          System.out.print( new String(new char[luminosita]).replace("\0","*"));
        }
    }

    @Override
    public void aumentaLuminosita(){luminosita++;}

    @Override
    public void diminuisciLuminosita(){luminosita--;}
}
