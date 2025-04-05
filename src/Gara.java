import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Gara {
    private ArrayList<Sciatore> sciatori;

    public Gara() {
        sciatori = new ArrayList<>();
        caricaDati();
    }

    public void caricaDati() {
        try {
            File file = new File("manche.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String riga = scanner.nextLine();
                String[] dati = riga.split(",");

                Sciatore s = new Sciatore(dati[0], Integer.parseInt(dati[1]), Integer.parseInt(dati[2]));
                sciatori.add(s);
            }

            scanner.close();
        } catch (IOException IoE) {
            System.out.println("File non trovato: " + IoE.getMessage());
        }
    }

    public String Vincitore() {
        int min = sciatori.get(0).getTempoTotale();
        int pos = 0;
        for (int i = 1; i < sciatori.size(); i++) {
            if (sciatori.get(i).getTempoTotale() < min) {
                min = sciatori.get(i).getTempoTotale();
                pos = i;
            }
        }
        return sciatori.get(pos).getNome();
    }
    public void classifica(){
        //ordina la lista degli sciatori
        Collections.sort(sciatori);
        //stampa classifica
        for (Sciatore s: sciatori) {
            System.out.println(s);
        }
    }
}
