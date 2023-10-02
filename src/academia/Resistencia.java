package academia;

public class Resistencia implements Metodos {
    public Corrida getCorrida() {
        return new MeioFundo();
    }
    
    public Musculacao getMusculacao() {
        return new Agachamento();
    }
}
