public class Piloto {

    // Criação dos atributos da classe Piloto
    private String nome;
    private int idade;
    private String nacionalidade;
    private static int idGeral = 0;
    private int id;

    // Criação do construtor da classe piloto

    public Piloto(String nome, int idade, String nacionalidade){
        this.nome = nome;
        this.idade = idade;
        this .nacionalidade = nacionalidade;
        idGeral++;
        id = idGeral;
    }

    // Metodo correr
    public void correr(Carro carro){
        carro.correr();
        System.out.println("Correndo");
    }

    // Metodo get para o atributo id

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", id=" + id +
                '}';
    }
}
