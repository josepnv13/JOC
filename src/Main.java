import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();
        int contador=6;
        int tamano=contador;
        String [] emojis = {"👹","☠","😈","🤬","🤡","👻","😎","😇","🤥","🤢","😱","💩","👽","🙈","🗯","🖕","🦷","🧠","💂","👮","🦊","🦥"};
        int necesarios= tamano*tamano/2;
        String[][] tablero = new String [tamano][tamano];
        boolean[][] destapada=new boolean[tamano][tamano];


        for (int i = 0; i <necesarios; i++) {
            for (int j = 0; j <2; j++) {
               for ( ; ; ){
                   int f1= random.nextInt(tamano);
                   int c1= random.nextInt(tamano);
                   if (tablero[f1][c1]==null){
                       tablero[f1][c1]=emojis[i];
                       break;
                   }

               }

            }
        }

//        for (int i = 0; i < tamano; i++) {
//            for (int j = 0; j <tamano; j++) {
//                System.out.print(tablero[i][j]);
//            }
//            System.out.println();
//        }
//
//        System.out.println("------------------");


        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j <tamano; j++) {
                System.out.print("🎴");
            }
            System.out.println();
        }





        for(; ;){
            int f1= scanner.nextInt();
            int c1= scanner.nextInt();
            int f2= scanner.nextInt();
            int c2= scanner.nextInt();


            if (tablero[f1][c1].equals(tablero[f2][c2])){
                destapada[f1][c1]=true;
                destapada[f2][c2]=true;
            }


            System.out.println("\033[H\033[2J");
            System.out.flush();

            for (int i = 0; i < tamano; i++) {
                for (int j = 0; j <tamano; j++) {
                    if (destapada[i][j]){
                        System.out.print(tablero[i][j]);
                    } else if (i==f1 && j==c1) {
                        System.out.print(tablero[i][j]);

                    } else if (i==f2 && j==c2) {
                        System.out.print(tablero[i][j]);
                    } else {
                        System.out.print("🎴");
                    }
                }
                System.out.println();
            }

       }


    }
}


















































