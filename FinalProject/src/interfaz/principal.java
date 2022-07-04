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

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.JPasswordField;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class principal {

	private JFrame frmNuevo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal window = new principal();
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
	public principal() {
		initialize();
	}
	/*
	 * Dar visibilidad a las ventanas
	 */
	public void show(){
		frmNuevo.setVisible(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNuevo = new JFrame();
		frmNuevo.getContentPane().setBackground(Color.WHITE);
		frmNuevo.setAlwaysOnTop(true);
		frmNuevo.getContentPane().setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBounds(170, 191, -47, -66);
		frmNuevo.getContentPane().add(horizontalBox);
		frmNuevo.setBackground(UIManager.getColor("Button.background"));
		frmNuevo.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Proyectos\\Java\\Final Project\\images\\balance_la-fouine_suite.png"));
		frmNuevo.setTitle("Nuevo Sistema de Bolsa Laboral");
		frmNuevo.setBounds(100, 100, 450, 300);
		frmNuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmNuevo.setJMenuBar(menuBar);
		
		JMenu mnGeneral = new JMenu("Ofertas");
		menuBar.add(mnGeneral);
		
		JMenuItem mntmAadirSector = new JMenuItem("A\u00F1adir Sector");
		mntmAadirSector.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				addSector a = new addSector();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		mnGeneral.add(mntmAadirSector);
		
		JMenuItem mntmAadirEmpresa = new JMenuItem("A\u00F1adir Empresa");
		mntmAadirEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aggEmpresa a=new aggEmpresa();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		mnGeneral.add(mntmAadirEmpresa);
		
		JMenuItem mntmAadirOfertaLaboral = new JMenuItem("A\u00F1adir Oferta Laboral");
		mntmAadirOfertaLaboral.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aggEmp a = new aggEmp();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
				
			}
		});
		mnGeneral.add(mntmAadirOfertaLaboral);
		
		JMenuItem mntmEliminarOfertas = new JMenuItem("Eliminar Ofertas");
		mntmEliminarOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarOferta a=new eliminarOferta();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		mnGeneral.add(mntmEliminarOfertas);
		
		JMenuItem mntmEliminarEmpresa = new JMenuItem("Eliminar Empresa");
		mntmEliminarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarEmpresa a=new eliminarEmpresa();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
			
		});
		mnGeneral.add(mntmEliminarEmpresa);
		
		JMenu mnNewMenu = new JMenu("Candidatos");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAadir = new JMenuItem("A\u00F1adir Candidato");
		mnNewMenu.add(mntmAadir);
		
		JMenuItem mntmEliminarPostulantte = new JMenuItem("Eliminar Candidato");
		mntmEliminarPostulantte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eliminarCandidato a=new eliminarCandidato();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		mnNewMenu.add(mntmEliminarPostulantte);
		
		JMenuItem mntmAgregarCitas = new JMenuItem("Agregar Nuevas Citas");
		mntmAgregarCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				crearCitas a=new crearCitas();
				a.setAlwaysOnTop(true);
				a.setVisible(true);
				a.setEnabled(true);
			}
		});
		mnNewMenu.add(mntmAgregarCitas);
		mntmAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				aggCandidato a = new aggCandidato();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		
		JMenu mnListas = new JMenu("Consultas");
		menuBar.add(mnListas);
		
		JMenuItem mntmRevisarPostulantes = new JMenuItem("Revisar Postulantes");
		mntmRevisarPostulantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reportes a=new reportes();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		mnListas.add(mntmRevisarPostulantes);
		
		JMenuItem mntmRevisarOfertas = new JMenuItem("Revisar Ofertas");
		mntmRevisarOfertas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reportes a=new reportes();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		
		mnListas.add(mntmRevisarOfertas);
		
		JMenu mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		JMenuItem mntmPersonas = new JMenuItem("Personas con mas citas");
		mntmPersonas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reportes a=new reportes();
				a.setAlwaysOnTop(true);
				a.setEnabled(true);
				a.setVisible(true);
			}
		});
		mnReportes.add(mntmPersonas);
	}

	protected Color getFrmNuevoContentPaneBackground() {
		return frmNuevo.getContentPane().getBackground();
	}
	protected void setFrmNuevoContentPaneBackground(Color background) {
		frmNuevo.getContentPane().setBackground(background);
	}
}
