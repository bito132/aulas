import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int[][] posicoes_para_ganhar = {
                {1,2,3}, {1,5,9}, {1, 4, 7},
                {2, 5, 8},
                {3, 6, 9}, {3, 5, 7},
                {4, 5, 6},
                {7, 8, 9}
        };
        boolean ganhador = false;
        ArrayList <Integer>jogador_a = new ArrayList<Integer>();
        ArrayList <Integer>jogador_b = new ArrayList<Integer>();

        int pos_escolhida;

        System.out.println("Considerando: \n|1|2|3|\n|4|5|6|\n|7|8|9|");

        while (ganhador == false){

            for(int t = 0; t < 9; t++) {

                System.out.println("Jogaodor A\nInsira uma posição de 1 a 9");
                pos_escolhida = sc.nextInt();
                jogador_a.add(pos_escolhida);
                if (ganhar(jogador_a, posicoes_para_ganhar) == true) {
                    System.out.println("O jogador A ganhou");
                    ganhador = true;
                    break;
                }

                t++;
                System.out.println(t);
                if (t == 9) {
                    System.out.println("Deu velhakkj!");
                    ganhador = true;
                    break;
                }

                System.out.println("Jogaodor B\nInsira uma posição de 1 a 9");
                pos_escolhida = sc.nextInt();
                jogador_b.add(pos_escolhida);
                if (ganhar(jogador_b, posicoes_para_ganhar) == true) {
                    System.out.println("O jogador B ganhou");
                    ganhador = true;
                    break;
                }

            }
            //if (t == 9)
              //  System.out.println("\nDeu velha");

        }


        sc.close();
    }
    public static boolean ganhar(ArrayList<Integer> posicoes, int[][] posicoes_para_ganhar) {
        int pos_vencer = 0;

        for (int[] i:posicoes_para_ganhar){
            if (pos_vencer == 3)
                break;
            pos_vencer = 0;
            for(int p = 0; p < 3; p++) {
                    if (posicoes.contains(i[p]) == true)
                        pos_vencer += 1;
            }
        }
        if (pos_vencer == 3){
            return true;
        }
        else{
            return false;
        }
    }
}
