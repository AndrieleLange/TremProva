public class Vagao{
    private int identificador; 
    private String descricao;
    private double capacidadeCarga;
    private static int proxIdent = 1;

    public Vagao(String descricao, double capacidadeCarga) {
        this.identificador = proxIdent;
        this.descricao = descricao;
        this.capacidadeCarga = capacidadeCarga;
        proxIdent = proxIdent + 1;
    }

    //questão 1
    public Vagao(){
        this.identificador = proxIdent;
        this.descricao = "Não informado";
        this.capacidadeCarga = 5000;
        proxIdent = proxIdent + 1;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    //questão 2
    public static int getProxIdent(){
        return proxIdent;
    }

    @Override
    public String toString() {
        return "\n Vagao\n identificador=" + identificador + "\n descricao=" + descricao + "\n capacidadeCarga="
                + capacidadeCarga;
    }

    /**
     * public void setTrem(int id){
     * this.trem = id;
     * }
     */

     

}