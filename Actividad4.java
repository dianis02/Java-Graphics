import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;

public class Actividad4 extends JFrame{
	/**
	 *Constructor por omision
	 */
    public Actividad4(){
		setTitle("Actividad 4");
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/**
	 * Metodo que dibuja un gusanito
	 * 
	 */
	public void paint(Graphics g){
		//crea el cuerpo, cabeza
		g.setColor(Color.green);
		g.fillOval(80,80,350,350);
		g.fillOval(200,380,300,250);
		g.fillOval(430,500,250,200);
		g.fillOval(620,550,200,150);
		g.fillOval(710,490,150,100);
		g.fillOval(760,420,100,100);
	
		//hacemos la cara
		//ojos
		g.setColor(Color.BLACK);
		g.fillOval(120,130,100,100);
		g.fillOval(290,130,100,100);
		//boca
		g.drawLine(150,300,350,300);
		g.setColor(Color.white);
		//dientes y brillo de los ojos
		g.fillRect(160,303,70,70);
		g.fillRect(270,303,70,70);
		g.fillOval(140,130,50,50);
		g.fillOval(310,130,50,50);
		//mejillas
		g.setColor(Color.red);
		g.fillOval(100,230,50,50);
		g.fillOval(360,230,50,50);
		
		//antenas, se utiliza rotaciones
		g.setColor(Color.green);
		AffineTransform at = new AffineTransform();
		double radian= Math.toRadians(-25);
		at.rotate(radian,300,300);
		((Graphics2D )g).setTransform(at);
		
		g.fillRect(280,-20,20,140);
		double radian2= Math.toRadians(50);
		at.rotate(radian2,300,300);
		((Graphics2D )g).setTransform(at);
		g.fillRect(200,20,20,140);
		
		
		
		}	
	
	public static void main(String[]args){
		Actividad4 a = new Actividad4();
	}
}
