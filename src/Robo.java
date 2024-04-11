public class Robo {

    // Criando os atributos do Robo
    private int energia;
    private String nome;
    private int totalDeRobos;
    private int energiaMaxima;

    // Criando o construtor da classe robo
    public Robo(int energia, String nome, int totalDeRobos, int energiaMaxima){
        this.energia = energia;
        this.nome = nome;
        this.totalDeRobos = totalDeRobos;
        this.energiaMaxima = energiaMaxima;
    }

    // Criando os métodos getters e setters da classe mãe Robo

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalDeRobos() {
        return totalDeRobos;
    }

    public void setTotalDeRobos(int totalDeRobos) {
        this.totalDeRobos = totalDeRobos;
    }

    public int getEnergiaMaxima() {
        return energiaMaxima;
    }

    public void setEnergiaMaxima(int energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    // Criando os metodos da classe mae robo

    public void trabalhar(){
        int novaEnergia;
        novaEnergia = getEnergia() - 5;
        System.out.println("O robo fez um trabalho, sua vida reduziu!!!");
    }

    public void trocarEnergia(Robo roboAlvo){
        int trocarEnergia;
        if(roboAlvo.getEnergia() > 0){
            trocarEnergia = roboAlvo.getEnergia() - this.energia;
            System.out.println("A energia do robo foi trocada!!!");
        }

    }

    public void recarregar(int horas){
        int recarregar;
        if(horas < this.energiaMaxima){
            recarregar = getEnergia() + 10;
            System.out.println("A energia foi recarregada");
        } else{
            System.out.println("Impossível recarregar");
        }
    }
}
