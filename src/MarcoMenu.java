import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

//Programa Casa de Cambio
//Autor: Vazquez Ramirez Luis Gerardo
//Instituto Tecnologico de Chetumal
//Fecha 16-Junio-2016
//Materia: Topicos Avanzados de Programacion
//Examen de Recuperacion Unidad 3

public class MarcoMenu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel cabecera;
	JButton btnPesos, btnDolares, btnEuros, btnSalir;
	
	public MarcoMenu(){
		super("Casa de Cambio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 160, 370, 350);
		JPanel pnlCont = new JPanel(null);
		
		JMenu menuArchivo = new JMenu( "Archivo" ); // crea el menu archivo 
		// crea el elemento de menu Acerca de... 
		JMenuItem elementoAcercaDe = new JMenuItem( "Acerca de..." );
		menuArchivo.add( elementoAcercaDe ); // agrega el elemento elementoAcercaDe al    menu archivo 
		//Manejador de Eventos del Boton Acerca d.. con una clase interna anonima
		elementoAcercaDe.addActionListener(
				new ActionListener() // clase interna anonima 
				{      // muestra cuadro de dialogo de mensaje cuando el usuario selecciona Acerca de...      
					public void actionPerformed( ActionEvent evento ){ 
						JOptionPane.showMessageDialog( null, 
								"Programa de Cambio de Divisas\n\tAutor: Gerardo Vazquez\n\tISC", 
								"Acerca de", JOptionPane.PLAIN_MESSAGE ); 
						} // fin del metodo actionPerformed 
				}
		);
		//Creacion del JMenuItem Salir
		JMenuItem elementoSalir = new JMenuItem( "Salir" ); // crea el elemento salir 
		menuArchivo.add( elementoSalir ); // agrega elemento salir al menu archivo 
		//Manejador de Eventos del boton Salir con una clase interna anonima
		elementoSalir.addActionListener( 
				new ActionListener() // clase interna anonima 
				{ 
					// termina la aplicacion cuando el usuario hace clic en elementoSalir 
					public void actionPerformed( ActionEvent evento ) 
					{ 
						System.exit( 0 ); 
						} 
					} 
		);
		
		//Agregamos al JMenu
		JMenuBar barra = new JMenuBar();
		setJMenuBar(barra);
		barra.add(menuArchivo);
		
		//Cabecera
		cabecera = new JLabel("Conversor Divisas");
		cabecera.setBounds(130, 20, 160, 20);
		pnlCont.add(cabecera);
		
		//Boton Pesos
		btnPesos = new JButton("Convertir Pesos");
		btnPesos.setBounds(110, 80, 120, 35);
		pnlCont.add(btnPesos);
		btnPesos.addActionListener( 
				new ActionListener(){ // clase interna anonima 				 
					// termina la aplicacion cuando el usuario hace clic en elementoSalir 
					public void actionPerformed( ActionEvent evento ) { 
						try{
							JFrame.setDefaultLookAndFeelDecorated(true);
							JDialog.setDefaultLookAndFeelDecorated(true);
							UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
							//crea el objeto JFrame
							@SuppressWarnings("unused")
							ConvertirPesos aplicacionPeso = new ConvertirPesos();//					
						}
						catch (Exception e){
						 	e.printStackTrace();
						}	 
					} 
				} 
		);
		
		//Boton Dolares
		btnDolares = new JButton("Convertir Dolares");
		btnDolares.setBounds(110, 130, 120, 35);
		pnlCont.add(btnDolares);
		btnDolares.addActionListener( 
				new ActionListener(){ // clase interna anonima 				 
					// termina la aplicacion cuando el usuario hace clic en elementoSalir 
					public void actionPerformed( ActionEvent evento ) { 
						try{
							JFrame.setDefaultLookAndFeelDecorated(true);
							JDialog.setDefaultLookAndFeelDecorated(true);
							UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
							//crea el objeto JFrame
							@SuppressWarnings("unused")
							ConvertirDolares aplicacionDolar = new ConvertirDolares();//					
						}
						catch (Exception e){
						 	e.printStackTrace();
						}	 
					} 
				} 
		);
		
		//Boton Euros
		btnEuros = new JButton("Convertir Euros");
		btnEuros.setBounds(110, 180, 120, 35);
		pnlCont.add(btnEuros);
		btnEuros.addActionListener( 
				new ActionListener(){ // clase interna anonima 				 
					// termina la aplicacion cuando el usuario hace clic en elementoSalir 
					public void actionPerformed( ActionEvent evento ) { 
						try{
							JFrame.setDefaultLookAndFeelDecorated(true);
							JDialog.setDefaultLookAndFeelDecorated(true);
							UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
							//crea el objeto JFrame
							@SuppressWarnings("unused")
							ConvertirEuros aplicacionEuro = new ConvertirEuros();//					
						}
						catch (Exception e){
						 	e.printStackTrace();
						}	 
					} 
				} 
		);
		
		//Boton Salir
		btnSalir = new JButton("Salir");
		btnSalir.setBounds(110, 230, 120, 30);
		pnlCont.add(btnSalir);
		btnSalir.addActionListener( 
				new ActionListener() // clase interna anonima 
				{ 
					// termina la aplicacion cuando el usuario hace clic en elementoSalir 
					public void actionPerformed( ActionEvent evento ) 
					{ 
						System.exit( 0 ); 
						} 
					} 
		);
		
		setContentPane(pnlCont);
		setVisible(true);
	}
}
