package online.pratice.code.eighth;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTestEx01{
    public static void main(String[] args){
        Frame fr=new Frame("Menu");
        MenuBar mb=new MenuBar();
        fr.setMenuBar(mb);
        Dialog d;
        d = new Dialog(fr,"About",true);
        d.setSize(100,100);
        d.add(new Label("This is \"about\" Menu" ));
        d.addWindowListener(new ShowAbout(fr,d));
        Menu m1=new Menu("File");
        Menu m2=new Menu("Format");
        Menu m3=new Menu("Help");
        Menu m4=new Menu("进制");
        mb.add(m1);    		mb.add(m2);
        mb.setHelpMenu(m3);
        MenuItem m21=new MenuItem("中文");
        MenuItem m41=new MenuItem("二进制");
        MenuItem m42=new MenuItem("八进制");
        MenuItem m43=new MenuItem("十进制");
        MenuItem m11= new MenuItem("Exit");
        MenuItem m31=new MenuItem("About");
        m1.add(m11);
        m2.add(m21);   		m2.add(m4);
        m4.add(m41);    		m4.add(m42);   		m4.add(m43);
        m3.add(m31);
        m11.addActionListener(new Exit());
        m31.addActionListener(new ShowAbout(fr,d));
        fr.pack();
        fr.setSize(300,100);
        fr.setLocation(100,100);
        fr.setVisible(true);
    }
}
class Exit implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}

class ShowAbout extends WindowAdapter implements ActionListener{
    Frame fr;
    Dialog d;
    public ShowAbout(Frame fr,Dialog d){
        this.fr = fr;
        this.d = d;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        d.setVisible(true);
    }

    @Override
    public void windowClosing(WindowEvent e) {
        d.dispose();
    }
}

