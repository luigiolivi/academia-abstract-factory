package academia;

public class Indicacoes {
    private Corrida corrida;
    private Musculacao musculacao;
    private Metodos metodos;

    public Indicacoes(Metodos metodos) {
        this.metodos = metodos;
    }
    
    public Corrida getExercicioCorrida() {
        return corrida;
    }

    public Musculacao getExercicioMusculacao() {
        return musculacao;
    }
    
    public void gerarMetodos()
    {
        corrida = metodos.getCorrida();
        musculacao = metodos.getMusculacao();
    }
 
    
    
}
