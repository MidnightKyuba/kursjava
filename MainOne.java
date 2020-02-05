package animacja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainOne extends JFrame
{
    public MainOne()
    {
        this.setTitle("Animacja");
        this.setBounds(0, 0, 1920, 1080);
        panelAnimacji.setBackground(Color.WHITE);
        final JButton bStart = (JButton) panelButtonow.add(new JButton("Start"));

        bStart.addActionListener(new ActionListener() {
            public void actionPerformed(final ActionEvent e) {
                startAnimation();
            }
        });

        this.getContentPane().add(panelAnimacji);
        this.getContentPane().add(panelButtonow, BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void startAnimation() {
        panelAnimacji.addObiekt();
    }

    private final JPanel panelButtonow = new JPanel();
    private final PanelAnimacji panelAnimacji = new PanelAnimacji();

    public static void main(final String[] args) {
        new MainOne().setVisible(true);
    }

    class PanelAnimacji extends JPanel {
        public void addObiekt(){
            listaObiektow.add(new Obiekt());
            for ( int i = 0; i < 2500; i++) {
                for (int j = 0; j < listaObiektow.size(); j++) {
                    ((Obiekt) listaObiektow.get(j)).ruszObiekt(this);
                    this.paint(this.getGraphics());
                    try {
                        Thread.sleep(1);
                    } catch (final InterruptedException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
            }
        }

        @Override
        public void paintComponent(final Graphics g){
            super.paintComponent(g);

            for(int i = 0; i < listaObiektow.size(); i++){
                g.drawImage(Obiekt.getImg(), ((Obiekt) listaObiektow.get(i)).x, ((Obiekt) listaObiektow.get(i)).y, null);
            }
        }

        ArrayList listaObiektow = new ArrayList();
    }
}

class Obiekt {
    public static Image getImg() {
        return Obiekt.obiekt;
    }

    public void ruszObiekt(final JPanel pojemnik) {
        final Rectangle granicePanelu = pojemnik.getBounds();
        x += dx;
        y += dy;

        if (y + yObiekt >= granicePanelu.getMaxY())
        {
            y = (int)(granicePanelu.getMaxY()-yObiekt);
            dy = -dy;
        }
        if (x + xObiekt >= granicePanelu.getMaxX())
        {
            x = (int)(granicePanelu.getMaxX()-xObiekt);
            dx = -dx;
        }
        if(y < granicePanelu.getMinY())
        {
            y = (int)granicePanelu.getMinX();
            dy = -dy;
        }
        if (x < granicePanelu.getMinX())
        {
            x = (int)granicePanelu.getMinX();
            dx = -dx;
        }
    }
    public static Image obiekt = new ImageIcon("gs.png").getImage();

    int x = 0;
    int y = 0;
    int dx = 1;
    int dy = 1;
    int xObiekt = obiekt.getWidth(null);
    int yObiekt = obiekt.getHeight(null);
}