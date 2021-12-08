package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


import logico.Clinica;
import logico.Paciente;
import logico.Medico;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class ListadoMedico extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	public static DefaultTableModel modelo;
	public static Object[] fila;
	private JButton btnOK;
	
	Paciente paciente = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListadoPacientes dialog = new ListadoPacientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListadoMedico() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\git\\ProyectoFinall\\Proyecto Final\\2695.png"));
		setTitle("Listado de Medicos");
		setBounds(100, 100, 779, 465);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(224, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(224, 255, 255));
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel.setBounds(0, 41, 763, 352);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 0, 763, 352);
				panel.add(scrollPane);
				{
					
					modelo = new DefaultTableModel();
					String[] columns = {"Cedula","Nombre","Genero", "Fecha de nacimiento","Direccion","Telefono"}; 
					modelo.setColumnIdentifiers(columns);
					table = new JTable();
					table.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							
						}
					});
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.setModel(modelo);
					scrollPane.setViewportView(table);
				}
			}
		}
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(224, 255, 255));
		panel1.setToolTipText("");
		panel1.setBounds(0, 0, 763, 41);
		contentPanel.add(panel1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(224, 255, 255));
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnOK = new JButton("OK");
				btnOK.setActionCommand("OK");
				buttonPane.add(btnOK);
				getRootPane().setDefaultButton(btnOK);
				btnOK.setEnabled(false);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
		CargarTabla();
	}

	private void CargarTabla() {
		modelo.setRowCount(0);
		fila = new Object[modelo.getColumnCount()];
		for(Paciente p : Clinica.getInstance().getMisPacientes()){
			
			Paciente c = (paciente);	
			fila[0]=c.getCedula();
			fila[1]=c.getNombre();
			fila[2]=c.getGenero();
			fila[3]=c.getDiaNacimiento();
			fila[4]=c.getDireccion();
			fila[5]=c.getTelefono();
			modelo.addRow(fila);
		

}}	
}
