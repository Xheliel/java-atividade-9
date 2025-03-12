public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int patas, String raca) {
        super(nome, patas);
        this.raca = raca;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void latir() {
        System.out.println("Au au!");
    }

}