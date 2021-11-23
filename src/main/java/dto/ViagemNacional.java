package dto;

import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import utils.ArquivosUtils;


import java.util.List;


public class ViagemNacional extends Viagem implements CalculadoraDePrevisao {
    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws  Exception{


        int limiteDeAcompanhantes = Integer.parseInt((ArquivosUtils.getPropriedades("viagem.nacional.acompanhantes.limite ")));

        if (acompanhantes.size() <= 4) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw  new Exception("Viagens nacionais não permitem mais que" + limiteDeAcompanhantes + "acompanhantes");
        }
    }

    public int calcularPrevisaoDeDiasParaRetorno(){
        int quantidadeDeDias = 0;

        switch (this.getDestino()) {
            case BRASIL: quantidadeDeDias = 5; break;
            case PERNAMBUCO: quantidadeDeDias = 3; break;
        }

        return quantidadeDeDias;
    }

}