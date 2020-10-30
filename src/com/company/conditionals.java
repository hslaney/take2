package com.company;

public class conditionals {


    public boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        return aSmile && bSmile || !(aSmile || bSmile);
    }

    public boolean negPos(int x, int y, boolean negative) {
        boolean first = x > 0;
        boolean second = y > 0;
        boolean value = !(first && second) && (first || second) && !negative;

        if (!(first || second) && negative) {
            return true;
        }
        else if (value){
            return value;
        }
        else {
            return false;
        }
    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep){
            return false;
        }
        else if (isMorning && !(isMorning && isMom)){
            return false;
        }
        else {
            return true;
        }
    }

    public String setAlarm(int x, boolean y) {
        boolean weekday = x > 0 && x <= 5;
        boolean weekend = x < 1 || x >= 6;
        if (weekday && !y)
        {
            return "7:00";
        }
        else if (weekday && y || weekend && !y)
        {
            return "10:00";
        }
        else
        {
            return "off";
        }

    }

    public boolean onesDigitSame(int a, int b, int c){
        int first = a%10;
        int second = b%10;
        int third = c%10;


        if (first == second || second == third || first == third){
            return true;
        }
        else{
            return false;
        }
    }

    public int blackjack(int x, int y){
        int first = 21 - x;
        int second = 21 - y;
        if ((second - first >= first - second || y>21) && x<=21){
            return x;
        }
        else if ((first - second >= second - first || x>21) && y<=21){
            return y;
        }
        else {
            return 0;
        }
    }

}
