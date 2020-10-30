package com.company;

public class conditionals {


    public boolean chimpTrouble(boolean aSmile, boolean bSmile) {
        boolean value = aSmile && bSmile || !(aSmile||bSmile);
        return value;
    }

    public boolean negPos(int x, int y, boolean negative){
        boolean first = x>0;
        boolean second = y>0;
        boolean value = !(first&&second) && (first||second);
        boolean value2 = !(first&second) && negative;
        if (value2) {
            return value2;
        }
        else {
            return value;
        }
    }

    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep){
            return !isAsleep;
        }
        else if (isMorning && isMom){
            return isMom;
        }
        else {
            return isMorning;
            }
    }

    public String setAlarm(int x, boolean y){
        boolean weekday = x>0 && x<=;
        boolean weekend = (x<1 || x>5);
        if (weekday && !y){
            return "7:00";
        }
        else if (weekday && )

    }
}
