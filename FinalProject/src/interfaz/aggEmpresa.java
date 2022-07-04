package interfaz;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class aggEmpresa extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField addres;
	private JTextField telf;
	private JTextField idSector;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aggEmpresa frame = new aggEmpresa();
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
	public aggEmpresa() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Agregar Empresa");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = DefaultComponentFactory.getInstance().createLabel("Nombre ");
		lblNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNombre.setBounds(10, 11, 64, 21);
		contentPane.add(lblNombre);
		
		name = new JTextField();
		name.setBounds(89, 13, 292, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblDireccion = DefaultComponentFactory.getInstance().createLabel("Direccion");
		lblDireccion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblDireccion.setBounds(10, 54, 75, 26);
		contentPane.add(lblDireccion);
		
		addres = new JTextField();
		addres.setColumns(10);
		addres.setBounds(89, 59, 292, 20);
		contentPane.add(addres);
		
		JLabel lblTelefono = DefaultComponentFactory.getInstance().createTitle("Telefono");
		lblTelefono.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblTelefono.setBounds(10, 109, 92, 14);
		contentPane.add(lblTelefono);
		
		telf = new JTextField();
		telf.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9' && telf.getText().length() < 8){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "El numero de telefono  no puede ser mayor a 6 cifras o poseer valores negativos ");
				}
			}
		});
		telf.setColumns(10);
		telf.setBounds(89, 106, 112, 20);
		contentPane.add(telf);
		
		JLabel lblSector = DefaultComponentFactory.getInstance().createTitle(" ID Sector ");
		lblSector.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblSector.setBounds(10, 147, 92, 14);
		contentPane.add(lblSector);
		
		idSector = new JTextField();
		idSector.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9' && idSector.getText().length() < 2){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "El ID no puede ser mayor a 2 cifras o poseer valores negativos ");
				}
			}
		});
		idSector.setColumns(10);
		idSector.setBounds(89, 144, 112, 20);
		contentPane.add(idSector);
		
		JButton save = new JButton("Guardar");
		save.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		save.setBounds(168, 212, 89, 38);
		contentPane.add(save);
	}
}
