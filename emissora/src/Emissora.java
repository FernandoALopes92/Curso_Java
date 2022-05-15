public class Emissora {

    Programa[] listaDeProgramas = new Programa[4];

    void encontraProgramaMaisPopular(){
        Programa programaTemporario = listaDeProgramas[0];

        for (int contador = 1; contador <4; contador++){
            if(listaDeProgramas[contador].pontosDeAudiencia > programaTemporario.pontosDeAudiencia){
                programaTemporario = listaDeProgramas[contador];
            }
        }
        System.out.println("O programa de maior audiência é "+ programaTemporario.nome + " com "+ programaTemporario.pontosDeAudiencia + " pontos de audiência!");

    }
}
