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

    public String tipo(Vagao v){
        if(this.equals(v)) {return "\nÉ um vagão refrigerado.\n";}
        else{
            return null;
        } 
    }

    @Override
    public String toString() {
        return super.toString() + " temperatura=" + temperatura + "\n";
    }
    
    
}
