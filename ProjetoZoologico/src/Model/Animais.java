package Model;

public class Animais {
    int CodigoIndentificacao;
    String nome;
    int quantidadeDePatas;
    String cor;
    public Animais(String nome, int quantidadeDePatas, int CodigoIndentificacao, String cor) {
        this.nome = nome;
        this.quantidadeDePatas = quantidadeDePatas;
        this.CodigoIndentificacao = CodigoIndentificacao;
        this.cor = cor;
    }
    public Animais(String nome, int codigoIndentificacao, String quantidadeDePatas, String cor) {
    }
    public Animais() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }
    public void setQuantidadeDePatas(int quantidadeDePatas) {
        this.quantidadeDePatas = quantidadeDePatas;
    }
    public int getCodigoIndentificacao() {
        return CodigoIndentificacao;
    }
    public void setCodigoIndentificacao(String codigoIndentificacao) {
        this.CodigoIndentificacao = Integer.parseInt(codigoIndentificacao);
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    @Override
    public String toString() {
        return "Caracteristas dos Animais\n[" + "Nome--" + nome + ", quantidadeDePatas--" + quantidadeDePatas +
                ", CodigoDeIndificacaoDeEspecie--'" +
                CodigoIndentificacao +
                '\'' + ", cor--'" +
                cor + '\'' +
                ']';
    }
}