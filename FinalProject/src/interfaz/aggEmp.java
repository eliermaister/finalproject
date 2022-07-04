package interfaz;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class aggEmp extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JTextField nameEmp;
	private JTextField specEmp;
	private JTextField addresEmp;
	private JTextField expEmp;
	private JTextField capaEmp;
	private JTextField idEmp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					aggEmp frame = new aggEmp();
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
	public aggEmp() {
		setTitle("Agregar Oferta");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 362);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblN = new JLabel("Nombre del puesto");
		lblN.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblN.setBounds(10, 11, 101, 21);
		contentPane.add(lblN);
		
		nameEmp = new JTextField();
		nameEmp.setBounds(121, 12, 291, 20);
		contentPane.add(nameEmp);
		nameEmp.setColumns(10);
		
		JLabel lblEspecializacion = new JLabel("Especializacion");
		lblEspecializacion.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblEspecializacion.setBounds(10, 46, 91, 21);
		contentPane.add(lblEspecializacion);
		
		specEmp = new JTextField();
		specEmp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent a) {
				char c=a.getKeyChar();
				if((c<'a'||c>'z')&&(c<'A'||c>'Z')){
					JOptionPane.showMessageDialog(null, "este campo no acepta caracteres especiales ni numeros");
				}
			}
		});
		specEmp.setBounds(121, 47, 291, 20);
		contentPane.add(specEmp);
		specEmp.setColumns(10);
		
	
		
		JLabel lblExperienciaRequerida = new JLabel("Experiencia Requerida");
		lblExperienciaRequerida.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblExperienciaRequerida.setBounds(10, 94, 124, 21);
		contentPane.add(lblExperienciaRequerida);
		
		expEmp = new JTextField();
		expEmp.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9' &&expEmp.getText().length() >= 0 && expEmp.getText().length() <=1){
					
				}
				
				
				else{
					JOptionPane.showMessageDialog(null," La experiencia requerida no pude ser mayor de 2 cifras o negativa");
				}
			}
		});
		expEmp.setBounds(144, 95, 86, 20);
		contentPane.add(expEmp);
		expEmp.setColumns(10);
		
		JLabel lblNivelRequerido = new JLabel("Nivel Requerido");
		lblNivelRequerido.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblNivelRequerido.setBounds(10, 142, 124, 21);
		contentPane.add(lblNivelRequerido);
		
		JComboBox reqLv = new JComboBox();
		reqLv.setModel(new DefaultComboBoxModel(new String[] {"Superior", "Tecnico ", "Obrero Calificado", "Otro"}));
		reqLv.setMaximumRowCount(4);
		reqLv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		reqLv.setBounds(121, 142, 146, 21);
		contentPane.add(reqLv);
		
		JLabel lblCantidadDePlazas = new JLabel("Cantidad de Plazas");
		lblCantidadDePlazas.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblCantidadDePlazas.setBounds(10, 179, 124, 21);
		contentPane.add(lblCantidadDePlazas);
		
		capaEmp = new JTextField();
		capaEmp.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9'){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "La cantidad de plazas no puede ser negativa");
				}
			}
		});
		capaEmp.setBounds(144, 180, 86, 20);
		contentPane.add(capaEmp);
		capaEmp.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		lblId.setBounds(83, 213, 28, 21);
		contentPane.add(lblId);
		
		idEmp = new JTextField();
		idEmp.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9' && idEmp.getText().length() < 6){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "El ID no puede ser mayor a 6 cifras o poseer valores negativos ");
				}
			}
		});
		idEmp.setBounds(144, 214, 86, 20);
		contentPane.add(idEmp);
		idEmp.setColumns(10);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton.setBounds(168, 289, 109, 23);
		contentPane.add(btnNewButton);
	}
}
