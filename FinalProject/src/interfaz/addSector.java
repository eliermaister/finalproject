package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import Controladora.AgenciaEmpleadora;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addSector extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addSector frame = new addSector();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public addSector() {
		setTitle("Nuevo Sector");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 308, 154);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNuevoSector = new JLabel("Nuevo Sector");
		lblNuevoSector.setBounds(10, 11, 65, 14);
		contentPane.add(lblNuevoSector);
		
		textField = new JTextField();
		textField.setBounds(85, 11, 184, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int opcion = JOptionPane.showConfirmDialog(null, "Seguro que desea insertar el nuevo sector");
				System.out.print(opcion);
				if(opcion == JOptionPane.YES_OPTION){
					String nuevoSector = textField.getText();
					
					boolean creado = AgenciaEmpleadora.getAgenciaEmpleadora().nuevoSector(nuevoSector);
					
					if(creado){
						JOptionPane.showMessageDialog(null, "Sector Creado.");
						dispose();
					}else
						JOptionPane.showMessageDialog(null, "Ya existe el sector.");
				}
				
				
			}
		});
		btnGuardar.setBounds(101, 81, 89, 23);
		contentPane.add(btnGuardar);
	}
}
