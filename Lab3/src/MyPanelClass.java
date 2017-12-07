import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
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
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Top Red Square
                        Polygon topSquare = new Polygon();
                        topSquare.addPoint(x1 , y1);
                        topSquare.addPoint(x2+1, y1);
                        topSquare.addPoint(x2+1, height/5);
                        topSquare.addPoint(x1, height/5);
                        g.setColor(Color.RED);
                        g.fillPolygon(topSquare);
                        
                        //Middle Red Square
                        Polygon middleSquare = new Polygon();
                        middleSquare.addPoint(x1 , height/3);
                        middleSquare.addPoint(x2+1, height/3);
                        middleSquare.addPoint(x2+1, height*2/3);
                        middleSquare.addPoint(x1, height*2/3);
                        g.setColor(Color.RED);
                        g.fillPolygon(middleSquare);
                        
                        //Bottom Red Square
                        Polygon bottomSquare = new Polygon();
                        bottomSquare.addPoint(x1, height*4/5);
                        bottomSquare.addPoint(x2+1, height*4/5);
                        bottomSquare.addPoint(x2+1, y2+1);
                        bottomSquare.addPoint(x1, y2+1);
                        g.setColor(Color.RED);
                        g.fillPolygon(bottomSquare);
                        
                        //Triangle for the Flag
                        Polygon triangle = new Polygon();
                        triangle.addPoint(x1,y1);
                        triangle.addPoint(width/2, height/2);
                        triangle.addPoint(x1, y1+height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(triangle);
                        
                        //Star for the Flag
                        Polygon star = new Polygon();
                        	int lusp = width/10 - 10;
                        	int tmp = ((lusp*(5/2) +width/1000)+ (lusp*3) +width/1000)/2;
	                        //Flat star surface - Left side
	                        star.addPoint(lusp +width/1000, (height/2) - (height/(19/2)));
	                        star.addPoint(lusp*2 +width/1000, (height/2) - (height/(19/2)));
	                        //Pointy part of the star
	                        star.addPoint(tmp, height/3);
	                        //Flat star surface - Right side
	                        star.addPoint(lusp*3 +width/1000, (height/2) - (height/(19/2)));
	                        star.addPoint(lusp*4 +width/1000, (height/2) - (height/(19/2)));
	                        
	                        //Middle Part of the Star and Bottom Leg - Right side
	                        star.addPoint(lusp*3 +width/1500, (height/2)-50*(height/1000));
	                        star.addPoint((lusp*4 + lusp*3)/2 +width/1000 + (width/1000)*30, (height*2/3) - (height/(19/2)) + (height/1000)*90);
	                        
	                        //Middle Part of the Star - Center Side
	                        star.addPoint(tmp, height/2);
	                        //Middle Part of the Star and Bottom Leg - Left Side(		(height*2/3) - 50
	                        star.addPoint((lusp + lusp*2)/2 +width/1500 - (width/1000)*30, height*2/3 - (height/(19/2)) + (height/1000)*90 );
	                        star.addPoint(lusp*2 +width/1000, (height/2)-(height/1000)*50);    
	                    	  
	             
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(star);

            }//End of Method
}//End of Class