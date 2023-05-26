public class Professor extends Pessoa{
    private String siape;

    public Professor (String nome, int idade, String siape){
        super(nome,idade);
        this.siape = siape;
    }

    public void apresentar(){
        super.apresentar();
        System.out.println("Siape: " + siape);
    }
    
}
