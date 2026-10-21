/* JOGO BARRICADE: O que é isso e sobre o que é o nosso projeto?
* Basicamente: Barricade é um jogo de 2 jogadores em que o objetivo
* principal é chegar até o outro lado do tabuleiro, mas para impedir
* o seu adversário de chegar até o outro lado do tabuleiro, você 
* pode colocar paredes na horizontal e na vertical para atrasar
* a chegada do seu oponente. Mas vale lembrar que você deve 
* deixar ao menos uma saída para que seja possível o seu 
* oponente criar uma forma de chegar até o fim.
*/




//Toda a importação de material deve ficar aqui em baixo antes do public class:
import java.util.Scanner;
public class JoseeMateusTabuleiroeRegrasTCA {

//Qualquer tipo de variável declarada fora do método main deve ficar aqui:
    
   static Scanner LER = new Scanner(System.in);
   static int[][] TABULEIRO = new int[9][9];
   static boolean[][] PAREDESHORIZONTAIS = new boolean[8][9];
   static boolean[][] PAREDESVERTICAIS = new boolean[9][8];

//Aqui vão ficar os métodos que serão ativados dentro do método main:

    public static void imprimirTabuleiro() {
        //Essa parte do código aq imprime a legenda
        System.out.print("   ");
        for(int j = 1; j <= 9; j++) {

            System.out.print(j + "   ");
        }
        System.out.println();
        for(int i = 0; i < 9; i++) {

            if(i == 0) {
                
                System.out.print("   +");
                for(int j = 0; j < 9; j++) {
                    System.out.print("---+");
                }
                System.out.println();
            }

            System.out.print(i + " |");
            for(int j = 0; j < 9; j++) {
                char casadeinicio = ' ';
                if(TABULEIRO[i][j] == 1) {
                    casadeinicio = '1';
                } else if (TABULEIRO[i][j] == 2) {
                    casadeinicio = '2';
                }
                System.out.print(" " + casadeinicio + " ");

                //paredes usadas no jogo para impedir o inimigo
                
                if (j < 8 && PAREDESVERTICAIS[i][j]) {

                    System.out.print("#");
                } else {

                    System.out.print("|");
                }
            }   
            System.out.println();  
                
            System.out.print("   +");
            for (int j = 0; j < 9; j++) {
                if (i < 8 && PAREDESHORIZONTAIS[i][j]) {
                    
                    System.out.print("===+");
                } else {

                    System.out.print("---+");
                }
            }
            System.out.println();
        }
    
    }



//A partir daqui fica o método main, basicamente o principal que sustenta o programa:

    public static void main (String[]args) {
        imprimirTabuleiro();
    }
}