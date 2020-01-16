package com.company;

import java.util.Scanner;

public class coffeemachine {

    int water = 15;
    int coffee = 20;
    int milk = 15;
    double koko = 10;


    public void MakeCoffee(int iAmericano,int iLatte,int iEspresso,int iCapuccino,int iMocha) {
        if (iAmericano > 0) {
            for (int i = 0; i < iAmericano; i++) {
                Americano americano = MakeAmericano();
                if (americano != null)
                    System.out.println((i + 1) + "cup, Here your americano");
                else
                    System.out.println("Sorry can't this americano cup.");
            }
        }
        if (iLatte > 0) {
            for (int i = 0; i < iLatte; i++) {
                Latte latte = MakeLatte();
                if (latte != null)
                    System.out.println((i + 1) + "cup, Here your Latte");
                else
                    System.out.println("Sorry can't this latte cup.");
            }
        }
        if (iEspresso > 0) {
            for (int i = 0; i < iEspresso; i++) {
                Espresso espresso = MakeEspresso();
                if (espresso != null)
                    System.out.println((i + 1) + "cup, Here your Espresso");
                else
                    System.out.println("Sorry can't this Espresso cup.");

            }
        }
        if (iCapuccino > 0) {
            for (int i = 0; i < iCapuccino; i++) {
                Capuccino capuccino = MakeCapuccino();
                if (capuccino != null)
                    System.out.println((i + 1) + "cup, Here your Capuccino");
                else
                    System.out.println("Sorry can't this Capuccino cup.");

            }
        }
        if (iMocha > 0) {
            for (int i = 0; i < iMocha; i++) {
                Mocha mocha = MakeMocha();
                if (mocha != null)
                    System.out.println((i + 1) + "cup, Here your Mocha");
                else
                    System.out.println("Sorry can't this Mocha cup.");

            }
        }
    }


        public Americano MakeAmericano () {
            //check recipe = americano coffee 1, water 2
            if (coffee >= 1 && water >= 2) {
                coffee -= 1;
                water -= 2;
                Americano americano = new Americano();
                return americano;
            } else {
                return null;
            }
        }
    public Latte MakeLatte () {
        if (coffee >= 1 && milk >= 2) {
            coffee -= 1;
            milk -= 2;
            Latte latte = new Latte();
            return latte;
        } else {
            return null;
        }
    }
    public Espresso MakeEspresso () {

        if (coffee >= 2) {
            coffee -= 2;

            Espresso espresso = new Espresso();
            return espresso;
        } else {
            return null;
        }
    }
    public Capuccino MakeCapuccino () {

        if (coffee >= 1 && milk >= 1) {
            coffee -= 1;
            milk -= 1;
            Capuccino capuccino = new Capuccino();
            return capuccino;
        } else {
            return null;
        }
    }
    public Mocha MakeMocha () {

        if (coffee >= 1 && milk >= 1 && koko >= 0.5) {
            coffee -= 1;
            milk -= 1;
            koko -= 0.5;
            Mocha mocha = new Mocha();
            return mocha;
        } else {
            return null;
        }
    }
}
