public class VagaoRestaurante extends Vagao{
    private Cardapio cardapio;

    public VagaoRestaurante(String descricao, int capacidadeCarga, Cardapio cardapio){
        super(descricao, capacidadeCarga);
        this.cardapio = cardapio;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    @Override
    public String toString() {
        return super.toString() +
         "\n cardapio: " + cardapio;
    }

    

    
}
