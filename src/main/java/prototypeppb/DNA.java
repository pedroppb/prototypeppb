package prototypeppb;

public class DNA  implements Cloneable {
    private String tipo;
    private int tentativa;

    public DNA(String tipo, Integer numero) {
        super();
        this.tipo = tipo;
        this.tentativa = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public String toString() {
        return "tentativa "+ tentativa+" tipo: "+tipo;
    }
}
