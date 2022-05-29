public class Caixa<D> {
    private D dado;

    public void imprimeDado(){
            System.out.println("O dado recebido foi: " + this.dado);
    }

    public void setDado1(D dado){
        this.dado = dado;
    }

}
