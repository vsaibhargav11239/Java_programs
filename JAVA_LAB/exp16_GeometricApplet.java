import java.applet.Applet;
import java.awt.*;

/*
<applet code="GeometricApplet.class" width="400" height="400"></applet>
*/

public class GeometricApplet extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawRect(50, 50, 100, 100);
        g.setColor(Color.BLUE);
        g.drawOval(200, 50, 100, 100);
        g.setColor(Color.GREEN);
        g.drawLine(50, 200, 300, 200);
        g.setColor(Color.MAGENTA);
        g.drawRect(150, 250, 100, 50);
    }
}