import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;

public class Actividad1 extends JFrame{
	
	/**
	 * Constructor por omision
	 */
    public Actividad1(){
		setTitle("Actividad 1");
		setSize(800,800);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	/**
	 * Metodo que dibuja la imagen 
	 * Se utilizan iteraciones, rotaciones y traslaciones 
	 * para su creacion
	 */
	public void paint(Graphics g){
		Color iz= new Color(255,200,200);
		g.setColor(Color.BLACK);
		int iteraciones=30;
		int b=iteraciones*10;
		int marco=50;
			
		//usamos una traslacion para centrar la imagen
		AffineTransform at = new AffineTransform();
		at.translate(100,30);
		((Graphics2D )g).setTransform(at);
		
		//creamos la imagen de manera iterativa por medio de lineas
		for(int i=0; i<iteraciones+1; i++){
			int x=10*i;
			g.setColor(iz);
			g.drawLine(x+marco,0+marco,b+marco,x+marco);

			g.setColor(Color.red);
			g.drawLine(x+b+marco,0+marco,b+marco,b-x+marco);

			g.setColor(Color.red);
			g.drawLine(x+marco,b*2+marco,b+marco,b*2-x+marco);
			
			g.setColor(iz);
			g.drawLine(x+b+marco,b*2+marco,b+marco,b+x+marco);
			
			g.setColor(iz);
			g.drawLine(0+marco,x+b+marco,b-x+marco,b+marco);
			
			g.setColor(Color.red);
			g.drawLine(0+marco,x+marco,x+marco,b+marco);
			
			g.setColor(iz);
			g.drawLine(b*2+marco,x+marco,b*2-x+marco,b+marco);
			
			g.setColor(Color.red);
			g.drawLine(b*2+marco,b*2-x+marco,b*2-x+marco,b+marco);
			
		}
	
		
		
		//se utiliza una rotacion y traslacion para la misma secuencia
		// para lograr que formen la figura de una flor
		double radian= Math.toRadians(45);
		at.rotate(radian,300,300);
		((Graphics2D )g).setTransform(at);
			at.translate(20,-50);
		((Graphics2D )g).setTransform(at);

		
		
		//creamos la imagen de manera iterativa por medio de lineas
		for(int i=0; i<iteraciones+1; i++){
			int x=10*i;
			g.setColor(iz);
			g.drawLine(x+marco,0+marco,b+marco,x+marco);

			g.setColor(Color.red);
			g.drawLine(x+b+marco,0+marco,b+marco,b-x+marco);

			g.setColor(Color.red);
			g.drawLine(x+marco,b*2+marco,b+marco,b*2-x+marco);
			
			g.setColor(iz);
			g.drawLine(x+b+marco,b*2+marco,b+marco,b+x+marco);
			
			g.setColor(iz);
			g.drawLine(0+marco,x+b+marco,b-x+marco,b+marco);
			
			g.setColor(Color.red);
			g.drawLine(0+marco,x+marco,x+marco,b+marco);
			
			g.setColor(iz);
			g.drawLine(b*2+marco,x+marco,b*2-x+marco,b+marco);
			
			g.setColor(Color.red);
			g.drawLine(b*2+marco,b*2-x+marco,b*2-x+marco,b+marco);
			
		}
	}

	public static void main(String[]args){
		Actividad1 a = new Actividad1();
	}
}
