package com.rk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JTextArea textArea;
    JTextField textField;

    public FormUtama() {
        super("Memindahkan Fokus JTextArea Dengan TAB");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(100, 100));
        textArea.addKeyListener(new TabListener(textArea));

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(100, 24));

        getContentPane().add(new JScrollPane(textArea), BorderLayout.NORTH);
        getContentPane().add(textField, BorderLayout.SOUTH);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
