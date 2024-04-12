public class BracoArticulado extends Robo {

    private int numeroDeArticulacoes;
    private Garra garra;
    private Camera camera;
    public BracoArticulado(int energia, String nome, int totalDeRobos, int energiaMaxima, int numeroDeArticulacoes){
        super(energia, nome, totalDeRobos, energiaMaxima);
        this.numeroDeArticulacoes = numeroDeArticulacoes;
        garra = new Garra();
    }

    public int getNumeroDeArticulacoes() {
        return numeroDeArticulacoes;
    }

    public void setNumeroDeArticulacoes(int numeroDeArticulacoes) {
        this.numeroDeArticulacoes = numeroDeArticulacoes;
    }

    public Garra getGarra() {
        return garra;
    }

    public void setGarra(Garra garra) {
        this.garra = garra;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public void trabalhar(){
        if(camera.getQualidade() != 0){
            int peca = camera.acharPecas();
            garra.agarrarPeca();
        } else{
            garra.agarrarPeca();
        }

    }

}

