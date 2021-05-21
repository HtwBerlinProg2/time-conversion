package de.htwberlin;

public class App {

  public static void main(String[] args) {
    String s1 = "07:05:45 PM";
    String s2 = "07:05:45 AM";
    String s3 = "12:05:45 PM";
    String s4 = "12:05:45 AM";
    TimeSwitch t = new TimeSwitch();

   // t.timeSwitcher("12:05:45 AM");
    t.timeSwitcher("07:05:45 PM");
    t.timeSwitcher("07:05:32 AM");
   t.timeSwitcher("12:05:29 PM");
    t.timeSwitcher("12:05:00 AM");
    // TODO: Rufen Sie hier Ihre Methode auf
  }
}
