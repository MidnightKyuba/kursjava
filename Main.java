package ukladgraficzny;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame
{
    public Main()
    {
        super("układ graficzny (Layout)");
        this. setBounds(300, 320, 800, 600);

        initComponents();

        this.setDefaultCloseOperation(3);
    }

    public void initComponents()
    {
        centrum = new JButton("Anuluj");
        gora = new JButton("jestem na górze");
        dol = new JButton("jestem na dole");
        prawa = new JButton("jestem po prawej stronie");
        lewa = new JButton("jestem po lewej stronie");

        Container kontener = this.getContentPane();

        centrum.setLocation(600, 540);
        centrum.setSize(200, 20);
        gora.setLocation(300, 0);
        gora.setSize(200, 20);
        dol.setLocation(300, 540);
        dol.setSize(200, 20);
        prawa.setLocation(600, 290);
        prawa.setSize(200, 20);
        lewa.setLocation(0, 290);
        lewa.setSize(200, 20);
        kontener.setLayout(null);
        kontener.add(centrum);
        kontener.add(gora);
        kontener.add(dol);
        kontener.add(prawa);
        kontener.add(lewa);
    }

    JButton centrum;
    JButton gora;
    JButton dol;
    JButton prawa;
    JButton lewa;

    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
