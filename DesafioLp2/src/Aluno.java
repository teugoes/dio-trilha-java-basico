public class Aluno extends Pessoa{
    private String matricula;

    public Aluno (String nome, int idade, String matricula){
        super(nome,idade);
        this.matricula = matricula;
    }

    public void apresentar(){
        super.apresentar();
        System.out.println("Matricula: " + matricula);
    }
    
}
