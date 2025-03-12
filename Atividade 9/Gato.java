public class Gato extends Animal{
        private String cor;
    
        public Gato(String nome, int patas, String cor) {
            super(nome, patas);
            this.cor = cor;
        }
    
        public String getCor() {
            return this.cor;
        }
    
        public void setCor(String cor) {
            this.cor = cor;
        }
    
        public void miar() {
            System.out.println("Miau miau caralho!");
        }
        
    }
