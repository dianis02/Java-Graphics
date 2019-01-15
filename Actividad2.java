import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;

public class Actividad2 extends JFrame{
	/**
	 * Constructor por omision
	 */
    public Actividad2(){
		setTitle("Actividad 2");
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * Metodo que dibuja la imagen 
	 * Se utilizan iteraciones
	 * para su creacion
	 */
	public void paint(Graphics g){
		Color iz= new Color(255,200,200);
		g.setColor(Color.BLACK);
		int iteraciones=30;
		int b=iteraciones*10;
		int marco=50;
			
		
		AffineTransform at = new AffineTransform();
		at.translate(100,30);
		((Graphics2D )g).setTransform(at);
		
		//creacion de las forma de color rosa en el marco
		for(int i=0; i<iteraciones+1; i++){
			int x=10*i;
			g.setColor(iz);
			g.drawLine(x+marco,0+marco,b+marco,x+marco);

			g.setColor(iz);
			g.drawLine(x+b+marco,0+marco,b+marco,b-x+marco);

			g.setColor(iz);
			g.drawLine(x+marco,b*2+marco,b+marco,b*2-x+marco);
			
			g.setColor(iz);
			g.drawLine(x+b+marco,b*2+marco,b+marco,b+x+marco);
			
			g.setColor(iz);
			g.drawLine(0+marco,x+b+marco,b-x+marco,b+marco);
			
			g.setColor(iz);
			g.drawLine(0+marco,x+marco,x+marco,b+marco);
			
			g.setColor(iz);
			g.drawLine(b*2+marco,x+marco,b*2-x+marco,b+marco);
			
			g.setColor(iz);
			g.drawLine(b*2+marco,b*2-x+marco,b*2-x+marco,b+marco);
			
		}
		
		//creacion de las formas de color azul en las esquinas
		// y del diamante rojo en el centro
		for(int i=0; i<iteraciones+1; i++){
			int x=10*i;
			g.setColor(Color.blue);
			g.drawLine(0+marco,x+marco,b-x+marco,0+marco);
			
			g.setColor(Color.blue);
			g.drawLine(b+x+marco,0+marco,b*2+marco,x+marco);

			g.setColor(Color.blue);
			g.drawLine(0+marco,b+x+marco,x+marco,b*2+marco);
		
			g.setColor(Color.blue);
			g.drawLine(b*2+marco,b+x+marco,b*2-x+marco,b*2+marco);
			
			//iteraciones del diamante
			g.setColor(Color.red);
			g.drawLine(b*2-x+marco,b+marco,b+marco,b-x+marco);
			
			g.setColor(Color.red);
			g.drawLine(b-x+marco,b+marco,b+marco,x+marco);
			
			
			g.setColor(Color.red);
			g.drawLine(x+marco,b+marco,b+marco,b+x+marco);
			
			g.setColor(Color.red);
			g.drawLine(b*2-x+marco,b+marco,b+marco,b+x+marco);
			
		}
		
		
		
		
		
		
		
		}
		
		

	public static void main(String[]args){
		Actividad2 a = new Actividad2();
	}
}
