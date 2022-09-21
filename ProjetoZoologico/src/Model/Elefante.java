package Model;

import Interfaces.IComportamentoAndar;
import Interfaces.IComportamentoBeberAgua;
import Interfaces.IComportamentoComer;

public class Elefante extends Animais implements IComportamentoAndar, IComportamentoComer, IComportamentoBeberAgua {

    int totalDePatas;
    boolean AmbienteTerrestre;
    boolean PossuiTromba;

    public Elefante(String nome, int totalDePatas, boolean AmbienteTerrestre, boolean PossuiTromba, int CodigoIndentificacao, int quantidadeDePatas, String cor) {
        super(nome, quantidadeDePatas, CodigoIndentificacao, cor);
        this.totalDePatas = totalDePatas;
        this.PossuiTromba = PossuiTromba;
    }
    public int getTotalDePatas() {
        return totalDePatas;
    }

    public void setTotalDePatas(int totalDePatas) {
        this.totalDePatas = totalDePatas;
    }

    public boolean isPossuiTromba() {
        return PossuiTromba;
    }

    public void setPossuiTromba(boolean possuiTromba) {
        this.PossuiTromba = possuiTromba;
    }

    @Override
    public int getQuantidadeDePatas() {
        return super.getQuantidadeDePatas();
    }

    @Override
    public void setQuantidadeDePatas(int quantidadeDePatas) {
        super.setQuantidadeDePatas(quantidadeDePatas);
    }

    @Override
    public int getCodigoIndentificacao() {
        return super.getCodigoIndentificacao();
    }

    @Override
    public void setCodigoIndentificacao(String codigoIndentificacao) {
        super.setCodigoIndentificacao(codigoIndentificacao);
    }

    @Override
    public String getCor() {
        return super.getCor();
    }

    @Override
    public void setCor(String cor) {
        super.setCor(cor);
    }

    @Override
    public String toString() {
        return "\n---------------Elefante--Ambiente Terrestre---------------" + "\n[totalDePatas=" + totalDePatas + ", Possui Tromba=" + PossuiTromba + ']'+ super.toString();
    }

    @Override
    public void andar() {
        System.out.println("Elefante: Andou até a água");
    }

    @Override
    public void comer() {
        System.out.println("Elefante: Comeu umas folhas");
    }

    @Override
    public void BeberAgua() {
        System.out.println("Elefante: Bebeu muita água do lago");
    }
}
