/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.util.ArrayList;
import java.io.File;
/**
 *
 * @author nichambers
 */
public class Scheduler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Appointment> rappts = new ArrayList<>();
        File f  = new File("appts.txt");
        Appointment one = new Appointment("nick", "1/1/11", "1:00", "1 hour", "Henry", f);
        rappts.add(one);
        
        ArrayList<Appointment> oappts = new ArrayList<>();
        File g  = new File("appts.txt");
        Appointment two = new Appointment("", "1/1/11", "1:00", "1 hour", "Matt", g); //No name, appt is open
        oappts.add(two);
        
        StaffGUI sgui = new StaffGUI(rappts, oappts);
        sgui.display();
    }
    
}
