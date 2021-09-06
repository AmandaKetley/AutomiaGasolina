public class Gol1600 extends Carro implements RendimentoPorKM {
    //Consumo Carro novo 2020

    @Override
    public float calcularRendimentoGasolina() {
        float aux = super.getEntradaGasolina() * (111) / 10;
        return aux;
    }

    @Override
    public float calcularRendimentoEtanol() {
        float aux = super.getEntradaEtanol() * (78) / 10;
        return aux;
    }
}