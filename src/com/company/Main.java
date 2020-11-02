package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        conditionals c1 = new conditionals();
        System.out.println("chimp trouble");
        System.out.println(c1.chimpTrouble(true, true));
        System.out.println(c1.chimpTrouble(false, false));
        System.out.println(c1.chimpTrouble(true, false));
        System.out.println(c1.chimpTrouble(false, true));

        System.out.println();

        System.out.println("negPos");
        System.out.println(c1.negPos(1, -1, false));
        System.out.println(c1.negPos(-1, 1, false));
        System.out.println(c1.negPos(1, 1, false));
        System.out.println(c1.negPos(-1, -1, false));
        System.out.println(c1.negPos(-4, -5, true));
        System.out.println(c1.negPos(-4, 5, true));
        System.out.println(c1.negPos(4, 5, true));
        System.out.println(c1.negPos(4, -5, true));

        System.out.println();

        System.out.println("pick up phone");
        System.out.println(c1.pickUpPhone(false, false, true));
        System.out.println(c1.pickUpPhone(true, true, true));
        System.out.println(c1.pickUpPhone(true, true, false));
        System.out.println(c1.pickUpPhone(false, true, false));
        System.out.println(c1.pickUpPhone(true, false, false));
        System.out.println(c1.pickUpPhone(false, false, false));

        System.out.println();

        System.out.println("setAlarm");
        System.out.println(c1.setAlarm(1, false));
        System.out.println(c1.setAlarm(5, false));
        System.out.println(c1.setAlarm(0, false));
        System.out.println(c1.setAlarm(2, true));
        System.out.println(c1.setAlarm(4, true));
        System.out.println(c1.setAlarm(6, true));

        System.out.println();

        System.out.println("onesdigit");
        System.out.println(c1.onesDigitSame(23,19,13));
        System.out.println(c1.onesDigitSame(23,19,12));
        System.out.println(c1.onesDigitSame(23,19,3));
        System.out.println(c1.onesDigitSame(423,13,3));
        System.out.println(c1.onesDigitSame(23,29,25));

        System.out.println();

        System.out.println("Blackjack");
        System.out.println(c1.blackjack(19,21));
        System.out.println(c1.blackjack(21,19));
        System.out.println(c1.blackjack(19,22));
        System.out.println(c1.blackjack(8,8));
        System.out.println(c1.blackjack(25,24));
    }
}

/*
chimp trouble
true
true
false
false

negPos
true
true
false
false
true
false
false
false

pick up phone
false
false
true
true
false
true

setAlarm
7:00
7:00
10:00
10:00
10:00
off

onesdigit
true
false
true
true
false

Blackjack
21
21
19
8
0


 */