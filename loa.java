

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arjun singh
 */
public class loa {
    public static void main(String[] args) {
        Loading ob=new Loading();
        ob.setVisible(true);
        try {
            for (int i = 0; i <=100; i++) {
                Thread.sleep(50);
                ob.lbl.setText(Integer.toString(i));
                ob.bar.setValue(i);
                login lg=new login();
                if(i==100){
                    lg.setVisible(true);
                    ob.setVisible(false);
                }
                
                
            }
        } catch (Exception e) {
        }
    }
}
