package GUI;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import java.util.ArrayList;
/**
 *
 * @author nichambers
 */
public class StaffGUI extends JFrame {
    
    private JPanel jp = new JPanel();
    private JLabel OpenApp1 = new JLabel("Open 1");
    private JLabel RequestApp1 = new JLabel("Request 1");
    
    public StaffGUI(ArrayList<Appointment> requests, ArrayList<Appointment> open){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        jp.setPreferredSize(new Dimension(1350, 675));
        jp.setLayout(null);
        
        //Populate requests list
        //Place JLabel appointments in line with each other, increment coordinates
        ArrayList<JLabel> rLabels = new ArrayList<>(); //rLabels = requests
        int x = 50; //starting position of list, appointments go down as list grows
        int y = 50;
        int l = 150;
        int h = 75;
        for(int i = 0; i < requests.size(); i++){
            JLabel temp = new JLabel(requests.get(i).toString());
            rLabels.add(temp);
            temp.setBounds(x, y, l, h);
            temp.setBorder(BorderFactory.createLineBorder(Color.black)); 
            y += 125;
            jp.add(temp);
        }
        
        //Populate open slots list
        //Place JLabel appointments in line with each other, increment coordinates
        ArrayList<JLabel> oLabels = new ArrayList<>(); //oLabels = open slots
        x = 500; //change x and y for list position, l and h constant
        y = 50;
        for(int i = 0; i < open.size(); i++){
            JLabel temp = new JLabel(open.get(i).toString());
            oLabels.add(temp);
            temp.setBounds(x, y, l, h);
            temp.setBorder(BorderFactory.createLineBorder(Color.black));
            y += 125;
            jp.add(temp);
        }
        
        /*
        //request side (left) label cordinates
        RequestApp1.setBounds(50, 100, 100, 75);
        jp.add(RequestApp1);
        
        //open slots side (right) label coordinates
        OpenApp1.setBounds(650, 100, 100, 75);
        jp.add(OpenApp1);
        
        //adding click listeners
        RequestApp1.addMouseListener(new MouseClickListener());
        OpenApp1.addMouseListener(new MouseClickListener());
        */
                
        //gui maker
        getContentPane().add(jp);
        pack();
    }
    
    private class MouseClickListener implements MouseListener{
        
        public void mousePressed(MouseEvent e){
            
        }
        public void mouseEntered(MouseEvent e){
            if(e.getSource().equals(RequestApp1)){
                RequestApp1.setBackground(new Color(162, 35, 35)); //r, g, b
                RequestApp1.setOpaque(true);
            }
        }
        public void mouseExited(MouseEvent e){
            if(e.getSource().equals(RequestApp1)){
                RequestApp1.setBackground(new Color(250, 191, 71)); //r, g, b                
            }
        }
        public void mouseReleased(MouseEvent  e){
            
        }
        public void mouseClicked(MouseEvent e){
            if(e.getSource().equals(RequestApp1)){
                
            }
        }
        
    }
    
    public void display(){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                setVisible(true);
            }
        });
    }
    
}
