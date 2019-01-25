package edu.agh.cs.jtplab.lab7.zad1;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.plaf.PanelUI;

public class MyFirstWindow extends JFrame{

    /**
     *
     */
    private JMenuItem openFile;
    private JTextArea textArea;

    private static final long serialVersionUID = 1L;
    public MyFirstWindow() {
        super("My Second App");
        setSize(600,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        initComponents();

    }
    private void initComponents() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        openFile = new JMenuItem("Open");
        //openFile.addActionListener(this);
        fileMenu.add(openFile);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        JPanel textPanel = new JPanel();
        textArea = new JTextArea(40,40);
        textArea.setText("Ala ma kota \n Ala ma kota");
        textPanel.add(textArea);
        add(textPanel, BorderLayout.CENTER);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout());

        JPanel testxasas = new JPanel();
        PanelUI ui = testxasas.getUI();
        ui.uninstallUI(new JComponent() {
            @Override
            public void setInheritsPopupMenu(boolean value) {
                super.setInheritsPopupMenu(value);
            }
        });



    }
}
