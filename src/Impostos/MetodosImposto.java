package Impostos;

public class MetodosImposto {
    public float calculaImpostoRenda(float salario){
        if(salario > 0 && salario < 36000) { // 3000 por ano * 12
            return 0;
        } else if (salario > 36000 && salario < 60000){
            return  (float) (salario * 0.1);
        } else if (salario > 60000){ // 5000 por ano * 12
            return (float) (salario * 0.2);
        } else {
            return 0;
        }
    }

    public float calculaImpostoServicos(float rendaServicos) {
        if(rendaServicos == 0) {
            return 0;
        } else {
            return (float) (rendaServicos * 0.15);
        }
    }

    public float calculaImpostoCapital(float rendaCapital){
        if(rendaCapital == 0) {
            return 0;
        } else {
            return (float) (rendaCapital * 0.2);
        }
    }

    public float calculaImpostoBruto(float salario, float rendaServicos, float rendaCapital){
        return calculaImpostoRenda(salario) + calculaImpostoServicos(rendaServicos) + calculaImpostoCapital(rendaCapital);
    }

    public float calculaMaxDedutivel(float salario, float rendaServicos, float rendaCapital){
        return (float) (calculaImpostoBruto(salario, rendaServicos, rendaCapital) * 0.3);
    }

    public float calculaGastosDedutiveis(float gastosMedicos, float gastosEducacionais){
        return gastosMedicos + gastosEducacionais;
    }

    public float calculaAbatimento(float maxDedutivel, float gastosDedutiveis){
        return (float) Math.min(maxDedutivel,gastosDedutiveis);
    }
    public float calculaImpostoTotal(float impostoBruto, float abatimento){
        return impostoBruto - abatimento;
    }
}

