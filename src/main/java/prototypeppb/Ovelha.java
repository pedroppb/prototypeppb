package prototypeppb;

public class Ovelha implements Cloneable {

        private String nome;
        private DNA dna;
    public Ovelha( String nome,DNA dna) {
        this.nome = nome;
        this.dna = dna;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DNA getDna() {
        return dna;
    }

    public void setDna(DNA dna) {
        this.dna = dna;
    }

    @Override
    public Ovelha clone() throws CloneNotSupportedException {
        Ovelha ovelhaClone = (Ovelha) super.clone();
        ovelhaClone.dna = (DNA) ovelhaClone.dna.clone();
        return ovelhaClone;
    }

    @Override
    public String toString() {
        return "ovelha:" + nome+"\n"+dna;
    }
}
