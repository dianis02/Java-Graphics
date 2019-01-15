import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

import java.awt.geom.AffineTransform;
import java.awt.Graphics2D;

public class Actividad3 extends JFrame{
	/**
	 * Constructor por omision
	 */
    public Actividad3(){
		setTitle("Actividad 3");
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
		int b=80;
		
		//Traslacion para centrar el dibujo
		AffineTransform at = new AffineTransform();
		at.translate(240,-20);
		((Graphics2D )g).setTransform(at);
		
	
		//iteraciones, 2 ciclos anidados
		//j son las filas e i las columnas
		for(int i=1; i<9; i++){
			for(int j=1; j<9; j++){
				
			//condicional para saber como debe ir coloreado el recuadro	
			//se utiliza el modulo para deerminarlo
			if(j%2==1){
				if(i%2==0){
					g.setColor(Color.BLACK);
				}else if(i%2==1){
					g.setColor(Color.white);
					}
			}else if(j%2==0){
				if(i%2==0){
					g.setColor(Color.white);
				}else if(i%2==1){
					g.setColor(Color.BLACK);
					}
			}
		//va creando los cuadrados
		g.fillRect(b*i,b*j,80,80);
			
		
	}
}
}	
	
	public static void main(String[]args){
		Actividad3 a = new Actividad3();
	}
}

