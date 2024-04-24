import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Hash extends Component {
    private int w;
    private int h;
    public Hash(int w, int h){
        this.h=h;
        this.w=w;
    }
    @Override
    public void paint(Graphics g){
        Graphics2D gg=(Graphics2D) g;
        Graphics2D gg2=(Graphics2D) g;
        Rectangle r=new Rectangle(40, 40, w, h);
        gg.setColor(Color.BLUE);
        gg.fill(r);
        gg2.setColor(Color.magenta);
        gg2.drawString("iran", 40, 40+w/2);
    }

}
