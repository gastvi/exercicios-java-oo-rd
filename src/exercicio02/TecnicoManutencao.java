package exercicio02;

public class TecnicoManutencao {

    String nome;
    double salario;
    double bonus;
    double insalubridadeMensal;

    public TecnicoManutencao(String nome, double salario, double bonus, double insalubridadeMensal) {
        this.nome = nome;
        this.salario = salario;
        this.bonus = bonus;
        this.insalubridadeMensal = insalubridadeMensal;
    }

    public void salarioAnualTecnicoManutencao(double insalubridade, double bonus){

        salario = salario * 13 * insalubridade * bonus;
    }

}
