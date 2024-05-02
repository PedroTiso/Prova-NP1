import java.util.Arrays;

public class Equipe {
    // Criação dos atributos da classe Equipe

    private Carro carro;
    private Piloto pilotos[] = new Piloto[5];
    private Piloto pilotoAtual;
    private String nome;

    // Criação do construtor da classe equipe
    public Equipe(String nome){
        this.nome = nome;
    }

    // Criação dos atributos da classe Equipe

    private boolean trocarPiloto(int pilotoId){
        for(int i = 0; i < pilotos.length; i++){
            if(pilotoId == pilotos[i].getId()){
                pilotoAtual = pilotos[i];
                return true;
            }
        }
         return false;
    }

    private boolean trocarPneu(int tipoDePneu){
        carro.setTipoDePneu(tipoDePneu);
        return true;
    }

    public void pitStop(int tipoDePneu, int pilotoId){
        trocarPneu(tipoDePneu);
        trocarPiloto(pilotoId);
    }

    public boolean adicionarPiloto(Piloto piloto){
        for(int i = 0; i < pilotos.length; i++){
            if(pilotos[i] == null){
                pilotos[i] = piloto;
                return true;
            }
        }
        return false;

    }

    public boolean retirarPiloto(int pilotoId){
        for(int i = 0; i < pilotos.length; i++){
            if(pilotoId == pilotos[i].getId()){
                pilotos[i] = null;
                return true;
            }
        }
        return false;
    }

    public void constroiCarro(int tipoDePneu, int potencia, boolean turbo){
        carro = new Carro(tipoDePneu, potencia, turbo);
    }

    @Override
    public String toString() {
        return "Equipe{" +
                "carro=" + carro +
                ", pilotos=" + Arrays.toString(pilotos) +
                ", pilotoAtual=" + pilotoAtual +
                ", nome='" + nome + '\'' +
                '}';
    }
}
