import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Programa Casa de Cambio
//Autor: Vazquez Ramirez Luis Gerardo
//Instituto Tecnologico de Chetumal
//Fecha 16-Junio-2016
//Materia: Topicos Avanzados de Programacion
//Examen de Recuperacion Unidad 3

public class ConvertirEuros extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Declaracion de Variables
	JLabel cabecera, lblPesos, lblDolares, lblEuros, lblResultados;
	JTextField txtPesos, txtDolares, txtEuros;
	JButton btnConvertir;
	double pesos, dolar, euro;
	
	public ConvertirEuros(){
		super("Convertir Euros");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(400, 160, 320, 300);
		JPanel pnlCont = new JPanel(null);
		
		//Cabecera
		cabecera = new JLabel("Conversor Euros");
		cabecera.setBounds(100, 20, 160, 20);
		pnlCont.add(cabecera);
		
		//Jlabel y campo para la cantidad de Pesos
		lblEuros = new JLabel("Ingrese Euros: ");
		lblEuros.setBounds(20, 80, 100, 14);
		pnlCont.add(lblEuros);
		txtEuros = new JTextField();
		txtEuros.setBounds(110, 75, 80, 25);
		pnlCont.add(txtEuros);
		
		//Boton Convertir
		btnConvertir = new JButton("Convertir!");
		btnConvertir.setBounds(200, 72, 100, 30);
		pnlCont.add(btnConvertir);
		btnConvertir.addActionListener( 
				new ActionListener(){ // clase interna anonima 				 
					// termina la aplicacion cuando el usuario hace clic en elementoSalir 
					public void actionPerformed( ActionEvent evento ) { 
						try{
							euro = Double.parseDouble(txtEuros.getText());	
							pesos = euro * 19.5;			
							txtPesos.setText(""+pesos);
							dolar = euro * 0.9;					
							txtDolares.setText(""+dolar);
						}
						catch (Exception e){
						 	JOptionPane.showMessageDialog(null, "No ha ingresado un numero");
						}	 
					} 
				} 
		);
		
		//Etiqueta resultados
		lblResultados = new JLabel("Resultados");
		lblResultados.setBounds(110, 110, 160, 20);
		pnlCont.add(lblResultados);
		
		//Jlabel y campo para la cantidad de Dolares
		lblPesos = new JLabel("Pesos: ");
		lblPesos.setBounds(20, 150, 80, 14);
		pnlCont.add(lblPesos);
		txtPesos = new JTextField();
		txtPesos.setBounds(110, 145, 120, 25);
		pnlCont.add(txtPesos);
		
		//Jlabel y campo para la cantidad de Euros
		lblDolares = new JLabel("Dolares: ");
		lblDolares.setBounds(20, 190, 80, 14);
		pnlCont.add(lblDolares);
		txtDolares = new JTextField();
		txtDolares.setBounds(110, 185, 120, 25);
		pnlCont.add(txtDolares);		
		
		setContentPane(pnlCont);
		setVisible(true);
	}
}
