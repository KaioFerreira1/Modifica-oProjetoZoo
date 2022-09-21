package Model;

import Interfaces.IComportamentoBeberAgua;
import Interfaces.IComportamentoComer;
import Interfaces.IComportamentoVoar;

public class Arara extends Animais implements IComportamentoVoar, IComportamentoComer, IComportamentoBeberAgua {
    int totalDePatas;

    boolean AmbienteAereo;
    boolean possuiAsa;

    public Arara(int totalDePatas, boolean possuiAsa, String nome, boolean AmbienteAereo, int CodigoIndentificacao, int quantidadeDePe, String cor) {
        super(nome, quantidadeDePe, CodigoIndentificacao, cor);
        this.totalDePatas = totalDePatas;
        this.possuiAsa = possuiAsa;
        this.AmbienteAereo = AmbienteAereo;
    }
    public int getTotalDePatas() {
        return totalDePatas;
    }
    public void setTotalDePatas(int totalDePatas) {
        this.totalDePatas = totalDePatas;
    }
    public boolean isPossuiAsa() {
        return possuiAsa;
    }
    public boolean isAmbienteAereo() {
        return AmbienteAereo;
    }
    public void setPossuiAsa(boolean possuiAsa) {
        this.possuiAsa = possuiAsa;
    }
    @Override
    public String getNome() {
        return super.getNome();
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
        return "\n*************Lista de Animais*************"+ "\n---------------Arara--Ambiente Aereo---------------" +
                "\n["  + "totalDePatas=" +
                + totalDePatas +
                ", possuiAsas=" +
                possuiAsa + ']'+
                super.toString();
    }

    @Override
    public void voar() {
        System.out.println("Arara: Vouu até o ninho");

    }

    @Override
    public void comer() {
        System.out.println("Arara: Abriu e comeu uma castanha do Pará");
    }

    @Override
    public void BeberAgua() {
        System.out.println("Arara:Bebeu água no lago");
    }
}