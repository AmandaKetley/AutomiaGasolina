public class JettaComfortline2000 extends Carro implements RendimentoPorKM {
    //Consumo Carro novo 2020

    @Override
    public float calcularRendimentoGasolina() {
        float aux = super.getEntradaGasolina()*(89)/10;
        return aux;
    }

    @Override
    public float calcularRendimentoEtanol() {
        float aux = super.getEntradaEtanol() * (63) / 10;
        return aux;
    }
}
