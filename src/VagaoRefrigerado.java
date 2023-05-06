public class VagaoRefrigerado extends Vagao {
    private int temperatura;

    //toda a classe é a quastão 3

    public VagaoRefrigerado(String descricao, double capacidadeCarga, int temp) {
        super(descricao, capacidadeCarga);
        this.temperatura = temp;
    }

    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + "\n temperatura=" + temperatura;
    }
    
    
}
