package Program;

import java.util.Scanner;

import Entities.Campo;



public class JogoDaVelha {
    public static void main(String[] args) {
        Campo[][] velha = new Campo[3][3];
        char simbolAtual = 'X';
        boolean game = true;
        String vitoria = "";
        Scanner sc = new Scanner(System.in);

        iniciarJogo(velha);
        

        while(game){
            desenhaJogada(velha);
            vitoria = verificaVitoria(velha);
            if(!vitoria.equals("")){
                System.out.printf("Jogador %s venceu\n", vitoria);
                break;
            }
            try{
                if(verificarJogada(velha, jogar(sc, simbolAtual), simbolAtual)){
                    if(simbolAtual == 'X'){
                        simbolAtual= 'O';
                    }else{
                        simbolAtual= 'X';
                    }

                }



            }catch(Exception e){
                System.out.println("Erro");
            }

        }
        System.out.println("Fim do Jogo");
    }
     
        public static void desenhaJogada(Campo[][] velha){
            limparTela();
            System.out.println("  0    1    2");
            System.out.printf("0  %c | %c | %c | \n", velha[0][0].getSimbol(), velha[0][1].getSimbol(), velha[0][2].getSimbol());
            System.out.println("---------------------");
            System.out.printf("1  %c | %c | %c | \n", velha[1][0].getSimbol(), velha[1][1].getSimbol(), velha[1][2].getSimbol());
            System.out.println("---------------------");
            System.out.printf("2  %c | %c | %c | \n", velha[2][0].getSimbol(), velha[2][1].getSimbol(), velha[2][2].getSimbol());


        }

        public static void limparTela(){
            for(int i = 0; i < 200; i++){
                System.out.println("");
            }
        }
        public static int[] jogar(Scanner sc, char sa){
            int[] p = new int[2];
            System.out.printf("%s %c \n", "Quem joga:", sa );
            System.out.println("Informar a Linha: " );
            p[0] = sc.nextInt();
            System.out.println("Informar a Coluna: " );
            p[1] = sc.nextInt();
            return p;

        }

        public static boolean verificarJogada(Campo[][] velha, int p[], char simboloAtual){
            if(velha[p[0]][p[1]].getSimbol()== ' '){
                velha[p[0]][p[1]].setSimbol(simboloAtual);
                return true;


            }else{
                return false;
            }
        }

        public static void iniciarJogo(Campo[][] velha){
            for(int l=0; l<3; l++){
                for(int c=0; c<0; c++){
                    velha[l][c] = new Campo();
                }
            }
        }

        public static String verificaVitoria(Campo[][] velha){
            return "";
        }
    

    
}
