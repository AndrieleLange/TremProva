import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Vagao a = new Vagao();

        System.out.println(a.toString());

        Vagao b = new Vagao("Vagão para transporte de lã", 3000);

        System.out.println("\n O próximo número identificador de vagões é: " + b.getProxIdent());

        VagaoRefrigerado c = new VagaoRefrigerado("Vagao para transporte de frios", 4050, -10);

        CadastroVagoes vagoes = new CadastroVagoes();
        vagoes.cadastra(a);
        vagoes.cadastra(b);
        vagoes.cadastra(c);

        System.out.println("\nVagoes que podem levar acima de 3000 kg : \n" + vagoes.getVagoesPorPeso(3000));

        Cardapio cardapioV2 = new Cardapio();

        Pratos prato1 = new Pratos("Hamburguer simples", 30.50, "pão de gergelim, carne, alface, tomate e queijo cheddar");
        cardapioV2.cadastra(prato1);

        System.out.println(cardapioV2);

        VagaoRestaurante restA = new VagaoRestaurante("restaurante com capacidade para 20 pessoas", 20, cardapioV2);
        vagoes.cadastra(restA);

        System.out.println(vagoes.toString());


        //questão 6
        //ta funcionando
        //vinicius me explicou mas acho que ele não fez assim 
        System.out.println(restA.tipo(restA));
        System.out.println(a.tipo(a));

        ArrayList<Vagao> vPorPeso = vagoes.getVagoesPorPeso(500);

        Collections.sort(vPorPeso, Comparator.comparing(Vagao::getDescricao));

        for (Vagao v : vPorPeso) {
            System.out.println(v.toString());
        }


    }
}
