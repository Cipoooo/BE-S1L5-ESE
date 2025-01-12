import primo.esercizio.settimanale.Audio;
import primo.esercizio.settimanale.Image;
import primo.esercizio.settimanale.PlayerMultimediale;
import primo.esercizio.settimanale.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Codice per la creazione dei vari oggetti, tutto il progetto, manca ultimo punto
        *
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quale elemento vuole creare? DIgitare 1 per creare un immagine, 2 per un Video e 3 Per una registrazione Audio ");
        int scelta = scanner.nextInt();
        String ponte = scanner.nextLine();
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

        * */

        //PROGETTO COMPLETO:

        Scanner scanner = new Scanner(System.in);
        PlayerMultimediale[] element = new PlayerMultimediale[5];

            for (int i = 0; i<5; i++){
                System.out.println("Quale elemento desideri creare? Digita 1 se desideri creare un immagine, due per un video o 3 per una registrazione aduio: ");
                int scelta = scanner.nextInt();
                System.out.println();
                scanner.nextLine();
                System.out.println("Digitare un titolo per l' elemento da lei scelto: ");
                String titolo = scanner.nextLine();
                System.out.println("Digitare una durata, se applicabile, per l' elemento da lei scelto (Video o Audio): ");
                int durata = scanner.nextInt();
                System.out.println();
                System.out.println("Digitare il volume, se applicabile, per l' elemento da lei scelto (Video o Audio): ");
                int volume = scanner.nextInt();
                System.out.println();
                System.out.println("Digitare una luminosità, se applicabile, per l' elemento da lei scelto (Immagine o Video): ");
                int luminosita = scanner.nextInt();
                System.out.println();
                scanner.nextLine();

                if (scelta == 1){
                    element[i] = new Image(luminosita,titolo);
                }else if(scelta == 2){
                    element[i] = new Video(volume, luminosita,durata,titolo);
                } else if (scelta == 3) {
                    element[i] = new Audio(volume, durata, titolo);
                }
            }
            while (true){
                System.out.println("Scegli un numero tra 1 e 5 per eseguire un elemento o 0 per fermare la riproduzione: ");
                int elementoScelto = scanner.nextInt();

                if (elementoScelto == 0){
                    break;
                }else if(elementoScelto >=1 && elementoScelto<=5){
                    element[elementoScelto-1].esegui();
                }else {System.out.println("Scelta non valida, per favore inserire un numero adeguato");}
            }


        }

    }
