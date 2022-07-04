package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JLabel;

import Controladora.AgenciaEmpleadora;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JPasswordField;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class autenticar {

	private JFrame frmNuevo;
	private JTextField userText;
	private JPasswordField passwordText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					autenticar window = new autenticar();
					window.frmNuevo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public autenticar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuevo = new JFrame();
		frmNuevo.getContentPane().setBackground(new Color(153, 255, 255));
		frmNuevo.setAlwaysOnTop(true);
		frmNuevo.getContentPane().setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(170, 191, -47, -66);
		frmNuevo.getContentPane().add(horizontalBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 180, 150);
		frmNuevo.getContentPane().add(panel);
		panel.setLayout(null);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(45, 68, 87, 20);
		panel.add(passwordText);
		
		JLabel lblContrasea = DefaultComponentFactory.getInstance().createTitle("Contrase\u00F1a");
		lblContrasea.setBounds(52, 50, 72, 21);
		panel.add(lblContrasea);
		lblContrasea.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		
		JButton btnAutenticar = new JButton("Autenticar");
		btnAutenticar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String user = userText.getText();
				String pass = passwordText.getText();
				
				boolean correcto = AgenciaEmpleadora.getAgenciaEmpleadora().login(user, pass);
				if(correcto){
					principal principal = new principal();
					principal.show();	
					frmNuevo.dispose();
				}else{
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta.");
				}
			}
		});
		btnAutenticar.setBounds(45, 99, 87, 25);
		panel.add(btnAutenticar);
		btnAutenticar.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		
		userText = new JTextField();
		userText.setBounds(45, 30, 86, 20);
		panel.add(userText);
		userText.setColumns(10);
		
		JLabel lblUsuario = DefaultComponentFactory.getInstance().createLabel("Usuario");
		lblUsuario.setBounds(61, 11, 54, 14);
		panel.add(lblUsuario);
		lblUsuario.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		frmNuevo.setBackground(UIManager.getColor("Button.background"));
		frmNuevo.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyectos\\Java\\Final Project\\images\\balance_la-fouine_suite.png"));
		frmNuevo.setTitle("Login");
		frmNuevo.setBounds(100, 100, 196, 189);
		frmNuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	protected Color getFrmNuevoContentPaneBackground() {
		return frmNuevo.getContentPane().getBackground();
	}
	protected void setFrmNuevoContentPaneBackground(Color background) {
		frmNuevo.getContentPane().setBackground(background);
	}
}
