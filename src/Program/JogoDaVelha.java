package Program;

import java.util.Scanner;

import Entities.Campo;

public class JogoDaVelha {
    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        char simbolInit = 'X';
        boolean game = true;
        String vitoria = "";
        Scanner sc = new Scanner(System.in);
        

        while(game){
            desenhaJogada(velha);

        }
    }

        public static void desenhaJogada(Campo[][] v){
            // limparTela();
            System.out.println("  0    1    2");
            System.out.printf("0  %c | %c | %c | \n", v[0][0].getSimbol(), v[0][1].getSimbol(), v[0][2].getSimbol());
            System.out.println("---------------------");
            System.out.printf("1  %c | %c | %c | \n", v[1][0].getSimbol(), v[1][1].getSimbol(), v[1][2].getSimbol());
            System.out.println("---------------------");
            System.out.printf("2  %c | %c | %c | \n", v[2][0].getSimbol(), v[2][1].getSimbol(), v[2][2].getSimbol());


        }

        public static void verificarVitoria(Campo[][] velha){
            return "";
        }
    

    
}
