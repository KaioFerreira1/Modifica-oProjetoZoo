package Model;

public class Ambiente {
    Animais[] listaDeAnimais;
    public Ambiente(int capacidadedozoologico){
        listaDeAnimais = new Animais[capacidadedozoologico];
    }
    public void getListaDeAnimais() {
        for (int i = 0; i < this.listaDeAnimais.length; i++) {
            System.out.println(listaDeAnimais[i]);
        }
    }
    public void setListaDeAnimais(int posicao, Animais animais) {
        this.listaDeAnimais[posicao] = animais;
    }
    @Override
    public String toString() {
        this.getListaDeAnimais();
        return "\nAmbientes existentes(Terrestre, Aquatico e Aereo)";
    }
}