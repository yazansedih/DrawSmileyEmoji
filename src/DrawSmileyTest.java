import javax.swing.*;
import java.awt.*;
import java.awt.geom.Point2D;




public class DrawSmileyTest {
    public static void main(String[] args) {

        DrawSmiley zzz = new DrawSmiley();
        JFrame frame = new JFrame("Draw Smiley");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(zzz);
        frame.setSize(240,280);

        frame.setVisible(true);
    }
}
class DrawSmiley extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setBackground(Color.BLACK);

        g2d.setPaint(Color.ORANGE);
        g2d.fillOval(15, 20, 190, 190);

        g2d.setPaint(new Color(254,179,6,255));
        BasicStroke s = new BasicStroke(7f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        g2d.setStroke(s);
        g2d.drawOval(15,20,190,190);

        // draw the eyes
        g2d.setPaint(Color.BLACK);
        s = new BasicStroke(14f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        g2d.setStroke(s);
        g2d.drawArc(45, 80, 60, 170, 60, 60);
        g2d.drawArc(115, 80, 60, 170, 60, 60);

        // draw the mouth
        s = new BasicStroke(12f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL);
        g2d.setStroke(s);
        g2d.drawArc(15, -83, 190, 250, -60, -60);
        g2d.setPaint(Color.blue);

        // draw the makeup
        Color c = new Color(252, 144, 15, 255);
        Color[] colors = {c, Color.ORANGE, Color.yellow};
        float[] dist = {0.00005f, 0.22f, 0.85f};
        Point2D center = new Point2D.Float(50,125);
        RadialGradientPaint p = new RadialGradientPaint(center,110,dist,colors);
        g2d.setPaint(p);
        g2d.fillOval(23,100,50,50);

        center = new Point2D.Float(175,125);
        p = new RadialGradientPaint(center,110,dist,colors);
        g2d.setPaint(p);
        g2d.fillOval(147,100,50,50);

    }
}




























