package academia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Informe 1-Resistência ou 2-Velocidade");
          byte opc = sc.nextByte();
          
          Metodos metodos = null;
          switch (opc) {
            case 1: metodos = new Resistencia(); break;
            case 2: metodos = new Velocidade(); break;
          }
          
          Indicacoes indicacao = new Indicacoes(metodos);
          indicacao.gerarMetodos();
          
          System.out.println("Resistência: " + indicacao.getExercicioCorrida().toString());
          System.out.println("Velocidade: " + indicacao.getExercicioMusculacao().toString());
    }    
}
