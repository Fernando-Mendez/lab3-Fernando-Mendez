import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
                        //Paint the background
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillRect(x1, y1, width + 1, height + 1);
//                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.RED);
//                        g.drawRect(x1+10, y1+10, width-20, height-20);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.GREEN);
//                        g.drawLine(width, y1, x1, height);
                        
                        g.setColor(Color.CYAN);
                        int ovalDiameter = 55;
                        g.fillOval( width/2 - ovalDiameter/2 , height/2 - ovalDiameter/2, ovalDiameter , ovalDiameter );
                        
                        
            }
}