package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.TextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class eliminarCandidato extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarCandidato frame = new eliminarCandidato();
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
	public eliminarCandidato() {
		setTitle("Eliminar Postulante");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumeroDeId = DefaultComponentFactory.getInstance().createLabel("Numero de ID de la Persona");
		lblNumeroDeId.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNumeroDeId.setBounds(10, 11, 189, 14);
		contentPane.add(lblNumeroDeId);
		
		idnumber = new JTextField();
		idnumber.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9' && idnumber.getText().length() < 11){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "El ID no puede ser mayor a 11 cifras o poseer valores negativos ");
				}
			}
		});
		idnumber.setBounds(198, 10, 118, 20);
		contentPane.add(idnumber);
		idnumber.setColumns(10);
		
		JButton search = new JButton("Buscar");
		search.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		search.setBounds(326, 9, 89, 23);
		contentPane.add(search);
		
		TextArea informacion = new TextArea();
		informacion.setBounds(20, 31, 380, 135);
		contentPane.add(informacion);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnEliminar.setBounds(172, 212, 89, 38);
		contentPane.add(btnEliminar);
	}
}
