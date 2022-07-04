package interfaz;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;








import javax.swing.JComboBox;
import javax.swing.JButton;

import Controladora.AgenciaEmpleadora;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class aggCandidato extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField name;
	private JTextField lastname;
	private JTextField idnumber;
	private JTextField age;
	private JTextField phnumber;
	private JTextField especiality;
	private JTextField peticion;
	private JTextField adress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aggCandidato frame = new aggCandidato();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public aggCandidato() {
		setTitle("Insertar nuevo postulante");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 463, 367);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNombre.setBounds(22, 23, 91, 21);
		contentPane.add(lblNombre);
		
		name = new JTextField();
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				char c=a.getKeyChar();
				if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
					JOptionPane.showMessageDialog(null, "Este campo no acepta caracteres especiales ni numeros");
				}
			}
		});
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setBounds(80, 25, 117, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblApellido.setBounds(225, 23, 91, 21);
		contentPane.add(lblApellido);
		
		lastname = new JTextField();
		lastname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				char c=a.getKeyChar();
				if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
					JOptionPane.showMessageDialog(null, "Este campo no acepta caracteres especiales ni numeros");
				}
			}
		});
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lastname.setColumns(10);
		lastname.setBounds(286, 25, 151, 20);
		contentPane.add(lastname);
		
		JLabel lblCi = new JLabel("CI");
		lblCi.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCi.setBounds(42, 69, 44, 21);
		contentPane.add(lblCi);
		
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
		idnumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		idnumber.setColumns(10);
		idnumber.setBounds(80, 69, 117, 20);
		contentPane.add(idnumber);
		
		JLabel lblEscolaridad = new JLabel("Escolaridad");
		lblEscolaridad.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblEscolaridad.setBounds(207, 69, 91, 21);
		contentPane.add(lblEscolaridad);
		
		JComboBox escolaridad = new JComboBox();
		escolaridad.setModel(new DefaultComboBoxModel(new String[] {"Superior", "Tecnico ", "Obrero Calificado", "Otro"}));
		escolaridad.setMaximumRowCount(4);
		escolaridad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		escolaridad.setBounds(296, 65, 141, 28);
		contentPane.add(escolaridad);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblEdad.setBounds(35, 114, 51, 21);
		contentPane.add(lblEdad);
		
		age = new JTextField();
		age.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9'){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "La edad no puede ser negativa");
				}
			}
		});
		age.setFont(new Font("Tahoma", Font.PLAIN, 14));
		age.setColumns(10);
		age.setBounds(80, 116, 44, 20);
		contentPane.add(age);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblTelefono.setBounds(225, 114, 91, 21);
		contentPane.add(lblTelefono);
		
		phnumber = new JTextField();
		phnumber.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9' && phnumber.getText().length() < 8){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "El telefono no puede ser mayor a 8 cifras o poseer valores negativos ");
				}
			}
		});
		phnumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		phnumber.setColumns(10);
		phnumber.setBounds(286, 114, 151, 20);
		contentPane.add(phnumber);
		
		JLabel lblExperiencia = new JLabel("Sexo");
		lblExperiencia.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblExperiencia.setBounds(22, 164, 44, 21);
		contentPane.add(lblExperiencia);
		
		JLabel lblEspecializacion = new JLabel("Especializacion");
		lblEspecializacion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblEspecializacion.setBounds(11, 213, 102, 21);
		contentPane.add(lblEspecializacion);
		
		especiality = new JTextField();
		especiality.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				char c=a.getKeyChar();
				if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
					JOptionPane.showMessageDialog(null, "Este campo no acepta caracteres especiales ni numeros");
				}
			}
		});
		especiality.setFont(new Font("Tahoma", Font.PLAIN, 14));
		especiality.setColumns(10);
		especiality.setBounds(108, 215, 329, 20);
		contentPane.add(especiality);
		
		JLabel lblPeticion = new JLabel("Peticion");
		lblPeticion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblPeticion.setBounds(225, 164, 91, 21);
		contentPane.add(lblPeticion);
		
		peticion = new JTextField();
		peticion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		peticion.setColumns(10);
		peticion.setBounds(286, 166, 151, 20);
		contentPane.add(peticion);
		
		JButton save = new JButton("Guardar y Asignar");
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crearCitas a=new crearCitas();
				a.setAlwaysOnTop(true);
				a.setVisible(true);
				a.setEnabled(true);
			}
		});
		save.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		save.setBounds(135, 294, 179, 34);
		contentPane.add(save);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		comboBox.setToolTipText("M\r\nF");
		comboBox.setMaximumRowCount(4);
		comboBox.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		comboBox.setBounds(81, 164, 60, 21);
		contentPane.add(comboBox);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblDireccion.setBounds(11, 255, 102, 21);
		contentPane.add(lblDireccion);
		
		adress = new JTextField();
		adress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		adress.setColumns(10);
		adress.setBounds(108, 257, 329, 20);
		contentPane.add(adress);
	}
}
