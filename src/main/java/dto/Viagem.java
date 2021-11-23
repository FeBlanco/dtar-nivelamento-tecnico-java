package dto;

import enums.Destinos;

import java.util.List;

public class Viagem {
    // criando atributo
    private Destinos destino;
    private List<Acompanhante> acompanhantes;

    //Metodo cosntrutor, que vai rodar assim que alguem chamar o new
    public Viagem(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }
    //get pega e set configura

    public Destinos getDestino(){
        return this.destino;
    }

    public void setDestino (Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;

    }

    public List<Acompanhante> getAcompanhantes() {
        return this.acompanhantes;
    }

    public void setAcompanhantes (List<Acompanhante> acompanhantes) throws  Exception {
        this.acompanhantes = acompanhantes;
    }

}
