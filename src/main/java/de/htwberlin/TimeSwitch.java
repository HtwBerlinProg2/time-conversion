package de.htwberlin;

import java.util.ArrayList;

public class TimeSwitch {
 ArrayList<String> Switcher =  new ArrayList<>();

    public TimeSwitch() {
    }

    public String timeSwitcher(String in){
        String[] time = in.split( "[ :]+");
        String oldtime;
        int newtime = 0 ;
        int converted = 0;
        this.Switcher.clear();


        for(String i : time){
            oldtime = time[0] ;

            if(time[0].equals("12") && time[3].equals("AM") ){
                converted = 0;
                time[0]= String.valueOf(converted);
            }
            if(time[0].equals("12") && time[3].equals("PM") ){
                converted = 12;
                time[0]= String.valueOf(converted);
            }

            if(i.equals("PM") && converted!= 12) {
                for (int j = 0; j < 12; j++) {
                    if (newtime < 12)
                        newtime += 1;

                }
                converted = Integer.parseInt(oldtime) + newtime;

                if (converted > 24) {
                    converted = 0;
                }
                time[0] = String.valueOf(converted);
            }
        }

        Switcher.add(time[0]);
        Switcher.add(time[1]);
        Switcher.add(time[2]);


        return time[0]+":"+time[1]+":"+time[2];
    }



}
