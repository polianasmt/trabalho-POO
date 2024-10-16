package Bar;

public class MetodosBar {
    public boolean verificaIsentoCouvert(float consumo){
        if(consumo > 30) {
            return true;
        } else {
            return false;
        }
    }

    public int calculaConsumo(int qtdCervejas, int qtdRefrigerantes, int qtdEspetinhos) {
        return (qtdCervejas * 5) + (qtdRefrigerantes * 3) + (qtdEspetinhos * 7);
    }
}
