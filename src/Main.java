import primo.esercizio.settimanale.Audio;
import primo.esercizio.settimanale.Image;
import primo.esercizio.settimanale.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale elemento vuole riprodurre? DIgitare 1 per vedere un immagine, 2 per un Video e 3 Per una registrazione Audio ");
        int scelta = scanner.nextInt();
        String inutile = scanner.nextLine();
        System.out.println("Digitare un titolo per l' elemento da lei scelto");
        String titolo = scanner.nextLine();

        switch (scelta){
            case 1:
                if (!titolo.isEmpty()){
                    System.out.println("Digitare un numero compreso tra 1 e 10 per indicare il valore della luminosità desiderata");
                    int lum = scanner.nextInt();
                    if (lum >0 && lum<=10){
                        Image immagine = new Image(lum,titolo);
                        immagine.show();
                    }else{System.out.println("Per favore digitare un numero compreso tra 0 e 10");}
                }else {System.out.println("Per favore inserire un titolo");}
                break;

            case 2:
                if (!titolo.isEmpty()){
                    System.out.println("Digitare la durata del video desiderato:");
                    int durata = scanner.nextInt();
                    System.out.println("Digitare la luminosità del video desiderato:");
                    int lum = scanner.nextInt();
                    System.out.println("Digitare il volume del video desiderato:");
                    int volume = scanner.nextInt();
                    if ( durata >0 && volume>0 && volume<=100 && lum>0 && lum <=10){
                        Video vid = new Video( volume, lum, durata, titolo);
                        vid.play();
                    }else {System.out.println("Qualcosa è andato storto, ritenta");}
                }else {System.out.println("Per favore inserire un titolo");}
                break;

            case 3:
                if (!titolo.isEmpty()){
                    System.out.println("Digitare la durata del video desiderato:");
                    int durata = scanner.nextInt();
                    System.out.println("Digitare il volume del video desiderato:");
                    int volume = scanner.nextInt();
                    if ( durata >0 && volume>0 && volume<=100){
                        Audio audio = new Audio( volume, durata, titolo);
                        audio.play();
                    }else {System.out.println("Qualcosa è andato storto, ritenta");}
                }else {System.out.println("Per favore inserire un titolo");}
                break;
            default:
                System.out.println("Qualcosa è andato storto, ritenta controllando di aver inserito tutti i parametri corretti");
        }
    }
}