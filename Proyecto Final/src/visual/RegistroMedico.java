package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import logico.Clinica;
import logico.Medico;
import logico.Paciente;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistroMedico extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtCodigo;
	private JTextField txtEspecialidad;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JTextField txtUsuario;
	private JTextField txtContra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroMedico dialog = new RegistroMedico();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroMedico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\\\HP\\\\git\\\\ProyectoFinall\\\\Proyecto Final\\\\2695.png"));
		setTitle("Registro de Medico");
		setBounds(100, 100, 630, 476);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(224, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Registro de Medico", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(new Color(224, 255, 255));
			panel.setBounds(0, 135, 614, 124);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("Codigo:");
				lblNewLabel.setBounds(10, 65, 67, 14);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Especialidad:");
				lblNewLabel_1.setBounds(308, 65, 78, 14);
				panel.add(lblNewLabel_1);
			}
			{
				txtCodigo = new JTextField();
				txtCodigo.setBounds(61, 62, 174, 20);
				panel.add(txtCodigo);
				txtCodigo.setColumns(10);
			}
			{
				txtEspecialidad = new JTextField();
				txtEspecialidad.setBounds(396, 62, 174, 20);
				panel.add(txtEspecialidad);
				txtEspecialidad.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Datos Personales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(new Color(224, 255, 255));
			panel.setBounds(0, 0, 614, 124);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel_2 = new JLabel("Nombre:");
				lblNewLabel_2.setBounds(10, 55, 64, 14);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Telefono:");
				lblNewLabel_3.setBounds(308, 55, 80, 14);
				panel.add(lblNewLabel_3);
			}
			
			txtNombre = new JTextField();
			txtNombre.setBounds(64, 52, 174, 20);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			{
				txtTelefono = new JTextField();
				txtTelefono.setBounds(372, 52, 174, 20);
				panel.add(txtTelefono);
				txtTelefono.setColumns(10);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Credenciales", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBackground(new Color(224, 255, 255));
			panel.setBounds(0, 270, 614, 118);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel_4 = new JLabel("Usuario:");
				lblNewLabel_4.setBounds(10, 53, 58, 14);
				panel.add(lblNewLabel_4);
			}
			{
				txtUsuario = new JTextField();
				txtUsuario.setBounds(78, 50, 174, 20);
				panel.add(txtUsuario);
				txtUsuario.setColumns(10);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Contrase\u00F1a:");
				lblNewLabel_5.setBounds(307, 53, 79, 14);
				panel.add(lblNewLabel_5);
			}
			{
				txtContra = new JTextField();
				txtContra.setBounds(396, 50, 174, 20);
				panel.add(txtContra);
				txtContra.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton Registrar = new JButton("Registrar");
				Registrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				
				});
				Registrar.setActionCommand("OK");
				buttonPane.add(Registrar);
				getRootPane().setDefaultButton(Registrar);
			}
			{
				JButton Cancelar = new JButton("Cancelar");
				Cancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
					}
				});
				Cancelar.setActionCommand("Cancel");
				buttonPane.add(Cancelar);
			}
		}
	}
}
