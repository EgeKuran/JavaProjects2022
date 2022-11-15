package tictactoe;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String symbols = scan.next();
        String[] firstRow = {symbols.charAt(0)+"",symbols.charAt(1)+"",symbols.charAt(2)+""};
        String[] secondRow = {symbols.charAt(3)+"",symbols.charAt(4)+"",symbols.charAt(5)+""};
        String[] thirdRow = {symbols.charAt(6)+"",symbols.charAt(7)+"",symbols.charAt(8)+""};

        System.out.println("---------");
        System.out.println("|" + " " + firstRow[0] + " " + firstRow[1] + " " + firstRow[2] + " " + "|");
        System.out.println("|" + " " + secondRow[0] + " " + secondRow[1] + " " + secondRow[2] + " " + "|");
        System.out.println("|" + " " + thirdRow[0] + " " + thirdRow[1] + " " + thirdRow[2] + " " + "|");
        System.out.println("---------");
        boolean Xwins = false;
        boolean Owins = false;
        boolean draw = false;
        boolean isEmpty = false;
        boolean notFin = false;
        boolean impossible = false;
        int countX = 0;
        int countO = 0;

        for (String i :firstRow) {
            if(i.equals("X")) {
                countX++;

            }
            if(i.equals("O")) {
                countO++;
            }

        }
        for (String i :secondRow) {
            if(i.equals("X")) {
                countX++;

            }
            if(i.equals("O")) {
                countO++;
            }

        }
        for (String i :thirdRow) {
            if(i.equals("X")) {
                countX++;

            }
            if(i.equals("O")) {
                countO++;
            }

        }
        //X Wins
        if((firstRow[0].equals("X") && firstRow[1].equals("X") && firstRow[2].equals("X"))
        ||(secondRow[0].equals("X") && secondRow[1].equals("X") && secondRow[2].equals("X"))
        ||(thirdRow[0].equals("X") && thirdRow[1].equals("X") && thirdRow[2].equals("X"))
        ||(firstRow[0].equals("X") && secondRow[1].equals("X") && thirdRow[2].equals("X"))
        ||(firstRow[2].equals("X") && secondRow[1].equals("X") && thirdRow[0].equals("X"))
        ||(firstRow[0].equals("X") && secondRow[0].equals("X") && thirdRow[0].equals("X"))
        ||(firstRow[1].equals("X") && secondRow[1].equals("X") && thirdRow[1].equals("X"))
        ||(firstRow[2].equals("X") && secondRow[2].equals("X") && thirdRow[2].equals("X"))) {
            Xwins=true;
        }
        //O Wins
        if((firstRow[0].equals("O") && firstRow[1].equals("O") && firstRow[2].equals("O"))
        ||(secondRow[0].equals("O") && secondRow[1].equals("O") && secondRow[2].equals("O"))
        ||(thirdRow[0].equals("O") && thirdRow[1].equals("O") && thirdRow[2].equals("O"))
        ||(firstRow[0].equals("O") && secondRow[1].equals("O") && thirdRow[2].equals("O"))
        ||(firstRow[2].equals("O") && secondRow[1].equals("O") && thirdRow[0].equals("O"))
        ||(firstRow[0].equals("O") && secondRow[0].equals("O") && thirdRow[0].equals("O"))
        ||(firstRow[1].equals("O") && secondRow[1].equals("O") && thirdRow[1].equals("O"))
        ||(firstRow[2].equals("O") && secondRow[2].equals("O") && thirdRow[2].equals("O"))) {
            Owins=true;
        }
        //draw
        for (int i = 0; i < 3; i++) {
            if (firstRow[i].equals("_")) {
                isEmpty = true;
            }
            if (secondRow[i].equals("_")) {
                isEmpty = true;
            }
            if (thirdRow[i].equals("_")) {
                isEmpty = true;
            }
        }
        if (!isEmpty && !Xwins && !Owins) {
            draw = true;
        }
        //not finished
        if (isEmpty && !Xwins && !Owins && !draw) {
            notFin = true;
        }
        //impossible
        if ((Xwins && Owins) ||((countX-countO>=2)||(countO-countX)>=2)){
            impossible = true;
        }
        if (!impossible && Xwins && !Owins && !draw && !notFin) {
            System.out.println("X wins");
        }
        if (!impossible && Owins && !Xwins && !draw && !notFin) {
            System.out.println("O wins");
        }
        if (draw && !impossible){
            System.out.println("Draw");
        }
        if (notFin && !impossible){
            System.out.println("Game not finished");
        }
        if (impossible) {
            System.out.println("Impossible");
        }
    }
}
