    public class Gara{
        private ArrayList<Sciatore> sciatori;
        
        public Gara(){
            sciatori=new ArrayList<>();
            caricaDati();
        }
         try (BufferedReader br = new BufferedReader(new FileReader(nomeFile))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] dati = linea.split(",");
                String nome = dati[0];
                int tempoManche1 = Integer.parseInt(dati[1]);
                int tempoManche2 = Integer.parseInt(dati[2]);
                Sciatore sciatore = new Sciatore(nome, tempoManche1, tempoManche2);
                aggiungiSciatore(sciatore);
            }
        } catch (IOException e) {
            System.out.println("Errore durante la lettura del file: " + e.getMessage());
        }
        public String Vincitore(){
            int min=sciatori.get(0);
            int pos=0;
            for(int i=0;i<sciatori.size();i++){
                if(sciatori.gert(i).getTempototale()<min){
                    min=sciatori.gert(i).getTempototale;
                    pos=i;
                }
            }

        }
    }


    