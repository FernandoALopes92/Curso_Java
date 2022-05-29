public class Lutador {
   public String nome;
   protected float peso;
   private int idade;

    public Lutador(){}

    public Lutador(String nome, float peso, int idade){
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }
    /*
    os metodos getter e setter só existem para dar acesso ao
    atributos da classe(eles tambem podem realizar validações,
    para definir quem pode acessar/modificar aquele atributo)
     */

     public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }else {
            System.out.println("Idade inválida");
        }
    }

    public int getIdade(){
        return this.idade;
     }
}
