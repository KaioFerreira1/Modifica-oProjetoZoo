package Model;

import Interfaces.IComportamentoBeberAgua;
import Interfaces.IComportamentoComer;
import Interfaces.IComportamentoNadar;

public class Tubarao extends Animais implements IComportamentoNadar, IComportamentoComer {

    boolean PossuiNadadadeiras;
    boolean AmbienteAquatico;

    public Tubarao(
            boolean PossuiNadadadeiras, String nome,boolean AmbienteAquatico, int CodigoIndentificacao, int quantidadeDePatas, String cor) {
        super(nome, quantidadeDePatas, CodigoIndentificacao, cor);
        this.PossuiNadadadeiras = PossuiNadadadeiras;
        this.cor = cor;
    }

    public Tubarao(boolean possuiNadadadeiras, String tubarão, int codigoIndentificacao, int i) {
        super();
    }

    public boolean isPossuiNadadadeiras() {
        return PossuiNadadadeiras;
    }

    public void setPossuiNadadadeiras(boolean possuiNadadadeiras) {
        this.PossuiNadadadeiras = possuiNadadadeiras;
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

        return "\n---------------Tubarao--Ambiente Aquatico---------------" + "\n[Tem Nadadadeira=" + PossuiNadadadeiras + ']' + super.toString();
    }

    @Override
    public void nadar() {
        System.out.println("Tubarao: Nadou até perto da parede do aquario");
    }

    @Override
    public void comer() {
        System.out.println("Tubarao: Comeu vários peixes");
    }

    }

