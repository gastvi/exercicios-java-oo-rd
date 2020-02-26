package exercicio02;

public class AuxiliarEscritorio {

    String nome;
    float salario;

    public AuxiliarEscritorio(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void salarioAnualAuxiliarEscritorio(int bonus){

        salario = salario * 13 *  bonus;
    }


}
