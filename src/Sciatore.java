public class Sciatore implements Comparable<Sciatore> {
    private String nome;
    private int tempoManche1;
    private int tempoManche2;

    public Sciatore(String nome, int tempoManche1, int tempoManche2) {
        this.nome = nome;
        this.tempoManche1 = tempoManche1;
        this.tempoManche2 = tempoManche2;
    }

    public int getTempoTotale() {
        return tempoManche1 + tempoManche2;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Sciatore s) {
        return this.getTempoTotale() - s.getTempoTotale();
    }

    @Override
    public String toString() {
        int m = getTempoTotale() / 60;
        int sec = getTempoTotale() % 60;
        return nome + " " + String.format("%02d:%02d", m, sec);
    }
}
