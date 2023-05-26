public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("Andreia", 47);
        Aluno aluno1 = new Aluno("Livia Zoey", 23,"2020345443");
        Professor professor1 = new Professor("Cassandro", 38, "200298");

        pessoa1.apresentar();
        System.out.println();
        aluno1.apresentar();
        System.out.println();
        professor1.apresentar();
    }
}
