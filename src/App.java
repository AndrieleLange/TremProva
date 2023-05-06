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

    }
}
