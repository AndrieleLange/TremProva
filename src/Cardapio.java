import java.util.ArrayList;

public class Cardapio {
   ArrayList<Pratos> pratos;

    public Cardapio() {
        pratos = new ArrayList<>();
    }

    public void cadastra(Pratos p){
        pratos.add(p);
    }

    public int qntdade(){
        return pratos.size();
    }

    @Override
    public String toString() {
        return " \n" + pratos + "\n";
    }

    


}
