package app;

import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class App {
    //metodo principal abaixo, static = já pode ser utilizado, void = não tem retorno
    public static void main(String[] args) {
        Viagem viagem = new Viagem(Destinos.ESPANHA);

        //set para setar informação = configurar informação
        viagem.setDestino(Destinos.BRASIL);

        Acompanhante acompanhante1 = new Acompanhante();
        acompanhante1.setNome("Millany");
        acompanhante1.setConfirmouCadastro(true);

        Acompanhante acompanhante2 = new Acompanhante();
        acompanhante2.setNome("Cacau");
        acompanhante2.setConfirmouCadastro(false);

        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);

        try {
            viagem.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um problema");
            System.out.println(excecao.getMessage());
        }

        // get para buscar informação
        System.out.println(viagem.getDestino().getPais());
        System.out.println(viagem.getAcompanhantes().size());
        System.out.println(viagem.getAcompanhantes().get(0).getNome());
        System.out.println(viagem.getAcompanhantes().get(1).getNome());

        for (int iterador = 0 ; iterador < viagem.getAcompanhantes().size() ; iterador++) {
            System.out.println(viagem.getAcompanhantes().get(iterador).getNome());
            System.out.println(viagem.getAcompanhantes().get(iterador).isConfirmouCadastro());
        }

        for (Acompanhante acompanhante : viagem.getAcompanhantes()) {
            System.out.println(acompanhante.getNome());
            System.out.println(acompanhante.isConfirmouCadastro());
        }

        ViagemNacional viagemNacional = new ViagemNacional((Destinos.PERNAMBUCO));
         try {
            viagemNacional.setAcompanhantes(acompanhantes);
         } catch (Exception excecao) {
             System.out.println("ocorreu um problema");
             System.out.println(excecao.getMessage());
         }
        viagemNacional.setCpf("11122233388");

        ViagemInternacional viagemInternacional = new ViagemInternacional((Destinos.ESPANHA));
         try {
             viagemInternacional.setAcompanhantes(acompanhantes);
         } catch (Exception excecao) {
             System.out.println("Ocorreu um problema");
             System.out.println(excecao.getMessage());
         }
          viagemInternacional.setPassaporte("11111-5");

        System.out.println(viagemNacional.getDestino().getPais());
        System.out.println(viagemInternacional.getDestino().getPais());

        System.out.println(viagemNacional.getCpf());
        System.out.println(viagemInternacional.getPassaporte());

        System.out.println(viagemInternacional.calcularPrevisaoDeDiasParaRetorno());
        System.out.println(viagemNacional.calcularPrevisaoDeDiasParaRetorno());

    }
}
