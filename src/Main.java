import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float precoGasolina, custoParaAbastecer, conversaoEmLitrosGasolina, conversaoEmLitrosEtanol, precoEtanol;
        int opcao;


            System.out.println("Valor do Abastecimento: ");
            custoParaAbastecer = leia.nextFloat();

            System.out.println("Valor do litro de Gasolina: ");
            precoGasolina = leia.nextFloat();

            System.out.println("Valor do litro de Etanol: ");
            precoEtanol = leia.nextFloat();

            conversaoEmLitrosGasolina = custoParaAbastecer / precoGasolina;
            conversaoEmLitrosEtanol = custoParaAbastecer / precoEtanol;

            System.out.println("Escolha a opção de carro: ");
            System.out.println("1. Gol 1.0 2020");
            System.out.println("2. Gol 1.6 2020");
            System.out.println("3. Jetta Comfortline 2.0 2020");

            opcao = leia.nextInt();

            if (opcao == 1) {
                Gol1000 gol1000 = Fabrica.getGol1000();
                gol1000.setEntradaEtanol(conversaoEmLitrosEtanol);
                gol1000.setEntradaGasolina(conversaoEmLitrosGasolina);

                Painel painel = new Painel();
                painel.CalcularRendimentoEtanol(gol1000);
                painel.CalcularRendimentoGasolina(gol1000);

            } else {
                if (opcao == 2) {
                    Gol1600 gol1600 = Fabrica.getGol1600();
                    gol1600.setEntradaEtanol(conversaoEmLitrosEtanol);
                    gol1600.setEntradaGasolina(conversaoEmLitrosGasolina);

                    Painel painel = new Painel();
                    painel.CalcularRendimentoEtanol(gol1600);
                    painel.CalcularRendimentoGasolina(gol1600);

                } else {
                    if (opcao == 3) {
                        JettaComfortline2000 jettaComfortline2000 = Fabrica.getJettaComfortline2000();
                        jettaComfortline2000.setEntradaEtanol(conversaoEmLitrosEtanol);
                        jettaComfortline2000.setEntradaGasolina(conversaoEmLitrosGasolina);

                        Painel painel = new Painel();
                        painel.CalcularRendimentoEtanol(jettaComfortline2000);
                        painel.CalcularRendimentoGasolina(jettaComfortline2000);
                    }
                }
            }
    }
}
