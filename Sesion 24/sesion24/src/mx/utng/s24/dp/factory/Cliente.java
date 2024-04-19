package mx.utng.s24.dp.factory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente extends JFrame {
    private JTextField txtNumero1;
    private JTextField txtNumero2;

    public Cliente() {
        super("Sumar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel lblNumero1 = new JLabel("Número 1:");
        JLabel lblNumero2 = new JLabel("Número 2:");

        txtNumero1 = new JTextField();
        txtNumero2 = new JTextField();

        JButton btnSumar = new JButton("Sumar");
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(txtNumero1.getText());
                    double numero2 = Double.parseDouble(txtNumero2.getText());
                    double resultado = numero1 + numero2;
                    JOptionPane.showMessageDialog(Cliente.this, "El resultado de la suma es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(Cliente.this, "Por favor, ingresa números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(lblNumero1);
        panel.add(txtNumero1);
        panel.add(lblNumero2);
        panel.add(txtNumero2);
        panel.add(btnSumar);

        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Cliente();
    }
}