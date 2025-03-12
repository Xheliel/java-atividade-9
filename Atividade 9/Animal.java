public class Animal {
    private String nome;
    private int patas;


    public Animal(String nome, int patas) {
        this.nome = nome;
        this.patas = patas;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    @Override
    public String toString() {
        return "\n= = = = = Informações sobre o Animal = = = = = \n" +
            "Nome: " + getNome() +
            "\nQtd de patas: " + getPatas();
    }

}