public class Painel {

    public void CalcularRendimentoGasolina(RendimentoPorKM rendimentoPorKM) {
        System.out.println("Autonomia na Gasolina: " + rendimentoPorKM.calcularRendimentoGasolina());
    }

    public void CalcularRendimentoEtanol(RendimentoPorKM rendimentoPorKM) {
        System.out.println("Autonomia no Etanol: " + rendimentoPorKM.calcularRendimentoEtanol());
    }
}
