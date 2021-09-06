public class Gol1000 extends Carro implements RendimentoPorKM {
//Consumo Carro novo 2020

    @Override
    public float calcularRendimentoGasolina() {
        float aux = super.getEntradaGasolina() * (133) / 10;
        return aux;
    }

    @Override
    public float calcularRendimentoEtanol() {
        float aux = super.getEntradaEtanol() * (91) / 10;
        return aux;
    }
}
