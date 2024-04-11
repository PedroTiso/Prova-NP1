public class Empilhador extends Robo {
    private Pacote pacote[] = new Pacote[10];
    private int pesoMaximo;

    public Empilhador(int energia, String nome, int totalDeRobos, int pesoMaximo){
        super(energia, nome, totalDeRobos, pesoMaximo);
       for(int i = 0; i < pacote.length; i++){
           pacote[i] = new Pacote();
       }
    }

    public void adicionaPacote(int peso){
        for(int i = 0; i < pacote.length; i++){
            if(pacote[i].getPeso() == 0){
                pacote[i].setPeso(peso);
            }
        }
    }

    public void removePacote(int posicao){
        for(int i = 0; i < pacote.length; i++){
            if(i == posicao){
                pacote[i].setPeso(0);
                break;
            }
        }
    }

    public void mostraPacotes(){
        System.out.println("Mostrando os pacotes");
    }
}
