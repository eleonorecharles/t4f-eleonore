package uk.co.be;

import aos.console.AosConsole;

public class Game {

    public static void main(String[] args) {

        String question = " Are you going to give me 100 £ ? ";

        String answer = AosConsole.readLine(question);

        if (answer.equals("Yes")) {

            AosConsole.println("Yeahhhhh :DDDD Thanks ! ");

        }

        else {
            AosConsole.println("Noooooo, bad :((((");

        }

    }
}
