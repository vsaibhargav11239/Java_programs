import java.applet.Applet;
import java.awt.*;

/*
<applet code="HumanFaceApplet.class" width="400" height="400"></applet>
*/

public class HumanFaceApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillOval(100, 50, 200, 250);

        g.setColor(Color.WHITE);
        g.fillOval(140, 120, 40, 30);
        g.fillOval(220, 120, 40, 30);

        g.setColor(Color.BLACK);
        g.fillOval(155, 130, 10, 10);
        g.fillOval(235, 130, 10, 10);

        g.setColor(Color.BLACK);
        g.drawLine(200, 150, 190, 190);
        g.drawLine(190, 190, 200, 190);

        g.setColor(Color.RED);
        g.drawArc(150, 200, 100, 50, 0, -180);
    }
}