public class Carro {

    // Atributos da classe Carro
    private Motor motor;
    private int tipoDePneu;

    // Construtor da classe Carro
    public Carro(int tipoDePneu, int potencia, boolean turbo){
        this.tipoDePneu = tipoDePneu;
        this.motor = new Motor(potencia, turbo);
        }

        public void carro(){
            System.out.println("correndo");
        }

    public void setTipoDePneu(int tipoDePneu) {
        this.tipoDePneu = tipoDePneu;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor=" + motor +
                ", tipoDePneu=" + tipoDePneu +
                '}';
    }

    public void correr() {
    }
}


