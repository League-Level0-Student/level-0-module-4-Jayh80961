package _02_boolean._1_sleepy_head;

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        
         // Ask the user for these values using a confirm dialog like the one below
         //JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         int bob = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleep in?", JOptionPane.YES_NO_OPTION);
         if(bob == 0) {
        	 	JOptionPane.showMessageDialog(null, "get up lazybones!");
         }
         else {
        	 int jeff = JOptionPane.showConfirmDialog(null, "Are you in a vacation?", "Sleep in?", JOptionPane.YES_NO_OPTION);
        	 if(jeff==0) {
        		 JOptionPane.showMessageDialog(null,"sleep in");
        	 }
        	 else {
        		 JOptionPane.showMessageDialog(null, "Okay...");
        	 }
         }

        /*
         * Print "sleep in"? if it is a vacation or a weekend. 
         * If it's a weekday, print "get up lazybones!"? 
         * If it's a weekday, but we are on vacation,  print "sleep in"?.
         */
    }
}
