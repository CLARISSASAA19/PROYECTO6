import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {
    private JTabbedPane cita;
    private JPanel panel1;
    private JTextField txtnombrepedia;
    private JTextField txtcedupedia;
    private JButton tbtnpedia;
    private JComboBox cbodoctor;
    private JTextField txtnomder;
    private JTextField txtcederm;
    private JComboBox boxderm;
    private JButton btnderma;
    private JTextField txtnomcardio;
    private JTextField txtcedulacardio;
    private JComboBox boxcardiologia;
    private JButton btncardio;
    private JTextField txtbusq;
    private JButton btnbuscar;

        ArrayList<Paciente>pacientes= new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        frame.setContentPane(new Main().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Main() {

        tbtnpedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Paciente p=new Paciente(txtnombrepedia.getText(),txtcedupedia.getText(),cbodoctor.getSelectedItem().toString());
                pacientes.add(p);
                JOptionPane.showMessageDialog(null,"Agendado correctamente su cita Pediátrica. ");

            }
        });




        btnbuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0; i<pacientes.size();i++){
                    if(pacientes.get(i).getCedula().equals(txtbusq.getText())==true){
                        JOptionPane.showMessageDialog(null,"CITA ENCONTRADA"+pacientes.get(i).toString());
                    }else{
                        JOptionPane.showMessageDialog(null,"OH NO!, NO SE HA ENCONTRADO UNA CITA MEDICA, INTENTE DE NUEVO");
                    }
                }

            }
        });
        btnderma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paciente p=new Paciente(txtnomder.getText(),txtcederm.getText(),boxderm.getSelectedItem().toString());
                pacientes.add(p);
                JOptionPane.showMessageDialog(null,"Agendado correctamente su cita Dermatológica.");
            }
        });


        btncardio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paciente p=new Paciente(txtnomcardio.getText(),txtcedulacardio.getText(),boxcardiologia.getSelectedItem().toString());
                pacientes.add(p);
                JOptionPane.showMessageDialog(null,"Agendado correctamente su cita Cardiológica.");

            }
        });
    }



}