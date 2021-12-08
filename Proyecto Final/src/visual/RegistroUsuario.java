package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import logico.Administrador;
import logico.Usuario;
import logico.Clinica;
import logico.Medico;

import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class RegistroUsuario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JPanel panel_Administrativo;
	private JLabel lblCorreo_admin;
	private JLabel lblContrasena_admin;
	private JTextField txtUsuario_admin;
	private JTextField txtContrasenna_admin;
	private JPanel panel_Medico;
	private JRadioButton rdbAdministrativo;
	private JRadioButton rdbMedico;
	private JTextField txtUsuario_vendedor;
	private JTextField txtContrasenna_Vendedor;
	private JLabel lblContrasenna_vendedor;
	private JLabel lblUsuario_vendedor;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public RegistroUsuario() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\git\\ProyectoFinall\\Proyecto Final\\2695.png"));
		setForeground(UIManager.getColor("Button.focus"));
		setBackground(UIManager.getColor("Button.focus"));
		
		setModal(false);
		setResizable(false);
		setTitle("Registro de Usuario");
		setBounds(100, 100, 637, 428);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setForeground(new Color(224, 255, 255));
		contentPanel.setBackground(new Color(224, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(224, 255, 255));
			panel.setForeground(UIManager.getColor("Button.focus"));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setForeground(Color.DARK_GRAY);
			panel_1.setBackground(new Color(224, 255, 255));
			panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n General", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLACK));
			panel_1.setBounds(10, 11, 591, 133);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("C\u00E9dula:");
			
			lblNewLabel.setBackground(UIManager.getColor("Button.focus"));
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setBounds(10, 35, 87, 14);
			panel_1.add(lblNewLabel);
			
			JLabel label = new JLabel("Nombre:");
			
			label.setForeground(Color.BLACK);
			label.setBackground(UIManager.getColor("Button.focus"));
			label.setBounds(10, 84, 73, 14);
			panel_1.add(label);
			
			JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
			
			lblDireccin.setForeground(Color.BLACK);
			lblDireccin.setBackground(UIManager.getColor("Button.focus"));
			lblDireccin.setBounds(338, 35, 107, 14);
			panel_1.add(lblDireccin);
			
			JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
			
			lblTelfono.setForeground(Color.BLACK);
			lblTelfono.setBackground(UIManager.getColor("Button.focus"));
			lblTelfono.setBounds(338, 84, 107, 14);
			panel_1.add(lblTelfono);
			
			txtCedula = new JTextField();
			txtCedula.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char carac = e.getKeyChar();
					if(((carac<'0') || (carac>'9')) && ((carac!='-') && (carac!='\b'))) {
						e.consume();
					}
				}
			});
			txtCedula.setForeground(new Color(0, 0, 255));
			txtCedula.setBackground(Color.WHITE);
			txtCedula.setBounds(107, 32, 126, 20);
			panel_1.add(txtCedula);
			txtCedula.setColumns(10);
			
			txtNombre = new JTextField();
			txtNombre.setBackground(Color.WHITE);
			txtNombre.setForeground(new Color(0, 0, 255));
			txtNombre.setColumns(10);
			txtNombre.setBounds(107, 81, 126, 20);
			panel_1.add(txtNombre);
			
			txtDireccion = new JTextField();
			txtDireccion.setForeground(new Color(0, 0, 255));
			txtDireccion.setBackground(Color.WHITE);
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(455, 32, 126, 20);
			panel_1.add(txtDireccion);
			
			txtTelefono = new JTextField();
			txtTelefono.addKeyListener(new KeyAdapter() {
				@Override
				public void keyTyped(KeyEvent e) {
					char carac = e.getKeyChar();
					if(((carac<'0') || (carac>'9')) && ((carac!='(') && (carac!='\b') && (carac!=')') && (carac!='-') && (carac!='+'))) {
						e.consume();
					}
				}
			});
			txtTelefono.setBackground(Color.WHITE);
			txtTelefono.setForeground(new Color(0, 0, 255));
			txtTelefono.setColumns(10);
			txtTelefono.setBounds(455, 81, 126, 20);
			panel_1.add(txtTelefono);
			
			JPanel panel_2 = new JPanel();
			panel_2.setForeground(Color.BLACK);
			panel_2.setBackground(new Color(224, 255, 255));
			panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Seleccione el tipo de Usuario", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_2.setBounds(10, 155, 591, 74);
			panel.add(panel_2);
			panel_2.setLayout(null);
			
			rdbMedico = new JRadioButton("Medico");
			rdbMedico.setBackground(new Color(224, 255, 255));
			rdbMedico.setForeground(Color.BLACK);
			rdbMedico.setSelected(true);
			rdbMedico.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					rdbMedico.setSelected(true);
					rdbAdministrativo.setSelected(false);
					
					panel_Medico.setVisible(true);
					panel_Administrativo.setVisible(false);
					
					lblContrasena_admin.setVisible(false);
					lblCorreo_admin.setVisible(false);

					txtContrasenna_admin.setVisible(false);
					txtUsuario_admin.setVisible(false);
					
					
					lblUsuario_vendedor.setVisible(true);
					txtUsuario_vendedor.setVisible(true);
					lblContrasenna_vendedor.setVisible(true);
					txtContrasenna_Vendedor.setVisible(true);
					
				}
			});
			rdbMedico.setBounds(124, 30, 109, 23);
			panel_2.add(rdbMedico);
			
			rdbAdministrativo = new JRadioButton("Administrador");
			rdbAdministrativo.setForeground(Color.BLACK);
			rdbAdministrativo.setBackground(new Color(224, 255, 255));
			rdbAdministrativo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					rdbMedico.setSelected(false);
					rdbAdministrativo.setSelected(true);
					
					panel_Medico.setVisible(false);
					panel_Administrativo.setVisible(true);
					
					lblContrasena_admin.setVisible(true);
					lblCorreo_admin.setVisible(true);

					txtContrasenna_admin.setVisible(true);
					txtUsuario_admin.setVisible(true);
					
					
					lblUsuario_vendedor.setVisible(false);
					txtUsuario_vendedor.setVisible(false);
					lblContrasenna_vendedor.setVisible(false);
					txtContrasenna_Vendedor.setVisible(false);
					
				}
			});
			rdbAdministrativo.setBounds(357, 30, 109, 23);
			panel_2.add(rdbAdministrativo);
			
			panel_Administrativo = new JPanel();
			panel_Administrativo.setForeground(Color.DARK_GRAY);
			panel_Administrativo.setBackground(new Color(224, 255, 255));
			panel_Administrativo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Espec\u00EDfica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel_Administrativo.setBounds(10, 240, 591, 95);
			panel.add(panel_Administrativo);
			panel_Administrativo.setLayout(null);
			
			lblCorreo_admin = new JLabel("Usuario:");
			lblCorreo_admin.setBackground(new Color(224, 255, 255));
			lblCorreo_admin.setForeground(new Color(0, 0, 0));
			
			lblCorreo_admin.setBounds(10, 45, 93, 14);
			lblCorreo_admin.setVisible(false);
			panel_Administrativo.add(lblCorreo_admin);
			lblContrasena_admin = new JLabel("Contrase\u00F1a:");
		
			lblContrasena_admin.setForeground(new Color(0, 0, 0));
			lblContrasena_admin.setBackground(new Color(224, 255, 255));
			lblContrasena_admin.setBounds(351, 45, 119, 14);
			lblContrasena_admin.setVisible(false);
			panel_Administrativo.add(lblContrasena_admin);
			
			txtUsuario_admin = new JTextField();
			txtUsuario_admin.setForeground(new Color(0, 0, 255));
			txtUsuario_admin.setBackground(new Color(255, 255, 255));
			txtUsuario_admin.setBounds(113, 40, 93, 20);
			txtUsuario_admin.setVisible(false);
			panel_Administrativo.add(txtUsuario_admin);
			txtUsuario_admin.setColumns(10);
			
			txtContrasenna_admin = new JTextField();
			txtContrasenna_admin.setForeground(new Color(0, 0, 255));
			txtContrasenna_admin.setBackground(new Color(255, 255, 255));
			txtContrasenna_admin.setColumns(10);
			txtContrasenna_admin.setBounds(467, 42, 93, 20);
			txtContrasenna_admin.setVisible(false);
			panel_Administrativo.add(txtContrasenna_admin);
					
					panel_Medico = new JPanel();
					panel_Medico.setBounds(10, 240, 591, 95);
					panel.add(panel_Medico);
					panel_Medico.setForeground(Color.DARK_GRAY);
					panel_Medico.setBackground(new Color(224, 255, 255));
					panel_Medico.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Informaci\u00F3n Espec\u00EDfica", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
					panel_Medico.setLayout(null);
					
					lblUsuario_vendedor = new JLabel("Usuario:");
					
					lblUsuario_vendedor.setForeground(Color.BLACK);
					lblUsuario_vendedor.setBackground(Color.BLACK);
					lblUsuario_vendedor.setBounds(10, 43, 93, 14);
					panel_Medico.add(lblUsuario_vendedor);
					
					txtUsuario_vendedor = new JTextField();
					txtUsuario_vendedor.setForeground(new Color(0, 0, 255));
					txtUsuario_vendedor.setBackground(Color.WHITE);
					txtUsuario_vendedor.setBounds(113, 40, 93, 20);
					panel_Medico.add(txtUsuario_vendedor);
					txtUsuario_vendedor.setColumns(10);
					
					txtContrasenna_Vendedor = new JTextField();
					txtContrasenna_Vendedor.setForeground(new Color(0, 0, 255));
					txtContrasenna_Vendedor.setBackground(Color.WHITE);
					txtContrasenna_Vendedor.setColumns(10);
					txtContrasenna_Vendedor.setBounds(444, 40, 93, 20);
					panel_Medico.add(txtContrasenna_Vendedor);
					
					lblContrasenna_vendedor = new JLabel("Contrase\u00F1a:");
					
							lblContrasenna_vendedor.setForeground(Color.BLACK);
							lblContrasenna_vendedor.setBackground(Color.BLACK);
							lblContrasenna_vendedor.setBounds(335, 43, 99, 14);
							panel_Medico.add(lblContrasenna_vendedor);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setForeground(UIManager.getColor("Button.focus"));
			buttonPane.setBackground(new Color(224, 255, 255));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				
				okButton.setForeground(new Color(0, 255, 0));
				okButton.setBackground(UIManager.getColor("Button.focus"));
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						Usuario aux = null;
						String nombre = txtNombre.getText();
						String cedula = txtCedula.getText();
						String direccion = txtDireccion.getText();
						String telefono = txtTelefono.getText();
						if(txtCedula.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
							JOptionPane.showMessageDialog(null, "Ha dejado espacios vacios en información General!!\nFAVOR DE LLENARLOS CORRECTAMENTE.", "ERROR", JOptionPane.ERROR_MESSAGE);
						}else {
						if(rdbMedico.isSelected()) {

						}
						
						if(rdbAdministrativo.isSelected()) {
							String usuario = txtUsuario_admin.getText();
							String contrasena = txtContrasenna_admin.getText();

						}
						clear();
						JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente al empleado!!", "Información", JOptionPane.INFORMATION_MESSAGE);
						}
					}

	
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				
				cancelButton.setForeground(new Color(255, 0, 0));
				cancelButton.setBackground(UIManager.getColor("Button.focus"));
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	private void clear() {
		txtNombre.setText("");
		txtCedula.setText("");
		txtTelefono.setText("");
		txtDireccion.setText("");
		
		txtContrasenna_admin.setText("");
		txtUsuario_admin.setText("");
		
		txtContrasenna_Vendedor.setText("");
		txtUsuario_vendedor.setText("");
		
	}
}
