package academia;

public class Velocidade implements Metodos {
    public Corrida getCorrida() {
        return new Sprint();
    }
    
    public Musculacao getMusculacao() {
        return new Deadlift();
    }
}
