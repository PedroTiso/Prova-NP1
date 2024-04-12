import java.util.Random;

public class Camera {

    private int qualidade;

    public Camera(int qualidade){
        this.qualidade = qualidade;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int acharPecas(){
        return (int) ((Math.random() * 9) +1);
    }

}
