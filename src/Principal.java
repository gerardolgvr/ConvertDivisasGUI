import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

//Programa Casa de Cambio
//Autor: Vazquez Ramirez Luis Gerardo
//Instituto Tecnologico de Chetumal
//Fecha 16-Junio-2016
//Materia: Topicos Avanzados de Programacion
//Examen de Recuperacion Unidad 3

public class Principal {

	public static void main(String[] args) {
		int numero = 0;
		//Pone Look and Feel del sistema operativo (Apariencia de las ventanas y elementos
		try{
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			//crea el objeto JFrame
			@SuppressWarnings("unused")
			MarcoMenu aplicacion = new MarcoMenu();//					
		}
		catch (Exception e){
		 	e.printStackTrace();
		}	

	}

}
