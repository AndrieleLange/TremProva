import java.util.ArrayList;

public class CadastroVagoes {
    private ArrayList<Vagao> vagoes;

    public CadastroVagoes() {
        vagoes = new ArrayList<>();
    }

    public void cadastra(Vagao v){
        vagoes.add(v);
    }

    public int qntdade(){
        return vagoes.size();
    }

    public Vagao getPorPosicao(int pos){
        if(pos>=0 && pos<vagoes.size()){
            return vagoes.get(pos);
        }
        else{return null;}
    }

    public Vagao getPorId(int id){
        for (Vagao vagao : vagoes) {
            if(vagao.getIdentificador() == id){
                return vagao;
            }
        }
        return null;
    }

    //questão 4
    public ArrayList<Vagao> getVagoesPorPeso(int peso){
        ArrayList<Vagao> peloPesox = new ArrayList<>();
        for (Vagao v : vagoes) {
            if (v.getCapacidadeCarga() >= peso) {
                peloPesox.add(v);
            }            
        }
        return peloPesox;
    }
    
}
