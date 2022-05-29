import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("Escolha o animal que deseja instanciar");
        System.out.println("[1] golfinho");
        System.out.println("[2] leão");
        int escolha = scanner.nextInt();

        if(escolha == 1 ){
            animal = new Golfinho();
        } else {
            animal = new Leao();
        }
    }
}
